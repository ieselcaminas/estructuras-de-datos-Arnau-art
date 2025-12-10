import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioPais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("España", "Madrid");
        mapa1.put("Francia", "París");
        mapa1.put("Portugal", "Lisboa");
        mapa1.put("Italia", "Roma");
        mapa1.put("Alemania", "Berlín");
        mapa1.put("Bélgica", "Bruselas");
        mapa1.put("Austria","Viena");
        mapa1.put("Hungría","Budapest");
        mapa1.put("Rumania","Bucarest");

        System.out.println("Ingrese el nombre del pais ");
        String nombre = sc.nextLine();
        if (mapa1.containsKey(nombre)) {
            System.out.println(mapa1.get(nombre));
        }

    }
}
