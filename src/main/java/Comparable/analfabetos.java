package Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class analfabetos {
    public static void main(String[] args) {
        class Human implements Comparable<Human>{
            String nombre;
            int salario;
            public Human(String nombre, int salario) {
                this.nombre = nombre;
                this.salario = salario;

            }
            @Override
            public String toString() {
                return nombre + "-" + salario;
            }
            @Override
            public int compareTo(Human other) {
                return other.salario - this.salario;
            }

        }
        List<Human> miembros = new ArrayList<>();
        Human humano = new Human("Pedro", 1800);
        Human humano2 = new Human("Lucas", 6999);
        Human humano3 = new Human("Antonio", 200);
        Human humano4 = new Human("Jose", 20023);
        Human humano5 = new Human("Lucas", 2010);
        miembros.add(humano);
        miembros.add(humano2);
        miembros.add(humano3);
        miembros.add(humano4);
        miembros.add(humano5);

        Collections.sort(miembros);

        miembros.stream().sorted().forEach(System.out::println);


    }
}
