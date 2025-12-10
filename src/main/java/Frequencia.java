import java.util.*;

public class Frequencia {
    public static void main(String[] args) {
        String [] numerosenletra= {"uno","dos","uno","tres","dos","uno"};
       Scanner sc = new Scanner(System.in);
        System.out.println(frecuencia(numerosenletra));

    }
    public static Map<String,Integer>frecuencia(String[] numeros){
        Map<String,Integer> resultado = new HashMap<>();
        for(String numero:numeros){
           resultado.put(numero,resultado.getOrDefault(numero,0)+1);
        }
        return resultado;
    }



}
