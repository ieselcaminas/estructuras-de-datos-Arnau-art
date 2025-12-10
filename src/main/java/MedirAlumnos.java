import java.util.ArrayList;
import java.util.Scanner;

public class MedirAlumnos {
    public static void main(String[] args) {
        int numeroalumnos = numeroAlumnos();
        ArrayList<Double> alumnos = alturaAlumnos(numeroalumnos);
        double media = mediaAlumnos(alumnos);
        int inferior= Alumnosinferior(alumnos, media);
        int superior = Alumnossuperior(alumnos, media);
        System.out.printf("Hay %d  con una media de %f cm de altura. %n", numeroalumnos, media);
        System.out.printf("Hay %d alumnos inferiores a la media.%n", inferior);
        System.out.printf("Hay %d alumnos superiores a la media.%n", superior);

    }

    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos");
        return sc.nextInt();
    }

    public static ArrayList<Double> alturaAlumnos(int numeroalumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de los alumnos");
        ArrayList<Double> alturas = new ArrayList();
        for (int i = 0; i < numeroalumnos; i++) {
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }

    public static double mediaAlumnos(ArrayList<Double> alumnos) {
        double media = 0;
        for (double alumno : alumnos) {
            media += alumno;
        }
        return media / alumnos.size();
    }

    public static int Alumnosinferior(ArrayList<Double> alumnos, double media) {
        int contadorinferior = 0;
        for (double alumno : alumnos) {
            if (media> alumno) {
                contadorinferior++;
            }
        }
        return contadorinferior;
    }

    public static int Alumnossuperior(ArrayList<Double> alumnos, double media) {
        int contadorsuperior = 0;
        for (double alumno : alumnos) {
            if (media < alumno) {
                contadorsuperior++;
            }
        }
        return contadorsuperior;
    }
}
