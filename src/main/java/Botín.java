import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Botín {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos billetes hay?");
        int cuantosbilletes = scanner.nextInt();
        int [] billetes = new int[cuantosbilletes];
        for (int i = 0; i < cuantosbilletes; i++) {
            System.out.print("Valor del billete " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            billetes[i] = valor;
        }


        System.out.println("Cuantos participantes hay?");

        int participantes = scanner.nextInt();
        System.out.println(sorteo(billetes,participantes));

    }
    public static Map<Integer, ArrayList<Integer>> sorteo(int[] billetes, int participantes){
        Map<Integer, ArrayList<Integer>> Botin2 = new HashMap<>();

        for (int i = 0; i < participantes; i++) {
            Botin2.put(i, new ArrayList<>());
        }

        for (int i = 0; i < billetes.length; i++) {
            int participante = i % participantes;
            Botin2.get(participante).add(billetes[i]);
        }
        return Botin2;
    }
}
