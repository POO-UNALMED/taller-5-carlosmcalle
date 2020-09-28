package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal {
    public static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
    }



    public static void totalPorTipo(){
        System.out.println("Mamiferos: " + (Mamifero.leones+Mamifero.caballos));
        System.out.println("Aves: " + (Ave.aguilas+Ave.halcones));
        System.out.println("Reptiles: " + Reptil.totalAnimales);
        System.out.println("Peces: " + Pez.totalAnimales);
        System.out.println("Anfibios: " + Anfibio.totalAnimales);
    }


    public String toString() {
       String formato = "Mi nombre es " + getNombre() + ", tengo una edad de " +
               getEdad() + ", habito en " + getHabitat() +
               " y mi genero es " + getGenero();
       if (getZona() != null){
               formato += ", la zona en la que me ubico es " +
               zona.getNombre() + ", en el " + zona.getZoo();

       }
       return formato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public void movimiento() {
        System.out.println("desplazarse");
    }


}


