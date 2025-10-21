package org.example.veterinaria.model;

import java.time.LocalDate;

public abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String raza;
    protected String id;
    protected LocalDate fecha;
    private CategoriaEdad categoriaEdad;
    private Propietario propietario;

    public Mascota(String nombre, int edad, double peso, String raza, String id,
                   Propietario propietario) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.id = id;
        this.categoriaEdad = calcularCategoriaEdad();
        this.propietario = propietario;
    }
    // edad por mes
    private CategoriaEdad calcularCategoriaEdad() {
        if (getEdad() < 6) {
            return CategoriaEdad.CACHORRO;
        } else if (getEdad() <= 120) {
            return CategoriaEdad.ADULTO;
        } else {
            return CategoriaEdad.SENIOR;
        }
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public abstract CategoriaEdad getCategoriaEdad();


    public void setEdad(int edad) {
        this.edad = edad;
        this.categoriaEdad = calcularCategoriaEdad();
    }

    public abstract String getEspecie();

    // funcionalidad 3 (se corrige para el test de vacunación)
    public LocalDate sugerirProximaVacunacion() {
        if (this instanceof Perro || this instanceof Gato) {
            return fecha.plusMonths(12);
        } else if (this instanceof Ave) {
            return fecha.plusMonths(8);
        } else if (this instanceof Reptil) {
            return fecha.plusMonths(18);
        }
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
