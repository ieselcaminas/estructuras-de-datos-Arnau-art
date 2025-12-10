package Flujos;


import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        numeros.add("25");
        numeros.add("20");
        numeros.add("30");

        long cuantos = numeros.stream()
                .mapToInt(s-> Integer.valueOf(s))
                .filter(n->n%3==0)
                .count();

        double media = numeros.stream()
                .mapToInt(s->Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.printf("Hay %d números multiplos de 3, y la media es %f", cuantos, media);
    }

}
