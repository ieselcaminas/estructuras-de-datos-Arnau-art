package RefuerzoIII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] lista ={8,3,12,6,24,14,12,9,70,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce 8 numeros para saber cuales son multipos entre ellos a partir de delante suya");
        String mult="";

        for (int i = 0; i < lista.length; i++) {
            for(int j=0;j<lista.length;j++){
                if(i!=j && lista[i] % lista[j]==0){
                    mult=mult+lista[i]+" ";
                    break;
                }
            }

        }
        System.out.println(mult);
    }
}
