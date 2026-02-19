package POO.Estudios;

import java.util.List;

public class Profesores {
    private String DNI;
    private String nombre;
    private Departamento departamento;

    public Profesores(String DNI, String nombre, Departamento departamento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.departamento = departamento;
        departamento.getProfessores().add(this);
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
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
}
