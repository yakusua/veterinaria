package org.example;

public class Perro extends Mascota {
    private int nivelAdiestramiento; // atributos propios
    private int cantidadPaseos;
    private Tamano tamano; // relación con el enum


    public Perro(String nombre, int edad, double peso, String raza, String id,
                 Propietario propietario, int cantidadPaseos, Tamano tamano) {
        super(nombre, edad, peso, raza, id, propietario, "Perro");

        this.cantidadPaseos = cantidadPaseos;
        this.tamano = tamano;

    public Perro(String nombre, int edad, double peso, String raza, String id, Propietario propietario,String especie) {
        super(nombre, edad, peso, raza,id, propietario);

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
    public String getEspecie() {
        return "Perro";
    }
}
