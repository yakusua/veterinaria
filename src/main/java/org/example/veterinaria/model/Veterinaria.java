package org.example.veterinaria.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Veterinaria {

    private String nit;
    private String nombre;
    private LinkedList<Mascota> listMascotas;
    private LinkedList<Consulta> listConsultas;
    private LinkedList<Propietario> listaPropietarios;

    public Veterinaria(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        this.listMascotas = new LinkedList<>();
        this.listConsultas = new LinkedList<>();
        this.listaPropietarios = new LinkedList<>();
    }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LinkedList<Mascota> getListMascotas() { return listMascotas; }

    public boolean createMascota(String nombre, int edad, double peso, String raza, String id,
                                 Propietario propietario, String especie) {

        switch (especie.toUpperCase()) {
            case "PERRO":
                listMascotas.add(new Perro(nombre, edad, peso, raza, id, propietario, 0, 0, Tamano.MEDIANO));
                break;
            case "GATO":
                listMascotas.add(new Gato(nombre, edad, peso, raza, id, propietario, 0, 10, TipoGato.DOMESTICO));
                break;
            case "REPTIL":
                listMascotas.add(new Reptil(nombre, edad, peso, raza, id, propietario, 30, "normal", "normal"));
                break;
            case "AVE":
                listMascotas.add(new Ave(nombre, edad, peso, raza, id, propietario, "normal", true, 0));
                break;
            default:
                return false;
        }
        return true;
    }

    public boolean editarMascota(
            String id,
            String especie,
            String nombre,
            int edad,
            double peso,
            String raza,
            Propietario propietario,
            int p1,
            int p2,
            int p3,
            String p4,
            boolean p5,
            Tamano tamano,
            TipoGato tipoGato
    ) {
        // Buscar índice de la mascota con ese ID
        for (int i = 0; i < listMascotas.size(); i++) {
            Mascota mascota = listMascotas.get(i);
            if (mascota.getId().equals(id)) {

                Mascota nuevaMascota = switch (especie.toLowerCase()) {
                    case "perro" -> new Perro(nombre, edad, peso, raza, id, propietario, p1, p2, tamano);
                    case "gato" -> new Gato(nombre, edad, peso, raza, id, propietario, p1, p2, tipoGato);
                    case "reptil" -> new Reptil(nombre, edad, peso, raza, id, propietario, p3, p4, "desconocido");
                    case "ave" -> new Ave(nombre, edad, peso, raza, id, propietario, p4, p5, p3);
                    default -> null;
                };

                if (nuevaMascota != null) {
                    listMascotas.set(i, nuevaMascota); // Reemplaza en el mismo espacio
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteMascota(String id) {
        return listMascotas.removeIf(m -> m.getId().equals(id));
    }
    public boolean addConsulta(double valorBase, String id, LocalDate fecha, Propietario propietario, Mascota mascota, TipoConsulta tipoConsulta) {
        for (Consulta consulta : listConsultas) {
            if (consulta.getId().equals(id)) {
                return false;
            }
        }

        Consulta nuevaConsulta = new Consulta(valorBase, id, fecha, propietario, mascota);
        nuevaConsulta.setTipoConsulta(tipoConsulta);
        listConsultas.add(nuevaConsulta);
        return true;
    }

    public LinkedList<Consulta> getListaConsultas() {
        return listConsultas;
    }

    public Consulta buscarConsultaPorId(String id) {
        for (Consulta consulta : listConsultas) {
            if (consulta.getId().equals(id)) {
                return consulta;
            }
        }
        return null;
    }

    public boolean updateConsulta(String id, double nuevoValorBase, LocalDate nuevaFecha,
                                  Propietario nuevoPropietario, Mascota nuevaMascota, TipoConsulta nuevoTipoConsulta) {
        for (int i = 0; i < listConsultas.size(); i++) {
            Consulta consulta = listConsultas.get(i);
            if (consulta.getId().equals(id)) {
                Consulta consultaActualizada = new Consulta(nuevoValorBase, id, nuevaFecha, nuevoPropietario, nuevaMascota);
                consultaActualizada.setTipoConsulta(nuevoTipoConsulta);
                listConsultas.set(i, consultaActualizada);
                return true;
            }
        }
        return false;
    }

    public boolean deleteConsulta(String id) {
        for (int i = 0; i < listConsultas.size(); i++) {
            if (listConsultas.get(i).getId().equals(id)) {
                listConsultas.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean crearPropietario(String id, String nombre, String contacto, int puntosFidelidad,
                                    String direccion,Consulta consulta, List<Mascota> mascotas) {
        for (Propietario p : listaPropietarios) {
            if (p.getNombre().equalsIgnoreCase(nombre) && p.getContacto().equalsIgnoreCase(contacto)) {
                return false; // Ya existe
            }
        }

        Propietario nuevoPropietario = new Propietario(id ,nombre, contacto, direccion, puntosFidelidad, consulta, mascotas);
        listaPropietarios.add(nuevoPropietario);
        return true;
    }
    public LinkedList<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public Propietario buscarPropietarioPorNombre(String nombre) {
        for (Propietario p : listaPropietarios) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public boolean updatePropietario(String id,
                                     String nombre,
                                     String nuevoContacto,
                                     String nuevaDireccion,
                                     int nuevosPuntos,
                                     Consulta nuevaConsulta,
                                     List<Mascota> nuevasMascotas) {
        for (int i = 0; i < listaPropietarios.size(); i++) {
            Propietario p = listaPropietarios.get(i);

            if (p.getNombre().equalsIgnoreCase(id)) {
                Propietario propietarioActualizado = new Propietario(
                        p.getId(),
                        nombre,
                        nuevoContacto,
                        nuevaDireccion,
                        nuevosPuntos,
                        nuevaConsulta,
                        nuevasMascotas
                );

                listaPropietarios.set(i, propietarioActualizado);
                return true;
            }
        }
        return false; // No encontrado
    }
    public boolean deletePropietario(String id) {
        for (int i = 0; i < listaPropietarios.size(); i++) {
            if (listaPropietarios.get(i).getNombre().equalsIgnoreCase(id)) {
                listaPropietarios.remove(i);
                return true;
            }
        }
        return false;
    }

    /* funcionalidad 2 Estimar la dosis de un medicamento
 con base en el peso del animal (peso × miligramos por kilo)*/

    public double calcularDosis(String idMascota) {
        double miliXKilo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los mg por kg del medicamento:"));

        for (int i = 0; i < listMascotas.size(); i++) {
            Mascota mascota = listMascotas.get(i);

            if (mascota.getId().equals(idMascota)) {
                double dosis = mascota.getPeso() * miliXKilo;
                JOptionPane.showMessageDialog(null,
                        "La dosis estimada para "+ mascota.getNombre() + " es de: " + dosis + " mg");
                return dosis;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró una mascota con el ID proporcionado.");
        return -1; // en caso de no hallarla
    }
}
