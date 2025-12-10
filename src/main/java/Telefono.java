import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class Telefono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> Contacto = new HashMap<>();
        Contacto.put("Luis","985 213 314");
        Contacto.put("Juan","964 584 752");
        Contacto.put("Pablo","923 531 512");
        Contacto.put("Maria","532 324 123");
        System.out.println("Introduce el nombre del contacto: ");
        String Nombrecontacto = sc.nextLine();
        System.out.printf(Contacto.getOrDefault(Nombrecontacto,"No se ha encontrado el contacto."));

    }
}
