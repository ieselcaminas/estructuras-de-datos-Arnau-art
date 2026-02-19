package POO.Estudios;

import java.util.ArrayList;
import java.util.List;

public class Facultat {
    private String nombre;
    private String id;
    private List<Catedra> catedras = new ArrayList<>();

    public Facultat(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Facultat(String id, String nombre, List<Catedra> catedras) {
        this.id = id;
        this.nombre = nombre;
        this.catedras = catedras;
        for(Catedra catedra: catedras){
            catedra.setFacultad(this);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<Catedra> getCatedras() {
        return catedras;
    }
    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }
}
