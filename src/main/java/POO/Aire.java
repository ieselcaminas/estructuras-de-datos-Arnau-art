package POO;

import java.util.Scanner;

public class Aire {



    public static void main(String[] args) {
        AIREACONDICIONADO a = new AIREACONDICIONADO("AC",27,12,15);

        System.out.println(a);
        a.subir();
        System.out.println(a);
        a.setTemperaturaActual(-100);
        System.out.println(a);

    }
}
class AIREACONDICIONADO {
    private String nombre;
    private int tempMaxima;
    private int tempMinima;
    private int temperaturaActual;


    public void setTemperaturaActual(int temperaturaActual) {
        if (temperaturaActual <= tempMaxima && temperaturaActual >= tempMinima) {
            this.temperaturaActual = temperaturaActual;
        } else if (temperaturaActual > tempMaxima) {
            this.temperaturaActual = tempMaxima;
        } else { this.temperaturaActual=tempMinima;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    public int getTempMinima() {
        return tempMinima;
    }

    public int getTemperaturaActual() {
        return temperaturaActual;
    }



    public void subir(){
        if (temperaturaActual< tempMaxima){
            this.temperaturaActual++;
        }
    }
    public void bajar(){
        setTemperaturaActual(temperaturaActual-1);
    }

    @Override
    public String toString() {
        return this.nombre +" - "+ this.temperaturaActual;
    }

    public AIREACONDICIONADO(String nombre, int tempMaxima, int tempMinima, int temperaturaActual) {
        this.nombre = nombre;
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.temperaturaActual = temperaturaActual;



    }
}
