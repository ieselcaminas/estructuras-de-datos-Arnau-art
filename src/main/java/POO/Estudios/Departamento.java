package POO.Estudios;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String id;
    private String nombre;
    private Area area;
    private List<Catedra>  catedras= new ArrayList();
    private List<Profesores> professores= new ArrayList<>();

    public Departamento(String id, String nombre, Area area) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        area.getDepartamentos().add(this);
    }

    public Departamento(String id, String nombre, Area area, List<Catedra> catedras) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        area.getDepartamentos().add(this);
        this.catedras = catedras;
        for (Catedra catedra: catedras) {
            catedra.setDepartamento(this);
        }

    }

    public Departamento(String id, String nombre, Area area, List<Catedra> catedras, List<Profesores> professores) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        area.getDepartamentos().add(this);
        this.catedras = catedras;
        this.professores = professores;

    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public List<Profesores> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Profesores> professores) {
        this.professores = professores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
