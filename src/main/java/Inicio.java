import java.util.ArrayList;
import java.util.Collections;

public class Inicio {
    public static void main(String[] args) {
        ArrayList <String> coches = new ArrayList();
        coches.add("SeaT");
        coches.add("Volvo");
        coches.add("BMW");
        System.out.println(coches.get(0));
        System.out.printf("Existen %d coches%n", coches.size());
        //coches.remove(0);
        coches.set(0, "Seat");
        System.out.println(coches.contains("Seat"));
        System.out.println(coches.contains("Renault"));
        for (String coche : coches) {
            System.out.println(coche);
        }
        Collections.sort(coches);
        for (String coche : coches) {
            System.out.println(coche);
        }
    }
}
