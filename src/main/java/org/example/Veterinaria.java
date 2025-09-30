package org.example;

public class Veterinaria {
    private String nit;
    private String nombre;
    private Mascota[] listMascota;

    //constructor
    public Veterinaria(
            String nit,
            String nombre
    ){
        this.nit = nit;
        this.nombre = nombre;
        listMascota = new Mascota[10];
    }
    // get set nit
    public String getNit(){

        return nit;
    }

    public void setNit(String nit){
        this.nit = nit;
    }

    // get set nombre

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Crud
    //Create mascota
    public boolean createMascota(
            String id,
            String nombre,
            String especie,
            String raza,
            int edad,
            String numPropietario,
            String nombrePropietario
    ){
        Mascota newMascota = new Mascota(id,nombre,especie,raza,edad,numPropietario,nombrePropietario);
        for (int i = 0; i< listMascota.length; i++){
            if (listMascota[i] == null){
                listMascota[i] = newMascota;
                return true;
            }
        }
        return false;
    }


    // Read getList
    public String getListMascotas(){
        String message = "";
        for (Mascota mascota:listMascota){
            if (mascota != null) {
                message += mascota.toString() +"\n";
            }
        }
        return message;
    }
    // Update Mascota
    public boolean UpdateMascota(
            String id,
            String nombre,
            String especie,
            String raza,
            int edad,
            String numPropietario,
            String nombrePropietario
    ){
        Mascota UpdatedMascota = new Mascota(id,nombre,especie,raza,edad,numPropietario,nombrePropietario);
        for (int i = 0; i< listMascota.length; i++){
            if (listMascota[i].getId().equals(id)){
                listMascota[i] = UpdatedMascota;
                return true;
            }
        }
        return false;
    }
    // Delete Mascota
    public boolean DeleteMascota(
            String id
    ){
        for (int i = 0; i< listMascota.length; i++){
            if (listMascota[i].getId().equals(id)){
                listMascota[i] = null;
                return true;
            }
        }
        return false;
    }


}
