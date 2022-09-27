package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{

    public static Integer iguanas = 0;
    public static Integer serpientes = 0;

    private static ArrayList<Reptil> listado = new ArrayList<>();
    private String colorEscamas;
    private Integer largoCola;


    public Reptil() {
        listado.add(this);
    }

    public Reptil(String nombre, Integer edad, String habitat, String genero, String colorEscamas, Integer largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }


    public static int cantidadReptiles(){
        return listado.size();
    }

    public static Reptil crearIguana(String nombre, Integer edad, String genero) {
        Reptil reptil = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas++;
        return reptil;
    }

    public static Reptil crearSerpiente(String nombre, Integer edad, String genero) {
        Reptil reptil = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes++;
        return reptil;
    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public Integer getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(Integer largoCola) {
        this.largoCola = largoCola;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }
}
