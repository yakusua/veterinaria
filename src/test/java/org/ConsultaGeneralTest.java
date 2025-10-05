package org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultaGeneralTest {

    @Test
    void testCostoConsultaPerroCachorro() {
        Propietario propietario = new Propietario("Miguel", "123", "Armenia", 4, null, null);

        Perro perroCachorro = new Perro(
                "mateo",
                8,// en meses, menor a 12
                7.0,
                "Criollito",
                "P001",
                propietario,
                2,
                3,
                Tamano.PEQUENO
        );

        Consulta consulta = new Consulta(
                30000.0,
                "C001",
                java.time.LocalDate.now(),
                propietario,
                perroCachorro
        );

        // con el set se pone el .Tipo de consulta (sino no sé)
        consulta.setTipoConsulta(TipoConsulta.GENERAL);
        double costoCalculado = consulta.calcularCosto();
        // Valor base $30.000 + 10% = 33000
        assertEquals(33000.0, costoCalculado,
                "El costo de una consulta general para un perro cachorro debe ser 33000");
    }
}
