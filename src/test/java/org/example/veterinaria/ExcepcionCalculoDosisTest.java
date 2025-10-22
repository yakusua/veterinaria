package org.example.veterinaria;
import org.example.veterinaria.model.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

public class ExcepcionCalculoDosisTest {

    @Test
    void calcularDosisExcepcion() {
        // Preparación
        Veterinaria veterinaria = new Veterinaria("999", "AnimalCare");
        Propietario propietario = new Propietario("P001", "Miguel", "310", 5, null, null);
        Mascota gato = new Gato("Michi", 5, 0, "Persa", "G001", propietario); // peso inválido

        veterinaria.setListMascotas(new LinkedList<>());
        veterinaria.getListMascotas().add(gato);

        // Verificación
        assertThrows(IllegalArgumentException.class, () -> {
            veterinaria.calcularDosis("G001", 2.5); // 2.5 mg/kg, pero el peso es 0
        });
    }
    //falla si se prueba el primer metodo con JOption
    //funciona con el metodo con sobre carga
}
