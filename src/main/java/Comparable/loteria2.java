package Comparable;

import java.util.*;

public class loteria2 {



    public static void main(String[] args) {
        List<boleto> boletos = new ArrayList<>();
        boletos.add(new boleto(2,1));
        boletos.add(new boleto(1,10));

        Collections.sort(boletos);
        String resultados="";
        for (boleto boleto : boletos) {
            resultados = boleto.toString();
        }
        if (resultados.contains("No")){
            System.out.println("No es justo");
        } else {
            System.out.println("Es justo");
        }

    }



}

class boleto implements Comparable<boleto>{
    private int ganado;
    private int gastado;

    public int getGanado() {
        return ganado;
    }

    public void setGanado(int ganado) {
        this.ganado = ganado;
    }

    public int getGastado() {
        return gastado;
    }

    public void setGastado(int gastado) {
        this.gastado = gastado;
    }

    public boleto(int ganado, int gastado) {
        this.ganado = ganado;
        this.gastado = gastado;
    }
    @Override
    public String toString() {
        if (ganado>gastado){
            return "No";
        } else  {
            return "Si";
        }
    }
    @Override
    public int compareTo(boleto other) {
        if (this.ganado==other.ganado){
            return this.gastado-other.gastado;
        } else {
            return this.ganado-other.ganado;
        }
    }
}


