package org.example;

import java.util.List;

public class Control extends Consulta {

    public Control(double valorBase,String id, List<Propietario> propietarios, List<Mascota> mascotas) {
        super(valorBase,id, propietarios, mascotas);
    }
/*
    @Override
    public double calcularCostoConsulta() {
        return getValorBase();
    }
*/
}
