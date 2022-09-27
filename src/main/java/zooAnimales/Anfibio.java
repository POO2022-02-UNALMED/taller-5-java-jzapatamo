package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {

    public static Integer ranas = 0;
    public static Integer salamandras = 0;
    private static ArrayList<Anfibio> listado = new ArrayList<>();

    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(){
        listado.add(this);
    }

    public Anfibio(String nombre, Integer edad, String habitat, String genero, String colorPiel, Boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static Integer cantidadAnfibios(){
        return listado.size();
    }

    public static Anfibio crearRana(String nombre, Integer edad, String genero){
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "rojo", Boolean.TRUE);
        ranas++;
        return anfibio;
    }

    public static Anfibio crearSalamandra(String nombre, Integer edad, String genero){
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", Boolean.FALSE);
        salamandras++;
        return anfibio;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public Boolean isVenenoso() {
        return venenoso;
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }



    @Override
    public String movimiento(){
        return "saltar";
    }
}
