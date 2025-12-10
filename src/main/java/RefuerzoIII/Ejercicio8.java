package RefuerzoIII;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros= {1,5,3,2};
        String resultado="";

        for (int i = 0; i < numeros.length; i++) {
            for (int j =0; j < numeros.length; j++) {
                for (int k = 0; k < numeros.length; k++) {
                    if (i != j && j != k && k != i) {
                        if(j>k){
                        if(numeros[j]+numeros[k]==numeros[i]){
                            resultado+=numeros[j]+"+"+numeros[k]+"="+numeros[i]+"||";
                        }
                        }
                    }
                }
            }
        }
        System.out.println(resultado);

    }
}
