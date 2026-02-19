package POO.Estudios;


public class Catedra {
    private String nombre;
    private Departamento departamento;
    private Facultat facultad;

    public Catedra(String nombre, Departamento departamento, Facultat facultad) {
        this.nombre = nombre;
        this.departamento = departamento;
        departamento.getCatedras().add(this);
        this.facultad = facultad;
        facultad.getCatedras().add(this);
    }
    public Catedra(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        departamento.getCatedras().add(this);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultat getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultat facultad) {
        this.facultad = facultad;
    }
}
