import java.util.ArrayList;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        int media=0;
        for (int i = 1; i <= 10; i++) {
            numeros.add(sc.nextInt());
        }
        for (int numero:numeros) {
            media = media + numero;
        }
        float media1 = media/numeros.size();
        System.out.println(media1);
    }
}
