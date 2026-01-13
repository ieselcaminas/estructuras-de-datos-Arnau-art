package POO;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
        public static void main(String[] args) {
            autor a1 = new autor("Jesus", "0-00-00");
            autor a2 = new autor("Julio", "23-42-12");

            Tema t1 = new Tema("Religion");
            Tema t2 = new Tema("Aventura");
            List<Tema> temas = new ArrayList<>();
            temas.add(t1);
            temas.add(t2);

            List<Tema> temas2 = new ArrayList<>();
            temas2.add(t1);

            libro l1 = new libro("Biblia",a1,412,temas);
            libro l2 = new libro("La odisea",a2,92,temas2);

            System.out.println(l1);
            System.out.println(l2);


        }
}

class autor{
    private String nombre;
    private String fechanac;

    public String getNombre() {
        return nombre;
    }
    public String getFechanac() {
        return fechanac;
    }
    public autor(String nombre, String fechanac) {
        this.nombre = nombre;
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return nombre + "(" + fechanac + ")";
    }
}

class libro{
    private String titulo;
    private autor autor;
    private int paginas;
    private List<Tema> temas= new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public autor getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public libro(String titulo, autor autor, int paginas, List<Tema> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }
    @Override
    public String toString() {
        return titulo + "|||" + autor + "|||" + paginas + "|||" + temas;
    }
}

class Tema{
    private String nombredeltema;

    public String getNombredeltema() {
        return nombredeltema;
    }
    public Tema(String nombredeltema) {
        this.nombredeltema = nombredeltema;
    }

    @Override
    public String toString() {
        return nombredeltema;
    }
}