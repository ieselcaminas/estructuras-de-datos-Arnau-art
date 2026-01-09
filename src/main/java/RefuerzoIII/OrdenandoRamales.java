package RefuerzoIII;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoRamales {

    static java.util.Scanner in;
    static class Ramal implements Comparable<Ramal> {

        private String nombre;
        private String lado;
        private int ruta;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getLado() {
            return lado;
        }

        public void setLado(String lado) {
            this.lado = lado;
        }

        public int getRuta() {
            return ruta;
        }

        public void setRuta(int ruta) {
            this.ruta = ruta;
        }

        @Override
        public int compareTo(Ramal otro) {
            return Integer.compare(this.ruta, otro.ruta);
        }

        @Override
        public String toString() {
            return "Ramal{" +
                    "nombre='" + nombre + '\'' +
                    ", lado='" + lado + '\'' +
                    ", ruta=" + ruta +
                    '}';
        }
    }
    public static boolean casoDePrueba() {
        int numRamales = in.nextInt();

        if (numRamales == 0 || numRamales > 500) return false;

        List<String> nombres = new ArrayList<>();

        for (int i = 0; i < numRamales; i++) {
            String nombre = in.next();
            String lado = in.next();
            int ruta = in.nextInt();
            nombres.add(nombre);
        }

        System.out.println(nombres);

        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
