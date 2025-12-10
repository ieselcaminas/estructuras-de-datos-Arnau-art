import java.util.*;

public class Loteria {
    public static void main(String[] args) {
        Map<Character, Integer> loterias = new HashMap<>();
        Map<Character, Integer> loterias2 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String [] numeros1 = {"00004", "03845","41344"};
        String [] numeros2 = {"44442", "23231","23142"};

        for ( String num : numeros1){
           char ultimo = num.charAt(num.length()-1);
           loterias.put(ultimo, loterias.getOrDefault(ultimo,0)+1);
        }
        for ( String num : numeros2){
            char ultimo = num.charAt(num.length()-1);
            loterias2.put(ultimo, loterias2.getOrDefault(ultimo,0)+1);
        }
        System.out.println(loterias);
        System.out.println(loterias2);
    }
}
