package RefuerzoIII;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        List <String> sonrisas = new ArrayList();
        sonrisas.add(":)");
        sonrisas.add(";)");
        sonrisas.add(":-)");
        sonrisas.add(";-)");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        System.out.println(terminacion(sonrisas, frase));
    }

    public static String terminacion(List<String>sonrisas, String frase){
        String resultado="";
        for (String sonrisa : sonrisas) {
            int index = frase.indexOf(sonrisa);

            while(index!=-1){
                System.out.println(index);
                index = frase.indexOf(sonrisa, index+1);

            }

        }
        return resultado;
    }

}
