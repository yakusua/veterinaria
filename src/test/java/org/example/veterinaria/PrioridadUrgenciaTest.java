package org.example.veterinaria;
import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class PrioridadUrgenciaTest {

    @Test
    void verificarPrioridadUrgencia() {
        Mascota gato = new Gato(
                "Luna",
                10,
                4.5,
                "Persa",
                "G001",
                null);

        Consulta consultaUrgencia = new Consulta(
                0,
                "C001",
                LocalDate.now(),
                null,
                gato);

        consultaUrgencia.setTipoConsulta(TipoConsulta.URGENCIA);
        Consulta consultaGeneral = new Consulta(50000, "C002", LocalDate.now(),null, gato);
        consultaGeneral.setTipoConsulta(TipoConsulta.GENERAL);
        assertEquals(1, consultaUrgencia.getPrioridad(),
                "Las consultas de urgencia deben tener prioridad 1");
        assertTrue(consultaGeneral.getPrioridad() > consultaUrgencia.getPrioridad(),
                "Las consultas generales deben tener menor prioridad que las de urgencia");
    }
}
