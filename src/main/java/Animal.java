package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal {
    public static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
    }



    public void totalPorTipo(){
        System.out.println("Mamiferos: " + Mamifero.totalAnimales);
        System.out.println("Aves: " + Ave.totalAnimales);
        System.out.println("Reptiles: " + Reptil.totalAnimales);
        System.out.println("Peces: " + Pez.totalAnimales);
        System.out.println("Anfibios: " + Anfibio.totalAnimales);
    }


    public String toString() {
       String formato = "Mi nombre es " + getNombre() + ", tengo una edad de " +
               getEdad() + ", habito en " + getHabitat() +
               " y mi genero es " + getGenero();
       if (getZona() != null){
               formato += ", la zona en la que me ubico es " +
               zona.getNombre() + ", en el " + zona.getZoo();

       }
       return formato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public void movimiento() {
        System.out.println("desplazarse");
    }


}

class Mamifero extends Animal {
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

        if (esCaballo){
            this.pelaje = true;
            this.patas = 4;
            this.setHabitat("pradera");
        }else{
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

    public int cantidadMamiferos(){
        return caballos + leones;
    }
}

class Ave extends Animal {
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
            this.setHabitat("montaña");
        }else {
            this.colorPlumas = "blanco y amarillo";
            this.setHabitat("montana");
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

class Reptil extends Animal {
    private ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public void movimiento() {
        System.out.println("reptar");
    }

    public Reptil () {

    }

    public Reptil(String nombre, int edad, String genero, Boolean esIguana) {
        super(nombre, edad, genero);
        if (esIguana){
            this.colorEscamas = "verde";
            this.largoCola = 3;
            this.setHabitat("humedal");
        }else{
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

    public int cantidadReptiles () {
        return iguanas + serpientes;
    }
}

class Pez extends Animal {
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
        }else {
            this.colorEscamas = "gris";
            this.cantidadAletas = 6;
            this.setHabitat("oceano");
        }
        this.listado.add(this);
    }

    public void movimiento() {
        System.out.println("nadar");
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

class Anfibio extends Animal {
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
        }else{
            this.colorPiel = "negro y amarillo";
            this.venenoso = false;
            this.setHabitat("selva");
        }
        this.listado.add(this);
    }

    public void movimiento() {
        System.out.println("saltar");
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


