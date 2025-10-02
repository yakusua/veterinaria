package org.example;
import java.util.ArrayList;
import java.util.List;

public abstract class Consulta {
    protected double valorBase;
    protected String id;
    private List<Propietario> propietarios;
    private List<Mascota> mascotas;

    public Consulta(double valorBase, String id, List<Propietario> propietarios, List<Mascota> mascotas) {
        this.valorBase = valorBase;
        this.id = id;
        this.propietarios = propietarios;
        this.mascotas = mascotas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    //funcionalidad 1 Calcular el costo de una consulta según especie, edad y tipo
    public abstract double calcularCostoConsulta(Mascota mascota);
}


