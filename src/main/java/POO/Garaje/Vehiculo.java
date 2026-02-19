package POO.Garaje;

public abstract class Vehiculo {
    private String nombre;
    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void move(){
        System.out.println("Soy "+ nombre+" y me muevo.");
    }
}
