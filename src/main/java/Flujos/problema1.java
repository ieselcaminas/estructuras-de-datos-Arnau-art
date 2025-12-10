package Flujos;
import java.util.ArrayList;
import java.util.List;

public class problema1 {
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

        long problema1 = personas.stream().filter(s -> s.birthYear <= 1970).count();

        System.out.println(problema1);
    }
}
