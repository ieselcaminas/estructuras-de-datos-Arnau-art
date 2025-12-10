package RefuerzoIII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la palabra en mayusculas");
        String cadena=sc.nextLine();
        String mitad="";
        String mitad2="";
        int n = cadena.length()/2;
        for(int i=0;i<n;i++){
            mitad+=cadena.charAt(i);
        }
        for(int j=n;j<cadena.length();j++){
            mitad2+=cadena.charAt(j);
        }
        System.out.println(mitad);
        System.out.println(mitad2);

    }
    public static String palabras(String mitad1, String mitad2){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        map.put("G",7);
        map.put("H",8);
        map.put("I",9);
        map.put("J",10);
        map.put("K",11);
        map.put("L",12);
        map.put("M",13);
        map.put("N",14);
        map.put("O",15);
        map.put("P",16);
        map.put("Q",17);
        map.put("R",18);
        map.put("S",19);
        map.put("T",20);
        map.put("U",21);
        map.put("V",22);
        map.put("W",23);
        map.put("X",24);
        map.put("Y",25);
        map.put("Z",26);
        String result="";

        for(int i=0;i<mitad1.length();i++){

        }
return  result;
    }
}
