package org.example.veterinaria;
import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class FechaVacunacionPerroYGatoTest {

    @Test
    void testProximaVacunacionPerroYGato() {
        Propietario propietario = new Propietario(
                "P003",
                "juan",
                "322",
                4,
                null,
                null);
        Perro perro = new Perro(
                "mateo",
                8,// en meses
                7.0,
                "Criollito",
                "P001",
                propietario,
                2,
                3,
                Tamano.MEDIANO);
        Gato gato = new Gato("Goldie",
                10,
                4.5,
                "Criollo",
                "G001",
                propietario);
        LocalDate fechaUltima = LocalDate.of(2025, 10, 02);
        perro.setFecha(fechaUltima);
        gato.setFecha(fechaUltima);
        LocalDate proximaEsperada = fechaUltima.plusMonths(12);
        assertEquals(proximaEsperada, perro.sugerirProximaVacunacion(),
                "La próxima vacunación de un perro debe ser 12 meses después");
        assertEquals(proximaEsperada, gato.sugerirProximaVacunacion(),
                "La próxima vacunación de un gato debe ser 12 meses después");
    }
}
