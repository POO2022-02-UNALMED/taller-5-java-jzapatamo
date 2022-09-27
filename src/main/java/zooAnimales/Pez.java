package zooAnimales;

import java.util.ArrayList;

public class Pez extends  Animal{
    public static Integer salmones = 0;
    public static Integer bacalaos = 0;

    private static ArrayList<Pez> listado = new ArrayList<>();
    private String colorEscamas;
    private Integer cantidadAletas;

    public Pez(){
        listado.add(this);
    }

    public Pez(String nombre, Integer edad, String habitat, String genero, String colorEscamas, Integer cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public static Integer cantidadPeces(){
        return listado.size();
    }

    public static Pez crearSalmon(String nombre, Integer edad, String genero){
        Pez pez = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones++;
        return pez;
    }

    public static Pez crearBacalao(String nombre, Integer edad, String genero){
        Pez pez = new Pez(nombre, edad, "oceado", genero, "gris", 6);
        bacalaos++;
        return pez;
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public Integer getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(Integer cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }
}
