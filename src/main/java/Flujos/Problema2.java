package Flujos;
import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {

        class Person {
            private String name;
            private int birthYear;

            public Person(String name, int birthYear) {
                this.name = name;
                this.birthYear = birthYear;
            }

            public String getName() {
                return this.name;
            }

            public int getBirthYear() {
                return this.birthYear;
            }
        }

        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Juan", 2000));
        personas.add(new Person("Maria", 1990));
        personas.add(new Person("Pedro", 1960));
        personas.add(new Person("Arnau", 1990));

        long problema2 = personas.stream().filter(s -> s.getName().startsWith("A")).count();

        System.out.println(problema2);
    }
}