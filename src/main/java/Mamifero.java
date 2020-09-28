package zooAnimales;

import java.util.ArrayList;

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


    public Mamifero(String nombre, int edad, String genero, Boolean esCaballo) {
        super(nombre, edad, genero);

        if (esCaballo) {
            this.pelaje = true;
            this.patas = 4;
            this.setHabitat("pradera");
        } else {
            this.pelaje = true;
            this.patas = 4;
            this.setHabitat("selva");
        }
        this.listado.add(this);
    }

    public static Animal crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, genero, true);
    }

    public static Animal crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, genero, false);
    }

    public int cantidadMamiferos() {
        return caballos + leones;
    }
}
