package gestion;

import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zona;

    public Zoologico(){
        this.zona = new ArrayList<>();
    }

    public Zoologico(String nombre, String ubicacion){
        this();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona){
        this.zona.add(zona);
    }

    public int cantidadTotalAnimales(){
        Integer total = 0;
        for(Zona zona : zona){
            total += zona.cantidadAnimales();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
