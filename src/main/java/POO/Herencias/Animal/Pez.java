package POO.Herencias.Animal;

public abstract class Pez extends  Animal{
    public Pez(String nombre){
        super(nombre);
    }

    @Override
    public void Comunicarse() {
        System.out.println("Me comunico con las aletas");
    }
    @Override
    public void Respirar(){
        System.out.println("Respiro por las branquias.");
    }
     @Override
    public void Moverse(){
        System.out.println("Me muevo nadando");
    }

}
