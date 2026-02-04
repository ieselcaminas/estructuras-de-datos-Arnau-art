package POO.Herencias.Animal;

public class Pezpayaso extends Pez{
    public Pezpayaso(String nombre){
        super(nombre);
    }

     @Override
    public void Comunicarse(){
        System.out.println("Me comunico con burbujas");
     }
}
