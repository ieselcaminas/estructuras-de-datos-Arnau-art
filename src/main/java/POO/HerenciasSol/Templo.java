package POO.HerenciasSol;

public class Templo {
    private String nombre;
    private Religion religion;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Templo(String nombre, Religion religion, String tipo) {
        this.nombre = nombre;
        this.religion = religion;
        this.tipo = tipo;
        religion.getTemplos().add(this);

    }
}
