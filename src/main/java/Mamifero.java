package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
    private ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public Mamifero() {

    }


    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        this.listado.add(this);
    }

    public static void crearCaballo(String nombre, int edad, String genero, Zona zona) {
    	new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
    	caballos++;
    }

    public static void crearLeon(String nombre, int edad, String genero, Zona zona) {
        new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
    	leones++;
    }
    
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        this.listado.add(this);
    }

    public static void crearCaballo(String nombre, int edad, String genero) {
    	new Mamifero(nombre, edad, "pradera", genero, true, 4);
    	caballos++;
    }

    public static void crearLeon(String nombre, int edad, String genero) {
        new Mamifero(nombre, edad, "selva", genero, true, 4);
    	leones++;
    }

    public int cantidadMamiferos() {
        return caballos + leones;
    }
}
