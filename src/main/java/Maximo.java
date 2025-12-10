import java.util.ArrayList;
import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int maximo=0;
        System.out.print("Introduce 10 números: ");
        for (int i = 1; i <= 10; i++) {
            numeros.add(sc.nextInt());
        }
        for (int numero:numeros) {
            if (numero>maximo) maximo=numero;
        }
        System.out.println("Maximo: "+maximo);
    }
}
