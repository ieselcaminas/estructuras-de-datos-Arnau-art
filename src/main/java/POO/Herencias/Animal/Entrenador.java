package POO.Herencias.Animal;

public class Entrenador extends Mamifero{
    public Entrenador(String nombre){
        super(nombre);
    }


    public void entrenar(Jugar animalQueSabeJugar){
        animalQueSabeJugar.saltarporunaro();
    }


    public void dejarEntrar(Animal animal){
        if (animal instanceof Jugar) {
            System.out.println("Pasa y te entrenaré");
        } else {
            throw new IllegalArgumentException(animal.getClass().getName()+ " no inmplementa la interfaz Jugar");
        }


    }
}
