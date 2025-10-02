package org.example;

import java.util.List;

public class Propietario {
    private String nombre;
    private String contacto;
    private String direccion;
    private int puntosFidelidad;
    private Consulta consulta;
    private List<Mascota> mascotas;

    public Propietario( String nombre, String contacto, String direccion, int puntosFidelidad,
                        Consulta consulta, List<Mascota> mascotas ) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.puntosFidelidad = puntosFidelidad;
        this.consulta = consulta;
        this.mascotas = mascotas;
    }


    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(int puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
