package POO.HerenciasSol;

import java.util.ArrayList;
import java.util.List;

public class Religion {
    private String nombre;
    private String anyo;
    private Libro libro;
    private List<Creyente> creyentes= new ArrayList<>();
    private List<Templo> templos= new ArrayList<>();
    private List<Libro> libros = new ArrayList<>();

    public Religion(String nombre, String anyo, Libro libro, List<Creyente> creyentes, List<Templo> templos) {
        this.nombre = nombre;
        this.anyo = anyo;
        this.libro = libro;
        libro.setReligion(this);
        this.creyentes = creyentes;
        for (Creyente creyente : creyentes) {
            creyente.setReligion(this);
        }
        this.templos = templos;
        for (Templo templo : templos) {
            templo.setReligion(this);
        }
    }


    public Religion(String nombre, String anyo, Libro libro, List<Creyente> creyentes) {
        this.nombre = nombre;
        this.anyo = anyo;
        this.libro = libro;
        libro.setReligion(this);
        this.creyentes = creyentes;
        for (Creyente creyente : creyentes) {
            creyente.setReligion(this);
        }
    }
    public Religion(String nombre, String anyo) {
        this.nombre = nombre;
        this.anyo = anyo;
    }

    public Religion(String nombre, String anyo, Libro libro) {
        this.nombre = nombre;
        this.anyo = anyo;
        this.libro = libro;
        libro.setReligion(this);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Creyente> getCreyentes() {
        return creyentes;
    }

    public void setCreyentes(List<Creyente> creyentes) {
        this.creyentes = creyentes;
    }

    public List<Templo> getTemplos() {
        return templos;
    }

    public void setTemplos(List<Templo> templos) {
        this.templos = templos;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
