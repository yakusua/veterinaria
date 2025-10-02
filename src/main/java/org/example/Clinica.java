package org.example;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nombre;
    private String nit;
    private List<Propietario> propietarios;
    private List<Mascota> mascotas;
    private List<Consulta> consultas;
    private List<AtencionMedica> atencionesMedicas;

    public Clinica(String nombre, String nit,List<Propietario> propietarios, List<Mascota> mascotas, List<Consulta> consulta, List<AtencionMedica> atencionesMedicas) {
        this.nombre = nombre;
        this.nit = nit;
        this.propietarios = propietarios;
        this.mascotas = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.atencionesMedicas = new ArrayList<>();
    }

    public void registrarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void registrarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<AtencionMedica> getAtencionesMedicas() {
        return atencionesMedicas;
    }

    public void setAtencionesMedicas(List<AtencionMedica> atencionesMedicas) {
        this.atencionesMedicas = atencionesMedicas;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
