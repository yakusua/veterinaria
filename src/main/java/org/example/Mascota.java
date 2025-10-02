package org.example;

public abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String raza;
    protected String id;
    private CategoriaEdad categoriaEdad;
    private Propietario propietario;
    private String especie; // para relacionar con las subclases

    public Mascota(String nombre, int edad, double peso, String raza, String id,
                   Propietario propietario, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.id = id;
        this.categoriaEdad = calcularCategoriaEdad();
        this.propietario = propietario;
        this.especie = especie;
    }
    // mostrar la edad según los meses cumplidos
    private CategoriaEdad calcularCategoriaEdad() {
        if (edad< 12) return CategoriaEdad.CACHORRO;
        else return CategoriaEdad.ADULTO;
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

    public CategoriaEdad getCategoriaEdad() {
        return categoriaEdad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
        this.categoriaEdad = calcularCategoriaEdad();
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public abstract String getEspecie();

}
