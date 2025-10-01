package org.example;
import java.util.Date;

public class AtencionMedica {
    private String id;
    private Date fecha;
    private String animalAtendido;
    private String tipoConsulta;
    private double valorBase;
    private double costoFinal;
    private Mascota mascota;
    private Consulta consulta;

    public AtencionMedica(String id, Date fecha, String animalAtendido, String tipoConsulta, double valorBase,
                          double costoFinal, Mascota mascota, Consulta consulta) {
        this.id = id;
        this.fecha = fecha;
        this.animalAtendido = animalAtendido;
        this.tipoConsulta = tipoConsulta;
        this.valorBase = valorBase;
        this.costoFinal = costoFinal;
        this.mascota = mascota;
        this.consulta = consulta;
    }

    public String getAnimalAtendido() {
        return animalAtendido;
    }

    public void setAnimalAtendido(String animalAtendido) {
        this.animalAtendido = animalAtendido;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public Consulta getConsulta() {return consulta;}

    public void setConsulta(Consulta consulta) {this.consulta = consulta;}

    public Mascota getMascota() {return mascota;}

    public void setMascota(Mascota mascota) {this.mascota = mascota;}

    public String resumenAtencion() {
        return "Atención #" + id +
                "\nFecha: " + fecha +
                "\nMascota: " + mascota.getNombre() +
                "\nConsulta: " + consulta.getClass()+
                "\nValor Base: " + valorBase +
                "\nCosto Final: " + costoFinal;
    }
}
