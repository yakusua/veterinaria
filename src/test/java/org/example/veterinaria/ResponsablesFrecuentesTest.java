package org.example.veterinaria;

import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResponsablesFrecuentesTest {

    @Test
    void obtenerResponsablesMasFrecuentesPorPuntos() {
        Veterinaria veterinaria = new Veterinaria("999", "AnimalCare");

        Propietario miguel = new Propietario("P001", "Miguel", "310", 3, null, null);
        Propietario laura = new Propietario("P002", "Laura", "314", 2, null, null);
        Propietario juan = new Propietario("P003", "Juan", "323", 3, null, null);

        veterinaria.getListaPropietarios().add(miguel);
        veterinaria.getListaPropietarios().add(laura);
        veterinaria.getListaPropietarios().add(juan);

        LinkedList<Propietario> frecuentes = veterinaria.obtenerResponsablesMasFrecuentes(); //5ta funcionalidad en Veterinaria

        assertEquals(2, frecuentes.size());
        assertTrue(frecuentes.contains(juan));
        assertTrue(frecuentes.contains(miguel));

    }
}
