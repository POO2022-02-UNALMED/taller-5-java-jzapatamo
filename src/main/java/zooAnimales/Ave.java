package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{

    public static Integer halcones = 0;
    public static Integer aguilas = 0;

    private static ArrayList<Ave> listado = new ArrayList<>();
    private String colorPlumas;

    public Ave() {
        listado.add(this);
    }

    public Ave(String nombre, Integer edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad,habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public static Integer cantidadAves(){
        return listado.size();
    }

    public static Ave crearHalcon(String nombre, Integer edad, String genero){
        Ave ave = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        halcones++;
        return ave;
    }

    public static Ave crearAguila(String nombre, Integer edad, String genero){
        Ave ave = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        aguilas++;
        return ave;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }

}
