package org.example.veterinaria;
import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoAveAdultaTest {

    @Test
    void testDescuentoConsultaControlAveAdulta() {
        Propietario propietario = new Propietario(
                "Lucía",
                "456",
                "323",
                2,
                null,
                null);
        Ave aveAdulta = new Ave(
                "Piolín",
                3, // años
                1.2,
                "Pajarito",
                "A001",
                propietario,
                "Abundante",
                true,
                0);

        Consulta consulta = new Consulta(
                10000.0, // costo base
                "C002",
                java.time.LocalDate.now(),
                propietario,
                aveAdulta);
        consulta.setTipoConsulta(TipoConsulta.CONTROL);

        double costoCalculado = consulta.calcularCosto();

        // se esoera 10000 - 15% = 85000
        assertEquals(85000.0, costoCalculado,
                "El costo de una consulta de control para un ave adulta debe ser 85000");
    }

    @Test
    void testSinDescuentoAveJoven() {
        Propietario propietario = new Propietario(
                "Carlos", "789", "Calarcá", 1, null, null
        );

        Ave aveJoven = new Ave(
                "Luna",
                1,
                0.9,
                "Loro",
                "A002",
                propietario,
                "poco",
                true,
               10);

        Consulta consulta = new Consulta(
                10000.0,
                "C003",
                java.time.LocalDate.now(),
                propietario,
                aveJoven);

        consulta.setTipoConsulta(TipoConsulta.CONTROL);
        double costoCalculado = consulta.calcularCosto();

        // es igual al base
        assertEquals(10000.0, costoCalculado,
                "El costo para un ave joven en control no debe tener descuento");
    }
}
