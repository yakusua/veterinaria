package org;
import java.time.LocalDate;


public class Consulta {
    private double valorBase;
    private String id;
    private LocalDate fecha;
    private Propietario propietario;
    private Mascota mascota;
    private TipoConsulta tipoConsulta;

    public Consulta(double valorBase, String id, LocalDate fecha, Propietario propietario, Mascota mascota) {
        this.valorBase = valorBase;
        this.id = id;
        this.fecha = fecha;
        this.propietario = propietario;
        this.mascota = mascota;
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
            if (perro.getCategoriaEdad() == CategoriaEdad.CACHORRO) {
                costo += valorBase * 0.10; // +10% si es perro joven
            }
        }
        return costo;
    }

}


