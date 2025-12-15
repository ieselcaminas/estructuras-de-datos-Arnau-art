package RefuerzoIII;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra para saber el primer caracter en morse.");
        String palabra  =sc.nextLine().toUpperCase();
        HashMap<String,String> caracteres = new HashMap<>();
        caracteres.put("A",".-");
        caracteres.put("B","-...");
        caracteres.put("C","-.-.");
        caracteres.put("D","-..");
        caracteres.put("E",".");
        caracteres.put("F","..-.");
        caracteres.put("G","--.");
        caracteres.put("H","....");
        caracteres.put("I","..");
        caracteres.put("J",".---");
        caracteres.put("K","-.-");
        caracteres.put("L",".-..");
        caracteres.put("M","--");
        caracteres.put("N","-.");
        caracteres.put("O","---");
        caracteres.put("P",".--.");
        caracteres.put("Q","--.-");
        caracteres.put("R",".-.");
        caracteres.put("S","...");
        caracteres.put("T",".");
        caracteres.put("U","..-");
        caracteres.put("V","...-");
        caracteres.put("W",".--");
        caracteres.put("X","-..-");
        caracteres.put("Y","-.--");
        caracteres.put("Z","--..");
        String comprobador1= palabra(caracteres,palabra);
        if (comprobador(palabra,caracteres,comprobador1)==true){
            System.out.println("Ok");
        } else {
            System.out.println("X");
        }

    }

    public static String palabra(HashMap<String,String> caracteres,String palabra){
        String palabrafinal="";
        String letras="";
        letras= palabra.substring(0,1).toUpperCase();
        palabrafinal=caracteres.get(letras);
        return palabrafinal;
    }
    public static boolean comprobador (String palabra, HashMap<String,String> caracteres, String comprobador1){
        String frase="";
        boolean vocal = false;
        for(int i=0;i<palabra.length();i++){
            if(palabra.charAt(i)=='A'){
                vocal=true;
            } else if(palabra.charAt(i)=='E'){
                vocal=true;
            } else if(palabra.charAt(i)=='I'){
                vocal=true;
            } else if(palabra.charAt(i)=='O'){
                vocal=true;
            } else if(palabra.charAt(i)=='U'){
                vocal=true;
            }

            if(vocal){
                if(palabra.charAt(i)=='A'){
                    frase=frase+'.';
                    vocal=false;
                } else if(palabra.charAt(i)=='E'){
                    frase=frase+'.';
                    vocal=false;
                } else if(palabra.charAt(i)=='I'){
                    frase=frase+'.';
                    vocal=false;
                } else if(palabra.charAt(i)=='O'){
                    frase=frase+'-';
                    vocal=false;
                } else if(palabra.charAt(i)=='U'){
                    frase=frase+'.';
                    vocal=false;
                }
            }
        }
        if (frase.equals(comprobador1)){
            return true;
        } else  {
            return false;
        }

    }
}
