package Comparable;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Felipe {
    static class tarea implements Comparable<tarea>{
        String nome;
        int duracion;
        int prioridad;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getPrioridad() {
            return prioridad;
        }

        public void setPrioridad(int prioridad) {
            this.prioridad = prioridad;
        }
        public tarea(String nome, int duracion, int prioridad) {
            this.nome = nome;
            this.duracion = duracion;
            this.prioridad = prioridad;
        }

        @Override
        public String toString(){
            return nome + " - " + duracion + " - " + prioridad;
        }
        @Override
        public int compareTo(tarea other) {
            if (this.prioridad != other.prioridad){
                return other.prioridad - this.prioridad;
            }else {
                return this.duracion - other.duracion;
            }


        }

    }

    public static void main(String[] args) {
        List<tarea> tareas = new ArrayList<>();
        Scanner input = new Scanner(System.in);

            System.out.print("Informe cuantas tareas tien Felipe: ");
            int n = input.nextInt();

            for(int i = 0; i < n; i++){
                System.out.println("introduce la prioridad");
                int prioridad = input.nextInt();
                System.out.println("duracion");
                int duracion = input.nextInt();
                tareas.add(new tarea("Tarea"+(i+1), duracion, prioridad));
            }
            Collections.sort(tareas);
                for(tarea tarea : tareas){
                    System.out.println(tarea.toString());
                }
                System.out.println("---");

        input.close();
    }
}
