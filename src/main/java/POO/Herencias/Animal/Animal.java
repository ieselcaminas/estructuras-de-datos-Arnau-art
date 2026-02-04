package POO.Herencias.Animal;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void Comunicarse(){
        System.out.println("Mi nombre es: "+ nombre);
    }
    public void Respirar(){
        System.out.println("Respiro aire por los pulmones");
    }
    public void Moverse(){
        System.out.println("Me muevo a 4 patas");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


}
