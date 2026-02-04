package POO.HerenciasTrabajadores;

public class Tecnico extends Operario{

    public Tecnico(String Nombre) {
        super(Nombre);
    }

    @Override
    public void Frase(){
        super.Frase();
        System.out.println("Soy un Tecnico");
    }
}
