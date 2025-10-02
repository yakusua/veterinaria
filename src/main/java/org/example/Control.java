package org.example;

import java.util.List;

public class Control extends Consulta {

    public Control(double valorBase,String id, List<Propietario> propietarios, List<Mascota> mascotas) {
        super(valorBase,id, propietarios, mascotas);
    }
    @Override
    public double calcularCostoConsulta (Mascota mascota){
        double costo = getValorBase();

        // según la especie
        switch (mascota.getEspecie().toLowerCase()) {
            case "gato":
                costo *= 1.05;
                break;
            case "perro":
                costo *= 1.1;
                break;
            case "ave":
                costo *= 1.15;
                break;
            case "reptil":
                costo *= 1.20;
                break;
            default:
                break;
        }

        // calcular la edad
        if (mascota.getCategoriaEdad() == CategoriaEdad.CACHORRO) {
            costo *= 1.03;
        } else if (mascota.getCategoriaEdad() == CategoriaEdad.ADULTO) {
            costo *= 1.05;
        }

        // según el tipo control)
        costo *= 1.10;

        return costo;
    }
}
