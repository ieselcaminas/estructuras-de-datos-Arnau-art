import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número máximo de fallos permitidos:");
        int numFallos = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese la palabra a adivinar:");
        String palabraOculta = sc.nextLine().toLowerCase();

        String letrasPropuestas = "";

        Map<Character, Integer> letrasPendientes = new HashMap<>();
        Set<Character> letrasUsadas = new HashSet<>();

        for (char c : palabraOculta.toCharArray()) {
            letrasPendientes.put(c, letrasPendientes.getOrDefault(c, 0) + 1);
        }

        int fallos = 0;

        while (true) {
            System.out.println("\nIntroduce una letra o la palabra completa:");
            String entrada = sc.next().toLowerCase();

            // 🟢 SI ADIVINA LA PALABRA ENTERA → GANÓ
            if (entrada.equals(palabraOculta)) {
                System.out.println("\n ¡HAS GANADO! Era la palabra completa.");
                break;
            }

            // SOLO UNA LETRA
            char letra = entrada.charAt(0);
            letrasPropuestas += letra;

            if (!letrasUsadas.contains(letra)) {
                letrasUsadas.add(letra);

                if (letrasPendientes.containsKey(letra)) {
                    letrasPendientes.put(letra, letrasPendientes.get(letra) - 1);
                    if (letrasPendientes.get(letra) == 0) {
                        letrasPendientes.remove(letra);
                    }
                    System.out.println("✔ La letra '" + letra + "' está en la palabra.");
                } else {
                    fallos++;
                    System.out.println("❌ La letra '" + letra + "' NO está en la palabra.");
                }
            } else {
                System.out.println("⚠ Ya has usado esa letra.");
            }

            // Mostrar progreso
            System.out.print("Palabra: ");
            for (char c : palabraOculta.toCharArray()) {
                if (letrasUsadas.contains(c)) System.out.print(c + " ");
                else System.out.print("_ ");
            }
            System.out.println("\nFallos: " + fallos + " / " + numFallos);

            if (letrasPendientes.isEmpty()) {
                System.out.println("\n🎉 ¡HAS GANADO! La palabra era: " + palabraOculta);
                break;
            } else if (fallos >= numFallos) {
                System.out.println("\n❌ ¡HAS PERDIDO! La palabra era: " + palabraOculta);
                break;
            }
        }
        sc.close();
    }
}
