package POO.HerenciasTrabajadores;

public abstract class Empleado {
    private String Nombre;


    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }


    public void Frase() {
        System.out.println("Soy: "+ Nombre);
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
}
