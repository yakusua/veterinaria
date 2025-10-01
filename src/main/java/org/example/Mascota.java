package org.example;
/*
 id,
 nombre,
 especie,
 raza,
 edad,
 nombrePropietario
 numPropietario.
 
 */
public class Mascota {
    private String id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String numPropietario;
    private String nombrePropietario;

    public Mascota(
            String id,
            String nombre,
            String especie,
            String raza,
            int edad,
            String numPropietario,
            String nombrePropietario
    ) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.numPropietario = numPropietario;
        this.nombrePropietario = nombrePropietario;
    }

    // get set id
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    // get set nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // get set puesto
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }

    // get set correo
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    // get set edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    // get set numPropietario
    public String getNumPropietario(){
        return numPropietario;
    }
    public void setNumPropietario(String numTelefonico){
        this.numPropietario = numTelefonico;
    }

    // get set fechaContratacion
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    public void setNombrePropietario(String fechaContratacion){
        this.nombrePropietario = fechaContratacion;
    }

    // Override toString
    @Override
    public String toString(){
        return "id: " +id+ "  nombre: "+nombre +"  edad: "+edad + "  nombrePropietario: "+nombrePropietario + "  numPropietario: "+numPropietario ;
    }

}
