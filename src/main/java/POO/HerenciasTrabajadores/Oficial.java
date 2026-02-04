package POO.HerenciasTrabajadores;

public class Oficial extends Operario{
    public Oficial(String Nombre){
        super(Nombre);
    }
    @Override
    public void Frase(){
        super.Frase();
        System.out.println("Soy un Oficial");

    }


}
