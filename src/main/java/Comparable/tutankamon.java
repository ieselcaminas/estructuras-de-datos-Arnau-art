package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tutankamon {
    static class objeto implements Comparable<objeto>{
        String nombre;
        int  valorhiist;
        int peso;


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getValorhiist() {
            return valorhiist;
        }

        public void setValorhiist(int valorhiist) {
            this.valorhiist = valorhiist;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }
        public objeto(String nombre, int valorhist, int peso) {
            this.nombre = nombre;
            this.valorhiist = valorhist;
            this.peso = peso;
        }


        @Override
        public int compareTo(objeto other) {
            if(this.valorhiist == other.valorhiist){
                return other.peso - this.peso;
            } else {
                return this.valorhiist - other.valorhiist;
            }
        }
        @Override
        public String toString() {
            return nombre;
        }

        }


    public static void main(String[] args) {
        List<objeto> objetos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Cuantos objetos hay? ");
            int c = input.nextInt();
            for(int i = 0; i < c; i++){
                System.out.print("Nombre: ");
                String nombre = input.next();
                System.out.print("Peso: ");
                int p = input.nextInt();
                System.out.print("valor historico: ");
                int v = input.nextInt();
                objetos.add(new objeto(nombre,p,v));
            }
            break;
        }
        Collections.sort(objetos);
        for(objeto objeto : objetos){
            System.out.println(objeto);
        }
        System.out.println("---");
    }
}
