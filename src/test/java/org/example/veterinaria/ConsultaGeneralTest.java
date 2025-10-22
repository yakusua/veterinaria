package org.example.veterinaria;
import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultaGeneralTest {

    @Test
    void testCostoConsultaPerroCachorro() {
        Propietario propietario = new Propietario("123", "Miguel", "322", 4, null, null);

        Perro perroCachorro = new Perro(
                "mateo",
                8,// en meses
                0,
                "Criollito",
                null,
                propietario,
                2,
                3,
                Tamano.PEQUENO
        );

        Consulta consulta = new Consulta(
                33000.0,
                null,
                java.time.LocalDate.now(),
                propietario,
                perroCachorro
        );

        // con el set se pone el .Tipo de consulta (sino no sé)
        consulta.setTipoConsulta(TipoConsulta.GENERAL);
        double costoCalculado = consulta.calcularCosto();
        // valor base de 30.000 + 10% = 33.000
        assertEquals(33000.0, costoCalculado,
                "El costo de una consulta general para un perro cachorro debe ser 33000");
    }
}