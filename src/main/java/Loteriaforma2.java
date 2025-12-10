import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loteriaforma2 {
    public static void main(String[] args) {
        List<String> loterias=new ArrayList<String>(List.of("12352","12354","45252"));
        System.out.println(terminacion((ArrayList<String>) loterias));
    }

    public static Map<Integer,Integer> terminacion(ArrayList<String> loterias){
     int ultimoDigito;
     Integer cuantos;
     Map<Integer,Integer> terminaciones=new HashMap<>();
     for (String num : loterias){
         ultimoDigito=Integer.parseInt(""+num.charAt(num.length()-1));
         cuantos= terminaciones.get(ultimoDigito);
         if(cuantos==null){
             terminaciones.put(ultimoDigito,1);
         } else {
             terminaciones.put(ultimoDigito,terminaciones.get(ultimoDigito)+1);
         }
     }
     return terminaciones;

    }


}
