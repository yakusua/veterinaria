package org.example.veterinaria;

import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class FechaVacunacionAveTest {

    @Test
    void testProximaVacunacionAve() {
        Propietario propietario = new Propietario(
                "P005",
                "pedro",
                "324",
                2,
                null,
                null);
        Ave ave = new Ave(
                "Piolín",
                3, // años
                1.2,
                "Pajarito",
                "A001",
                propietario,
                "Abundante",
                true,
                0
        );

        LocalDate fechaUltima = LocalDate.of(2025, 10, 02);
        ave.setFecha(fechaUltima);
        LocalDate proximaEsperada = fechaUltima.plusMonths(12);
        assertEquals(proximaEsperada, ave.sugerirProximaVacunacion(),
                "La próxima vacunación de un perro debe ser 12 meses después");
    }
}
