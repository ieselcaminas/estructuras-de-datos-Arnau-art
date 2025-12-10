import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Telefono2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> Numero = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Numero.add("123356");
        Numero.add("987521");
        agenda.put("Alejandro", Numero);
        String nombre = sc.nextLine();
        Numero = new ArrayList<>();
        Numero.add("123356");
        Numero.add("982134121");
        agenda.put("Marta", Numero);
        if (agenda.containsKey(nombre)) {
            System.out.println(agenda.get(nombre));
        } else {
            System.out.printf("No existe el nombre %s", nombre);
        }


    }
}
