package POO.Herencias.Animal;

public class Main {
    public static void main(String[] args) {
        Perro p1=new Perro("Pablo");
        p1.Comunicarse();
        Gato g1= new Gato("Garfield");
        g1.Comunicarse();
        System.out.println(p1);
        System.out.println(g1);
        g1.mamar();
        Tiburon t1= new Tiburon("Pablito");
        t1.Comunicarse();
        Entrenador e1= new Entrenador("Pablo");
        e1.dejarEntrar(g1);
    }
}
