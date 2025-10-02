package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultaGeneralTest {

    @Test
    void testCostoConsultaPerroJoven() {
        Propietario propietario = new Propietario("Miguel", "123","Armenia",4,null,null);
        Mascota perro = new Perro("Candy", 6, 12.0, "Criollito", "M1", propietario);

        Consulta consulta = new General(50000, "C1");
        double costo = consulta.calcularCostoConsulta(perro);
        //comprobar
        assertEquals(50000, costo, "El costo de una consulta general para un perro joven debe ser igual al valor base.");
    }
}
