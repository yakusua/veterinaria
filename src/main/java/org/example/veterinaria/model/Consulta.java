package org.example.veterinaria.model;
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

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
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
    /*     funcionalidad 3 (Se cambia a Mascota)
        public LocalDate sugerirProximaVacunacion() {
          LocalDate newFecha = fecha;
          LocalDate proximaFecha = null;
           String especie = "";

         if (mascota instanceof Perro || mascota instanceof Gato) {
               proximaFecha = newFecha.plusMonths(12);
               especie = "perro o gato";
           } else if (mascota instanceof Ave) {
             proximaFecha = newFecha.plusMonths(8);
             especie = "ave";
           } else if (mascota instanceof Reptil) {
              proximaFecha = newFecha.plusMonths(18);
            especie = "reptil";
         }
         return fecha;
      }
    */
}


