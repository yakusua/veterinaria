package org.example;

import java.util.List;

public class Vacunacion extends Consulta{
    public Vacunacion(double valorBase, String id, List<Propietario> propietarios, List<Mascota> mascotas) {
        super(valorBase, id, propietarios, mascotas);
    }
}
