package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
    private ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    
    public String movimiento(){ return "nadar";
    }

    public Pez() {

    }

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        this.listado.add(this);
    }


    public void crearSalmon(String nombre, int edad, String habitat, String genero, Zona zona) {
        new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
    	salmones++;
    }

    public void crearBacalao(String nombre, int edad, String habitat, String genero, Zona zona) {
        new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
    	salmones++;
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        this.listado.add(this);
    }


    public void crearSalmon(String nombre, int edad, String habitat, String genero) {
        new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    	salmones++;
    }

    public void crearBacalao(String nombre, int edad, String habitat, String genero) {
        new Pez(nombre, edad, "oceano", genero, "gris", 6);
    	salmones++;
    }
    public int cantidadPeces() {
        return salmones + bacalaos;
    }
}
