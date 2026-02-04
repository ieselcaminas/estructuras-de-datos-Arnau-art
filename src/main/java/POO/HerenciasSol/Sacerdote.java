package POO.HerenciasSol;

public class Sacerdote extends Creyente{
    private Religion religion;
    String nombre;
    int edad;
    public Sacerdote(Religion religion, String nombre, String edad){
        super(religion, nombre, edad);
    }
    @Override
    public void creer(){
        super.creer();
        System.out.println("Y soy sacerdote de esta religión para crear un mundo mejor.");
    }


}
