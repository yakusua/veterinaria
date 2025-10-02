package org.example;

public class Gato extends Mascota {

    public Gato(String nombre, int edad, double peso, String raza, String id, Propietario propietario, String especie) {
        super(nombre, edad, peso, raza, id, propietario, "");
    }
    @Override
    public String getEspecie() {
        return "Gato";
    }

}
