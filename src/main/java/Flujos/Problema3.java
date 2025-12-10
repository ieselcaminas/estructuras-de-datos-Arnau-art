package Flujos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problema3 {
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
            personas.add(new Person("Chino", 1990));

            String problema3 = personas.stream()
                    .map(Person::getName)
                    .sorted()
                    .collect(Collectors.joining(", "));

            System.out.println(problema3);

        }
    }

