package org.example;
import java.util.List;
import java.time.LocalDate;


public class Consulta {
    private double valorBase;
    private String id;
    private LocalDate fecha;
    private List<Propietario> propietarios;
    private List<Mascota> mascotas;
    private TipoConsulta tipoConsulta;

    public Consulta(double valorBase, String id,LocalDate fecha, List<Propietario> propietarios, List<Mascota> mascotas) {
        this.valorBase = valorBase;
        this.id = id;
        this.fecha = fecha;
        this.propietarios = propietarios;
        this.mascotas = mascotas;
        this.tipoConsulta = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    //funcionalidad 1 Calcular el costo de una consulta según especie, edad y tipo
    public double calcularCosto() {
        double costo = valorBase;

        if (tipoConsulta == TipoConsulta.GENERAL && mascota instanceof Perro perro) {
            if (perro.getCategoriaEdad() == CategoriaEdad.JOVEN) {
                costo += valorBase * 0.10; // +10% si es perro joven
            }
        }

        return costo;
    }
}


