import java.util.*;

public class Expresionesaritmeticas {
    public static void main(String[] args) {
        System.out.println("Introduce una cadena");
        Scanner sc = new Scanner(System.in);
        String cadena1 = sc.nextLine();
        List <String> cadena = Arrays.asList(cadena1.split(" "));

        System.out.println("El resultado es: "+ calculadora(cadena));
    }

    public static String  calculadora(List<String> cadena) {
        int numerofinal=0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < cadena.size(); i++) {

            int numero=0;

            if (cadena.get(i).equals("+")){
                numero = stack.get(stack.size()-1)+stack.get(stack.size()-2);
                stack.pop();
                stack.pop();
                stack.push(numero);
                numerofinal=numero;
            } else if (cadena.get(i).equals("-")){
                numero = stack.get(stack.size()-1)-stack.get(stack.size()-2);
                stack.pop();
                stack.pop();
                stack.push(numero);
                numerofinal=numero;
            } else if (cadena.get(i).equals("*")){
                numero = stack.get(stack.size()-1)*stack.get(stack.size()-2);
                stack.pop();
                stack.pop();
                stack.push(numero);
                numerofinal=numero;
            } else if (cadena.get(i).equals("/")){
                if(stack.get(stack.size()-1)==0 || stack.get(stack.size()-2)==0){
                  return "Error";
                }else {
                    numero = stack.get(stack.size() - 1) / stack.get(stack.size() - 2);
                    stack.pop();
                    stack.pop();
                    stack.push(numero);
                    numerofinal = numero;
                }
            }else {
                stack.push(Integer.parseInt(cadena.get(i)));
            }
        }
        return String.valueOf(numerofinal);

    }
}
