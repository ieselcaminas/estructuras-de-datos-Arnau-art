package POO.Garaje;

public class Terrelectrico extends Terrestre implements Electric {
    public Terrelectrico(String nombre){
        super(nombre);
    }
    @Override
    public void cargar() {
        System.out.println("Cargando terrelectrico");
    }


}
