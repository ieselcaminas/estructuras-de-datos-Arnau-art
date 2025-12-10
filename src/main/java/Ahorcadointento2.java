import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ahorcadointento2 {
    public static void main(String[] args) {
        String palabra = "ola";
        String propuesta= "azlpgbo";
        System.out.println(ahorcado(6,palabra,propuesta));


    }

    public static int ahorcado(int maxFallos, String palabraOculta, String letrasPropuestas) {
        List <Character> letrasOcultas = new ArrayList();
        List <Character> letrasJugadas = new ArrayList();
        int fallosJugador=0;
        Scanner sc = new Scanner(System.in);

        for (Character c: palabraOculta.toCharArray()) {
            if (!letrasOcultas.contains(c)) {
                letrasOcultas.add(c);
            }
        }


        while (fallosJugador<maxFallos){
            System.out.print("Introduce la una letra");
            String linea = sc.next();
            Character letra =linea.toLowerCase().charAt(0);
            if (linea.equals(palabraOculta)){
                System.out.println("Has ganado!!!!!");
                return 1;
            }

            if (letrasJugadas.contains(letra)) {
                System.out.println("Esta letra ya la has puesto");
                fallosJugador--;

            }
            if (!letrasOcultas.contains(letra)) {
                StringBuilder sb = new StringBuilder();
                fallosJugador ++;
                sb.append("  +---+\n");
                sb.append("  |   |\n");

                // Cabeza
                if (fallosJugador >= 1) sb.append("  O   |\n");
                else sb.append("      |\n");

                // Parte superior del cuerpo (brazo izq y derecho)
                if (fallosJugador == 2) sb.append("  |   |\n");
                else if (fallosJugador == 3) sb.append(" /|   |\n");
                else if (fallosJugador >= 4) sb.append(" /|\\  |\n");
                else sb.append("      |\n");

                // Parte inferior del cuerpo
                if (fallosJugador >= 5) sb.append("  |   |\n");
                else sb.append("      |\n");

                // Piernas
                if (fallosJugador >= 6) sb.append(" / \\  |\n");
                else sb.append("      |\n");

                sb.append("      |\n");
                sb.append("=========\n");

                System.out.println(sb.toString());
                System.out.println("Tienes "+ fallosJugador+ " fallos.");
                letrasJugadas.add(letra);
            }else {
                letrasOcultas.remove(letra);
                letrasJugadas.add(letra);
            }



            if (letrasOcultas.isEmpty()) {
                return 1;
            } else if (fallosJugador==maxFallos) {
                return 2;
            }
        }

        return 3;
    }



}
