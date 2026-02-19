package POO.Garaje;

public class Aquatico extends Vehiculo{
    public Aquatico(String nombre){
        super(nombre);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Y soy conducido navegando por el agua");
    }
}
