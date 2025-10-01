package org.example;


import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
Ingrese una accion:
1 - crear mascota
2 - mostrar lista
3 - editar mascota (con id)
4 - eliminar mascota (con id)
 */

public class Main {

    public static void main(String[] args) {
        int currentId = 0;
        boolean loopSystem = true;
        String vetName;
        String vetNit;
        vetName = JOptionPane.showInputDialog(null, "ingrese el nombre de su veterinaria");
        vetNit = JOptionPane.showInputDialog(null, "ingrese el nit");
        Veterinaria veterinaria = new Veterinaria(vetNit,vetName);
        while (loopSystem) {
            String optionVet = JOptionPane.showInputDialog(
                    null,
                    "Ingrese una accion:\n" +
                            "1 - crear mascota\n" +
                            "2 - mostrar lista\n" +
                            "3 - editar mascota (con id)\n" +
                            "4 - eliminar mascota (con id)\n" +
                            "5 - close"
            );
            switch (Integer.parseInt(optionVet)) {
                case 1:
                    currentId++;
                    String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre");
                    String especie = JOptionPane.showInputDialog(null, "ingrese la especie");
                    String raza = JOptionPane.showInputDialog(null, "ingrese la raza");
                    String edad = JOptionPane.showInputDialog(null, "ingrese la edad (solo numeros)");
                    String nombrePropietario = JOptionPane.showInputDialog(null, "ingrese el  nombre del propietario");
                    String numPropietario = JOptionPane.showInputDialog(null, "ingrese el numero del propietario");
                    veterinaria.createMascota(
                            String.valueOf(currentId),
                            edad,
                            peso,
                            raza,
                            Integer.parseInt(edad),
                            nombrePropietario,
                            numPropietario
                    );
                    break;
                case 2:
                    String listaMascotas =veterinaria.getListMascotas();
                    JOptionPane.showMessageDialog(null, listaMascotas);
                    break;
                case 3:
                    currentId++;
                    String id = JOptionPane.showInputDialog(null,"ingrese el id de la mascota a editar");
                    String nombreEdit = JOptionPane.showInputDialog(null, "ingrese el nombre");
                    String especieEdit = JOptionPane.showInputDialog(null, "ingrese la especie");
                    String razaEdit = JOptionPane.showInputDialog(null, "ingrese la raza");
                    String edadEdit = JOptionPane.showInputDialog(null, "ingrese la edad");
                    String nombrePropietarioEdit = JOptionPane.showInputDialog(null, "ingrese el  nombre del propietario");
                    String numPropietarioEdit = JOptionPane.showInputDialog(null, "ingrese el numero del propietario");
                    veterinaria.UpdateMascota(id,nombreEdit,especieEdit,razaEdit, Integer.parseInt(edadEdit),numPropietarioEdit,nombrePropietarioEdit);
                    break;
                case 4:
                    String idDelete = JOptionPane.showInputDialog(null,"ingrese el id de la mascota a editar");
                    veterinaria.DeleteMascota(idDelete);
                    break;
                case 5:
                    loopSystem = false;
            }
        }

    }

}