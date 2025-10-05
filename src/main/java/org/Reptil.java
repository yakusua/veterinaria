package org;

public class Reptil extends Mascota {
    private double temperatura;
    private TipoHabitat tipoHabitat; //relación con los ENUMS
    private Peligrosidad peligrosidad;

    public Reptil(String nombre, int edad, double peso, String raza, String id, Propietario propietario,
                  double temperatura, String tipoHabitat, String peligrosidad) {
        super(nombre, edad, peso, raza,id, propietario);
    }

    public Peligrosidad getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(Peligrosidad peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public TipoHabitat getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(TipoHabitat tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String getEspecie() {
        return "Reptil";
    }
}
