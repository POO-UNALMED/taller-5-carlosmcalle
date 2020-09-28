package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {

    }

    public Pez(String nombre, int edad, String genero, Boolean esSalmon) {
        super(nombre, edad, genero);
        if (esSalmon) {
            this.colorEscamas = "rojo";
            this.cantidadAletas = 6;
            this.setHabitat("oceano");
        } else {
            this.colorEscamas = "gris";
            this.cantidadAletas = 6;
            this.setHabitat("oceano");
        }
        this.listado.add(this);
    }

    public String movimiento(){ return "nadar";
    }

    public static Animal crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, genero, true);
    }

    public static Animal crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, genero, false);
    }

    public int cantidadPeces() {
        return salmones + bacalaos;
    }
}
