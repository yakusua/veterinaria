package org.example;

import java.util.List;

public class Control extends Consulta {

    public Control(String id, double valorBase, List<Propietario> propietarios, List<Mascota> mascotas) {
        super(id, valorBase, propietarios, mascotas);
    }
/*
    @Override
    public double calcularCostoFinal() {
        return getValorBase();
    }
*/
}
