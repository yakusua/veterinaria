package org.example.veterinaria.model;

import java.time.LocalDate;

public class Perro extends Mascota {
    private int nivelAdiestramiento; // atributos propios
    private int cantidadPaseos;
    private Tamano tamano; // relación con el enum


    public Perro(String nombre, int edad, double peso, String raza, String id, Propietario propietario,
                  int nivelAdiestramiento, int cantidadPaseos, Tamano tamano) {
        super(nombre, edad, peso, raza, id, propietario);

        this.nivelAdiestramiento = nivelAdiestramiento;
        this.cantidadPaseos = cantidadPaseos;
        this.tamano = tamano;
    }

    public int getCantidadPaseos() {
        return cantidadPaseos;
    }

    public void setCantidadPaseos(int cantidadPaseos) {
        this.cantidadPaseos = cantidadPaseos;
    }

    public int getNivelAdiestramiento() {
        return nivelAdiestramiento;
    }

    public void setNivelAdiestramiento(int nivelAdiestramiento) {
        this.nivelAdiestramiento = nivelAdiestramiento;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public CategoriaEdad getCategoriaEdad() {
        return null;
    }

    @Override
    public String getEspecie() {
        return "Perro";
    }

}
