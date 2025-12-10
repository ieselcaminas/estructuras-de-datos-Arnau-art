package Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class documentocrv {
    static class Pais implements Comparable<Pais> {
       String nombre;

       public String getNombre() {
           return nombre;
       }

       public void setNombre(String nombre) {
           this.nombre = nombre;
       }

       public int getAnalfabetos(){
           return analfabetos;
       }

       public void setAnalfabetos(int analfabetos) {
           this.analfabetos = analfabetos;
       }

       int analfabetos;

       public Pais(String nombre, int analfabetos) {
           this.nombre = nombre;
           this.analfabetos = analfabetos;
       }
       @Override
       public String toString() {
           return nombre + " - " + analfabetos;
       }
       @Override
       public int compareTo(Pais other){
           return this.analfabetos - other.analfabetos;
       }
   }

   public static void main(String[] args) throws IOException {
        List<Pais> paises = new ArrayList<>();
       BufferedReader br = new BufferedReader(new FileReader("src/main/resources/illiterate.csv"));

       String line;
        String [] datos;
        Pais pais;
        br.readLine();
        String nombre;
        int analfabetos;
        while ((line = br.readLine()) != null) {
            datos = line.split(",");
            nombre = datos[5];
            analfabetos = Integer.parseInt(datos[8]);
            pais = new Pais(nombre, analfabetos);
            paises.add(pais);
        }
        paises.stream().sorted().forEach(System.out::println);

   }
}
