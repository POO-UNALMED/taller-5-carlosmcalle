package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico(){

    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(String nombre, String ubicacion, Zona zonas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void agregarZonas (Zona zonas) {
        this.zonas.add(zonas);
    }
    public int  cantidadTotalAnimales () {
        return Animal.totalAnimales;
    }
}
