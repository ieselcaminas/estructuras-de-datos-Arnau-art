package POO.Herencias.Animal;

public class Gato extends Mamifero implements Jugar{
    public Gato(String nombre){
        super(nombre);
    }

    public void PerseguirUnOvillo(){
        System.out.println("Perseguir un Ovillo");
    }
    @Override
    public void Comunicarse(){
        System.out.println("Miau miau");
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
