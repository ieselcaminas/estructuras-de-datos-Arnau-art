package ACEPTAELRETO;

import java.util.Collections;
import java.util.HashMap;

public class fallas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int votaciones = in.nextInt();
        if (votaciones < 1 || votaciones > 1000 ) return false;
        else {
            HashMap<String , Integer> fallasinf = new HashMap<String, Integer>();
            HashMap<String , Integer> fallasadult = new HashMap<String, Integer>();
          for (int i = 0; i < votaciones; i++) {
              String falla = in.next();
              if (Character.isUpperCase(falla.charAt(0))) {
                  fallasadult.put(falla, fallasadult.getOrDefault(falla, 0)+1);
              } else {
                  fallasinf.put(falla, fallasinf.getOrDefault(falla, 0)+1);
              }
          }

        }
            return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}