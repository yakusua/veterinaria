package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultaGeneralTest {

    @Test
    void testCostoConsultaPerroJoven() {
        Propietario propietario = new Propietario("Miguel", "123", "Armenia", 4, null, null);

        Perro perroJoven = new Perro(
                "Firulais", 8, 12.0, "Beagle", "P001",
                CategoriaEdad.JOVEN,
                propietario,
                2,
                Tamano.MEDIANO
        );

        Consulta consulta = new Consulta(
                30000.0,
                "C001",
                java.time.LocalDate.now(),
                perroJoven,
                TipoConsulta.GENERAL
        );

        double costoCalculado = consulta.calcularCosto();

        // Valor base 30000 + 10% = 33000
        assertEquals(33000.0, costoCalculado);
    }
}
