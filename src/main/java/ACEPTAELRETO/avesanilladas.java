package ACEPTAELRETO;

public class avesanilladas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int pruebas = in.nextInt();
        if (pruebas < 1 || pruebas > 10000 ) return false;
        else {
            int total = 0;
            for (int i = 0; i < pruebas ; i++) {
                int ave = in.nextInt();
                int anillados = in.nextInt();
                total = total + ave - anillados;
            }
            System.out.println(total);
            return true;
        }

    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}