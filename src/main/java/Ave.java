package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;


    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public void movimiento() {
        System.out.println("volar");
    }

    public Ave() {

    }

    public Ave(String nombre, int edad, String genero, Boolean esHalcon) {
        super(nombre, edad, genero);
        if (esHalcon) {
            this.colorPlumas = "cafe glorioso";
            this.setHabitat("monta\u00f1a");
        } else {
            this.colorPlumas = "blanco y amarillo";
            this.setHabitat("monta\u00f1a");
        }
        this.listado.add(this);
    }

    public static Animal crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, genero, true);
    }

    public static Animal crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, genero, false);
    }

    public int cantidadAves() {
        return halcones + aguilas;
    }

}
