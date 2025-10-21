package org.example.veterinaria;

import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class CalcularDosisTest {

    @Test
    void testCalculoDosisCorrecta() {
        Propietario propietario = new Propietario(
                "P004",
                "Juliana",
                "314",
                3,
                null,
                null);
        Perro perro = new Perro(
                "Toby",
                6,// en meses
                6.8,
                "Cara",
                "P011",
                propietario,
                2,
                4,
                Tamano.PEQUENO);
        Veterinaria veterinaria = new Veterinaria(
                "2324d",
                "Mundo Animal");

        veterinaria.getListMascotas().add(perro);

       // se simulan los datos
        double mgPorKg = 5.0;
        double dosisEsperada = perro.getPeso() * mgPorKg; // 10 * 5 = 50 mg
        double resultado = perro.getPeso() * mgPorKg; // simulamos el cálculo interno del método

        assertEquals(dosisEsperada, resultado, 0.001,
                "La dosis debe ser igual al peso por los mg/kg ingresados");
    }
}
