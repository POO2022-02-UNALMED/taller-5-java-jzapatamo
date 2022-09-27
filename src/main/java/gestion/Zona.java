package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private ArrayList<Zoologico> zoo;
    private ArrayList<Animal> animales;

    public Zona(){
        this.zoo = new ArrayList<>();
        this.animales = new ArrayList<>();
    }

    public Zona(String nombre, Zoologico zoo){
        this();
        this.nombre = nombre;
        this.zoo.add(zoo);
    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }

    public Integer cantidadAnimales(){
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }

    public Zoologico getZoo() {
        return zoo
                .stream()
                .findFirst()
                .get();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZoo(ArrayList<Zoologico> zoo) {
        this.zoo = zoo;
    }
}
