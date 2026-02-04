package POO.Herencias.Animal;

public class Tiburon extends Pez implements Jugar{
    public Tiburon(String nombre){
        super(nombre);
    }
    @Override
    public void saltarporunaro(){
        System.out.println("Sé saltar por aro");
    }

    @Override
    public void  perseguirunobjeto(String objeto){
        System.out.println("Sé perseguir un objeto");
    }

    }

