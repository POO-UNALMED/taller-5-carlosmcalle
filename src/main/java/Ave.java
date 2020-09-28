package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal {
    private ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;


    public Ave() {

    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public String movimiento() {
        return "volar";
    }

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
    	super(nombre, edad, habitat, genero, zona);
    	this.colorPlumas = colorPlumas;
    	this.listado.add(this);
    }
    
      

    public static void crearHalcon(String nombre, int edad, String genero, Zona zona) {
        new Ave(nombre, edad, "monta\u00f1a", genero, zona, "cafe glorioso");
        halcones++;
    }

    public static void crearAguila(String nombre, int edad, String genero, Zona zona) {
        new Ave(nombre, edad, "monta\u00f1a", genero, zona, "blanco y amarillo");
        halcones++;
    }
    
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
    	super(nombre, edad, habitat, genero);
    	this.colorPlumas = colorPlumas;
    	this.listado.add(this);
    }
    
      

    public static void crearHalcon(String nombre, int edad, String genero) {
        new Ave(nombre, edad, "monta\u00f1a", genero, "cafe glorioso");
        halcones++;
    }

    public static void crearAguila(String nombre, int edad, String genero) {
        new Ave(nombre, edad, "monta\u00f1a", genero, "blanco y amarillo");
        halcones++;
    }
    
 

    public int cantidadAves() {
        return halcones + aguilas;
    }

}
