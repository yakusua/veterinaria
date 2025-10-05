package org;

public class Veterinaria {
    private String nit;
    private String nombre;
    private Mascota[] listMascotas;

    public Veterinaria(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        listMascotas = new Mascota[10];
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
    // CREATE mascota
    public boolean createMascota(String nombre, int edad, double peso, String raza, String id, Propietario propietario) {
        // 👇 Como Mascota es abstracta, uso una clase anónima temporal
        Mascota newMascota = new Mascota(nombre, edad, peso, raza, id, propietario) {
            @Override
            public String getEspecie() {
                return "GENERICA";
            }
        };

        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] == null) {
                listMascotas[i] = newMascota;
                return true;
            }
        }
        return false;
    }

    // READ - listar mascotas
    public String getListMascotas() {
        StringBuilder message = new StringBuilder();
        for (Mascota mascota : listMascotas) {
            if (mascota != null) {
                message.append(mascota.toString()).append("\n");
            }
        }
        return message.toString();
    }

    // UPDATE mascota (reemplaza la instancia completa)
    public boolean actualizarMascota(String especie, String nombre, int edad, double peso, String raza, String id) {
        Mascota updatedMascota;

        switch (especie.toUpperCase()) {
            case "PERRO":
                updatedMascota = new Perro(nombre, edad, peso, raza, id, null, 2, 3, Tamano.MEDIANO);
                break;
            case "GATO":
                updatedMascota = new Gato(nombre, edad, peso, raza, id, null,7,2,null);
                break;
            case "AVE":
                updatedMascota = new Ave(nombre, edad, peso, raza, id, null, "sin plumas", true, 4);
                break;
            case "REPTIL":
                updatedMascota = new Reptil(nombre, edad, peso, raza, id, null, 10.2,null,null);
                break;
            default:
                return false; // especie desconocida
        }

        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] != null && listMascotas[i].getId().equals(id)) {
                listMascotas[i] = updatedMascota;
                return true;
            }
        }

        return false;
    }

    // DELETE mascota
    public boolean deleteMascota(String id) {
        for (int i = 0; i < listMascotas.length; i++) {
            if (listMascotas[i] != null && listMascotas[i].getId().equals(id)) {
                listMascotas[i] = null;
                return true;
            }
        }
        return false;
    }
}
