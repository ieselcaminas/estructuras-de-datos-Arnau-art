package POO.Garaje;

public class Terrestre extends Vehiculo {
    public Terrestre(String nombre){
        super(nombre);
    }
    @Override
    public void move(){
        super.move();
        System.out.println("Y soy conducido terrestremente");

    }

}
