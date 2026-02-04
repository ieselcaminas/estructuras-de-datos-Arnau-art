package POO.Herencias.Animal;

public class Perro extends Mamifero{
    Perro(String nombre){
        super(nombre);
    }

    public void TraerZapatillas(){
        System.out.println("Amo toma tus zapatillas");
    }

    @Override
    public void Comunicarse(){
        System.out.println("guau guau");
    }

}
