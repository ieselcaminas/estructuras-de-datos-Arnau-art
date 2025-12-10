package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class loteria {
    static class boleto implements Comparable<boleto> {
        int premio;
        int gastado;


        public int getGastado() {
            return gastado;
        }

        public void setGastado(int gastado) {
            this.gastado = gastado;
        }

        public int getPremio() {
            return premio;
        }

        public void setPremio(int premio) {
            this.premio = premio;
        }

        public boleto(int premio, int gastado) {
            this.premio = premio;
            this.gastado = gastado;
        }
        @Override
        public String toString() {
            if(premio > gastado) {
                return "SI";
            } else {
                return "NO";
            }
        }

        @Override
        public int compareTo(boleto other) {
            if (this.premio == other.premio) {
                return this.gastado - other.gastado;
            } else {
                return this.premio - other.premio;
            }
        }
    }


        public static void main(String[] args) {
            List<boleto> boletos = new ArrayList<>();
            Scanner input = new Scanner(System.in);

                System.out.print("Cuantos boletos hay? ");
                int c = input.nextInt();
                for (int i = 0; i < c; i++) {
                    System.out.print("obtenido: ");
                    int gan = input.nextInt();
                    System.out.print("invetido: ");
                    int inv = input.nextInt();
                    boletos.add(new boleto(inv, gan));
                }

                Collections.sort(boletos);

                String todos = "";
                for (boleto boleto : boletos) {
                    todos += boleto.toString();
                }
                if(todos.contains("NO")){
                    System.out.println("No");
                } else  {
                    System.out.println("Si");
                }

        }

}
