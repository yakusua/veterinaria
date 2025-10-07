package org;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nombre;
    private String nit;
    private List<Propietario> propietarios;
    private List<Mascota> mascotas;
    private List<Consulta> consultas;

    public Clinica(String nombre, String nit, List<Propietario> propietarios, List<Mascota> mascotas, List<Consulta> consulta) {
        this.nombre = nombre;
        this.nit = nit;
        this.propietarios = propietarios;
        this.mascotas = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }


/* funcionalidad 2 Estimar la dosis de un medicamento
 con base en el peso del animal (peso × miligramos por kilo)*/
    public double calcularDosis(String idMascota) {
        double miliXKilo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los mg por kg del medicamento:"));

        for (int i = 0; i < mascotas.size(); i++) {
            Mascota mascota = mascotas.get(i);

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

