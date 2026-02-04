package POO.HerenciasTrabajadores;

public abstract class Operario extends Empleado{
    public Operario(String Nombre){
        super(Nombre);
    }
    @Override
    public void Frase(){
        super.Frase();
        System.out.println("Soy un operario");
    }

}
