import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PeindientesSeñorIgnaica {
    public static void main(String[] args) {
        HashMap<Integer, Integer> resultado = new HashMap<>();
        System.out.println("cuantos pendientes tiene la señora Ignacia?");
        Scanner scanner = new Scanner(System.in);
        int pendientes = scanner.nextInt();
        int[] pendientes2 = new int[pendientes];
        int contador = 0;
        for(int i = 0; i < pendientes; i++){
            pendientes2[i] = scanner.nextInt();

            }
        for( int pendiente : pendientes2){
            resultado.put(pendiente,(resultado.getOrDefault(pendiente,0)+1));

        }
        for( int cantidad : resultado.values()){
            contador += cantidad/2;
        }
        System.out.println(contador);
    }
}
