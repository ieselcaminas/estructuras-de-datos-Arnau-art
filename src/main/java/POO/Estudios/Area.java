package POO.Estudios;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String nombre;
    private String asignatura;
    private List<Departamento> departamentos= new ArrayList<>();
    public Area(String nombre, String asignatura) {
        this.nombre = nombre;
        this.asignatura = asignatura;

    }

    public Area(String nombre, String asignatura, List<Departamento> departamentos) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.departamentos = departamentos;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
