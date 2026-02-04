package POO.HerenciasTrabajadores;

public class Directivo extends Empleado {
    public Directivo(String Nombre){
        super(Nombre);
    }

    @Override
    public void Frase(){
        super.Frase();
        System.out.println("Soy un Directivo");
    }
}
