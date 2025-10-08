package org.example.veterinaria.controller;

import org.example.veterinaria.model.*;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ClienteConsultaController {
    Veterinaria veterinaria;

    public ClienteConsultaController(Veterinaria veterinaria){
        this.veterinaria = veterinaria;
    }

    public boolean crearMascota(String nombre, int edad, double peso, String raza, String id,
                                Propietario propietario, String especie){
        return veterinaria.createMascota(nombre, edad, peso, raza, id, propietario, especie);
    }
    public boolean crearConsulta(double valorBase, String id, LocalDate fecha, Propietario propietario, Mascota mascota, TipoConsulta tipoConsulta){
        return veterinaria.addConsulta(valorBase, id, fecha, propietario, mascota, tipoConsulta);
    }
    public boolean crearPropietario(String nombre, String contacto, String direccion, int puntosFidelidad,
                                    Consulta consulta, List<Mascota> mascotas){
        return veterinaria.crearPropietario(nombre, contacto, direccion, puntosFidelidad,direccion, consulta, mascotas);
    }

    public LinkedList<Mascota> obtenerListaMascota(){
        return veterinaria.getListMascotas();
    }
    public LinkedList<Consulta> obtenerListaConsulta(){
        return veterinaria.getListaConsultas();
    }
    public LinkedList<Propietario> obtenerListaPropietario(){
        return veterinaria.getListaPropietarios();
    }

    public boolean eliminarMascota(String id){
        return veterinaria.deleteMascota(id);
    }
    public boolean eliminarConsulta(String id){
        return veterinaria.deleteConsulta(id);
    }
    public boolean eliminarPropietario(String id){
        return veterinaria.deletePropietario(id);
    }

    public boolean actualizarMascota(String id,
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
    ){
        return veterinaria.editarMascota(id, especie, nombre, edad, peso, raza, propietario, p1, p2, p3, p4, p5, tamano, tipoGato);
    }
    public boolean actualizarConsulta(String id, double nuevoValorBase, LocalDate nuevaFecha,
                              Propietario nuevoPropietario, Mascota nuevaMascota, TipoConsulta nuevoTipoConsulta){
        return veterinaria.updateConsulta(id, nuevoValorBase, nuevaFecha, nuevoPropietario, nuevaMascota, nuevoTipoConsulta);

    }
    public boolean actualizarPropietario(String id,
                                         String nombre,
                                         String nuevoContacto,
                                         String nuevaDireccion,
                                         int nuevosPuntos,
                                         Consulta nuevaConsulta,
                                         List<Mascota> nuevasMascotas
    ){
        return veterinaria.updatePropietario(id, nombre, nuevoContacto, nuevaDireccion, nuevosPuntos, nuevaConsulta, nuevasMascotas);
    }
}
