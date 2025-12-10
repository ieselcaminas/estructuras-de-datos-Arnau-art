import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea="";
        ArrayList<String> coches = new ArrayList<>();

        do {
            linea = sc.nextLine();
            coches.add(linea);
        } while (linea.length()!=0);
        Collections.sort(coches);
        for(String coche:coches){
        System.out.println(coche);}
    }

}
