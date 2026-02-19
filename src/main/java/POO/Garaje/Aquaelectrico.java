package POO.Garaje;

public class Aquaelectrico extends Aquatico implements Electric{
    public Aquaelectrico(String nombre){
        super(nombre);
    }

    @Override
    public void cargar() {
        System.out.println("Cargando Aquaelectrico");
    }
}
