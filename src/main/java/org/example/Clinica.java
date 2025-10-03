package org.example;

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
}

