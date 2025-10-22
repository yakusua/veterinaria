package org.example.veterinaria;
import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultaVacunacionReptilTest {

    @Test
    void testCostoVacunacionReptilAdulto() {
        Propietario propietario = new Propietario(
                "P003",
                "Carlos",
                "323",
                3,
                null,
                null
        );

        Reptil reptilAdulto = new Reptil(
                "Rango",
                5,
                1.7, //en kg
                "Camaleón",
                "R01",
                propietario,
                28.0,// temp optima
                "SELVA", //habitat
                "BAJA" //nivel peligo
        );

        Consulta consulta = new Consulta(
                15000.0, // valor base
                "C003",
                java.time.LocalDate.now(),
                propietario,
                reptilAdulto
        );
        consulta.setTipoConsulta(TipoConsulta.VACUNACION);
        double costoCalculado = consulta.calcularCosto();
        assertEquals(15000.0, costoCalculado,
                "El costo de vacunación para un reptil adulto debe ser de 15000");
    }
}
