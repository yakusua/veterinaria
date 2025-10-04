package org.example;

public class Gato extends Mascota {
    private double horasSueno;
    private int nivelIndependencia;
    private TipoGato tipoGato;


    public Gato(String nombre, int edad, double peso, String raza, String id, Propietario propietario,
                String especie, double horasSueno, int nivelIndependencia, TipoGato tipoGato) {
        super(nombre, edad, peso, raza, id, propietario, "");

    public Gato(String nombre, int edad, double peso, String raza, String id, Propietario propietario, String especie) {
        super(nombre, edad, peso, raza, id, propietario);

    }

    public double getHorasSueno() {
        return horasSueno;
    }

    public void setHorasSueno(double horasSueno) {
        this.horasSueno = horasSueno;
    }

    public TipoGato getTipoGato() {
        return tipoGato;
    }

    public void setTipoGato(TipoGato tipoGato) {
        this.tipoGato = tipoGato;
    }

    public int getNivelIndependencia() {
        return nivelIndependencia;
    }

    public void setNivelIndependencia(int nivelIndependencia) {
        this.nivelIndependencia = nivelIndependencia;
    }

    @Override
    public String getEspecie() {
        return "Gato";
    }

}
