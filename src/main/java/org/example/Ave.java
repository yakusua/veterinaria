package org.example;

public class Ave extends Mascota {
    private String tipoPlumaje;
    private boolean capacidadVuelo;
    private int palabrasImitadas;


    public Ave(String nombre, int edad, double peso, String raza, String id, Propietario propietario,
               String especie, String tipoPlumaje, boolean capacidadVuelo, int palabrasImitadas) {
        super(nombre, edad, peso, raza, id, propietario, especie);
        this.tipoPlumaje = tipoPlumaje;
        this.capacidadVuelo = capacidadVuelo;
        this.palabrasImitadas = palabrasImitadas;

    public Ave(String nombre, int edad, double peso, String raza, String id, Propietario propietario, String especie) {
        super(nombre, edad, peso, raza,id, propietario);

    }

    public boolean isCapacidadVuelo() {
        return capacidadVuelo;
    }

    public void setCapacidadVuelo(boolean capacidadVuelo) {
        this.capacidadVuelo = capacidadVuelo;
    }

    public int getPalabrasImitadas() {
        return palabrasImitadas;
    }

    public void setPalabrasImitadas(int palabrasImitadas) {
        this.palabrasImitadas = palabrasImitadas;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    @Override
    public String getEspecie() {
        return "Ave";
    }
}
