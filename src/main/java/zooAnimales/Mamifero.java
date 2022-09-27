package zooAnimales;

import java.util.ArrayList;

public class Mamifero  extends Animal{

    public static Integer caballos = 0;
    public static Integer leones = 0;
    private static ArrayList<Mamifero> listado = new ArrayList<>();

    private Boolean pelaje;
    private Integer patas;

    public Mamifero() {
        listado.add(this);
    }

    public Mamifero(String nombre, Integer edad, String habitat, String genero, Boolean pelaje, Integer patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public static Integer cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, Integer edad, String genero){
        Mamifero mamifero = new Mamifero(nombre, edad, "pradera", genero, Boolean.TRUE, 4);
        caballos++;
        return mamifero;
    }

    public static Mamifero crearLeon(String nombre, Integer edad, String genero) {
        Mamifero mamifero = new Mamifero(nombre, edad, "selva", genero, Boolean.TRUE, 4);
        leones++;
        return mamifero;
    }

    public Boolean isPelaje() {
        return pelaje;
    }

    public Integer getPatas() {
        return patas;
    }


    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }
}
