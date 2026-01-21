package Comparable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class elfos {
    static class regalo implements Comparable<regalo>{
        String nome;
        int peso;
        int puntuacion;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public void setPuntuacion(int puntuacion) {
            this.puntuacion = puntuacion;
        }
        public regalo(String nome, int peso, int puntuacion) {
            this.nome = nome;
            this.peso = peso;
            this.puntuacion = puntuacion;
        }

        @Override
        public String toString(){
            return nome + " - " + peso + " - " + puntuacion;
        }
        @Override
        public int compareTo(regalo other) {
            if (this.puntuacion != other.puntuacion) {
                return other.puntuacion - this.puntuacion;
            }else {
                return this.peso - other.peso;
            }


        }

    }

    public static void main(String[] args) {
        List<regalo> regalos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

            System.out.print("Cuantos niños hay? ");
            int n = input.nextInt();

            for(int i = 0; i < n; i++){
                System.out.println("introduce la puntuacion");
                int prioridad = input.nextInt();
                System.out.println("Introduce el peso del regalo");
                int duracion = input.nextInt();
                regalos.add(new regalo("Niño "+(i+1), duracion, prioridad));
            }
            Collections.sort(regalos);
            for(regalo regalo : regalos){
                System.out.println(regalo.toString());
            }
            System.out.println("---");

        input.close();
    }
}