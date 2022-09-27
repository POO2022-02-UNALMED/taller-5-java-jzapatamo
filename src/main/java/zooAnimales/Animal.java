package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal{
    private static Integer totalAnimales = 0;

    private static ArrayList<Zona> zona = new ArrayList<>();

    private String nombre;
    private Integer edad;
    private String habitat;
    private String genero;

    public Animal(){
        totalAnimales++;
    }

    public Animal(String nombre, Integer edad, String habitat, String genero){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo() {
        Integer totalMamiferos = Mamifero.cantidadMamiferos();
        Integer totalAves = Ave.cantidadAves();
        Integer totalReptiles = Reptil.cantidadReptiles();
        Integer totalPeces = Pez.cantidadPeces();
        Integer totalAnfibios = Anfibio.cantidadAnfibios();

        return String.format("Mamiferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d", totalMamiferos, totalAves, totalReptiles, totalPeces, totalAnfibios);
    }

    public static void agregarZona(Zona instanciaZona){
        zona.add(instanciaZona);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }

    public static Integer getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(Integer totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public static ArrayList<Zona> getZona() {
        return zona;
    }

    public static void setZona(ArrayList<Zona> zona) {
        Animal.zona = zona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("Mi nombre es %s, tengo una edad de %s, habito en %s y mi genero es %s", this.nombre, this.edad, this.habitat, this.genero);
    }
}
