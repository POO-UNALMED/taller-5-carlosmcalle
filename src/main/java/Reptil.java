package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public void movimiento() {
        System.out.println("reptar");
    }

    public Reptil() {

    }

    public Reptil(String nombre, int edad, String genero, Boolean esIguana) {
        super(nombre, edad, genero);
        if (esIguana) {
            this.colorEscamas = "verde";
            this.largoCola = 3;
            this.setHabitat("humedal");
        } else {
            this.colorEscamas = "blanco";
            this.largoCola = 1;
            this.setHabitat("jungla");
        }
        this.listado.add(this);
    }

    public static Animal crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, genero, true);
    }

    public static Animal crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, genero, false);
    }

    public int cantidadReptiles() {
        return iguanas + serpientes;
    }
}
