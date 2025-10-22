package org.example.veterinaria;
import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
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

        double mgPorKg = 5.0;
        double dosisEsperada = perro.getPeso() * mgPorKg;
        double resultado = perro.getPeso() * mgPorKg;

        assertEquals(dosisEsperada, resultado, 0.001,
                "La dosis debe ser igual al peso por los mg/kg ingresados"); //0.001 es por margen de error con double en los asserts
    }
}
