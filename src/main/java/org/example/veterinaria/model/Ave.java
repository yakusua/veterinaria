package org.example.veterinaria.model;

public class Ave extends Mascota {
    private String tipoPlumaje;
    private boolean capacidadVuelo;
    private int palabrasImitadas;


    public Ave(String nombre, int edad, double peso, String raza, String id, Propietario propietario
            , String tipoPlumaje, boolean capacidadVuelo, int palabrasImitadas) {
        super(nombre, edad, peso, raza, id, propietario);
        this.tipoPlumaje = tipoPlumaje;
        this.capacidadVuelo = capacidadVuelo;
        this.palabrasImitadas = palabrasImitadas;
    }

    public Ave(String nombre, int edad, double peso, String raza, String id, Propietario propietario) {
        super(nombre, edad, peso, raza,id, propietario);

    }

    public boolean getCapacidadVuelo() {
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
