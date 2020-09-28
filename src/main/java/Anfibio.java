package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
    private ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    

    public String movimiento() {
        return "saltar";
    }
    
    public Anfibio() {

    }

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        this.listado.add(this);
       }


    public static void crearRana(String nombre, int edad, String habitat, String genero, Zona zona) {
    	new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
    	ranas++;
       
    }
    
    public static void crearSalamandra(String nombre, int edad, String habitat, String genero, Zona zona) {
    	new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
    	salamandras++;
       
    }
    
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        this.listado.add(this);
       }


    public static void crearRana(String nombre, int edad, String habitat, String genero) {
    	new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    	ranas++;
       
    }
    
    public static void crearSalamandra(String nombre, int edad, String habitat, String genero) {
    	new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    	salamandras++;
       
    }
}
