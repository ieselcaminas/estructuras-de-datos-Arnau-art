import java.util.Scanner;
import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena");
        String cadena = sc.nextLine();

        if (esBalanceado(cadena)== true) {
            System.out.println("Esta balanceado");
        } else  {
            System.out.println("No esta balanceado");
        }

    }

    public static boolean esBalanceado(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == '(' || letra == '{' || letra == '[') {
                pila.push(letra);
            } else if (letra == ')') {
                if (pila.peek() == '(') {
                    pila.pop();
                }
            } else if (letra == '}') {
                if (pila.peek() == '{') {
                    pila.pop();
                }
            } else if (letra == ']') {
                if (pila.peek() == '[') {
                    pila.pop();
                }
            }
        }
        if (pila.isEmpty()) {
            return true;
        } else  {
            return false;
        }
    }
}
