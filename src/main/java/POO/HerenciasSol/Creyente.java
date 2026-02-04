package POO.HerenciasSol;

public abstract class Creyente{
    private Religion religion;
    private  String nombre;
    private String edad;

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Creyente(Religion religion, String nombre, String edad) {
        this.religion = religion;
        this.nombre = nombre;
        this.edad = edad;

    }
    public void  creer(){
        System.out.println("Hola, soy "+ nombre + ", tengo "+ edad+" años y creo en el" + religion.getNombre());;
    }

    public void añadir(){
        religion.getCreyentes().add(this);
    }


}
