public class DibujoAhorcado {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            System.out.println("Fallos: " + i);
            System.out.println(Colors.PURPLE.get() + dibujarAhorcado(i));
            System.out.println("------------------------");
        }

    }

    public static String dibujarAhorcado(int fallos) {
        // fallos esperados: 0 a 6
        StringBuilder sb = new StringBuilder();

        sb.append("  +---+\n");
        sb.append("  |   |\n");

        // Cabeza
        if (fallos >= 1) sb.append("  O   |\n");
        else sb.append("      |\n");

        // Parte superior del cuerpo (brazo izq y derecho)
        if (fallos == 2) sb.append("  |   |\n");
        else if (fallos == 3) sb.append(" /|   |\n");
        else if (fallos >= 4) sb.append(" /|\\  |\n");
        else sb.append("      |\n");

        // Parte inferior del cuerpo
        if (fallos >= 5) sb.append("  |   |\n");
        else sb.append("      |\n");

        // Piernas
        if (fallos >= 6) sb.append(" / \\  |\n");
        else sb.append("      |\n");

        sb.append("      |\n");
        sb.append("=========\n");

        return sb.toString();
    }
}
