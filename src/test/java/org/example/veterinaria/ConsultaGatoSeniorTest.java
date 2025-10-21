package org.example.veterinaria;

import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultaGatoSeniorTest {

    @Test
    void calcularCostoUrgenciaGatoSenior() {
        Propietario propietario = new Propietario("P003", "juan", "322", 4, null, null);
        Gato gato = new Gato("Misu", 10, 4.5, "Criollo", "G001", propietario);
        gato.setCategoriaEdad(CategoriaEdad.SENIOR);

        Consulta consulta = new Consulta(
                23000.0, // con el 15% incluido
                "C003",
                LocalDate.now(),
                propietario,
                gato
        );
        consulta.setTipoConsulta(TipoConsulta.URGENCIA);
        double costo = consulta.calcularCosto();
        double esperado = 20000.0 + (20000.0 * 0.15); //con el 15% calculado
        assertEquals(esperado, costo, 0.001, "mensaje"); // assert con double usa un margen de error
    }
}
