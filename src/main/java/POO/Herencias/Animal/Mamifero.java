package POO.Herencias.Animal;

public abstract class Mamifero extends Animal{
    public Mamifero(String nombre){
        super(nombre);

    }

    public void mamar(){
        System.out.println("Mamo cuando soy pequeño");

    }

    @Override
    public void Respirar(){
        System.out.println("Respiro aire por los pulmones");
    }

}
