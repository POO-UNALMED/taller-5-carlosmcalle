package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
    private ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public String movimiento() {
        return "reptar";
    }

    public Reptil() {

    }

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        this.listado.add(this);
    }
    public void crearIguana(String nombre, int edad, String habitat, String genero, Zona zona) {
    	new Pez(nombre, edad, "humedal", genero, zona, "verde", 3);
    	iguanas++;
       
    }
    
    public void crearSerpiente(String nombre, int edad, String habitat, String genero, Zona zona) {
    	new Pez(nombre, edad, "jungla", genero, zona, "blanco", 1);
    	iguanas++;
       
    }
    
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        this.listado.add(this);
    }
    public void crearIguana(String nombre, int edad, String habitat, String genero) {
    	new Pez(nombre, edad, "humedal", genero, "verde", 3);
    	iguanas++;      
    }
    
    public void crearSerpiente(String nombre, int edad, String habitat, String genero) {
    	new Pez(nombre, edad, "jungla", genero, "blanco", 1);
    	iguanas++;
       
    }

    public int cantidadReptiles() {
        return iguanas + serpientes;
    }
}
