package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {

    }

    public Anfibio(String nombre, int edad, String genero, Boolean esRana) {
        super(nombre, edad, genero);
        if (esRana) {
            this.colorPiel = "rojo";
            this.venenoso = true;
            this.setHabitat("selva");
        } else {
            this.colorPiel = "negro y amarillo";
            this.venenoso = false;
            this.setHabitat("selva");
        }
        this.listado.add(this);
    }

    public String movimiento() {
        return "saltar";
    }

    public static Animal crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, genero, true);
    }

    public static Animal crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, genero, false);
    }
}
