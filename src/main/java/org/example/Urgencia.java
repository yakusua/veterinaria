package org.example;
import java.util.List;
public class Urgencia extends Consulta {

    public Urgencia(double valorBase,String id, List<Propietario> propietarios, List<Mascota> mascotas) {
        super(valorBase, id, propietarios, mascotas);
    }
    @Override
    public double calcularCostoFinal(Mascota mascota) {
        double costo = getValorBase();

        // Especie
        switch (mascota.getEspecie().toLowerCase()) {
            case "gato" -> costo *= 1.05;
            case "ave" -> costo *= 1.15;
            case "reptil" -> costo *= 1.20;
        }

        // Edad
        if (mascota.getCategoriaEdad() == CategoriaEdad.ADULTO) {
            costo *= 1.10;
        } else if (mascota.getCategoriaEdad() == CategoriaEdad.SENIOR) {
            costo *= 1.20;
        }

        // Tipo de consulta (Urgencia = +50%)
        costo *= 1.50;

        return costo;
    }
}