package org.example;
import java.util.List;
public class Urgencia extends Consulta {

    public Urgencia(double valorBase,String id, List<Propietario> propietarios, List<Mascota> mascotas) {
        super(valorBase, id, propietarios, mascotas);
    }
}