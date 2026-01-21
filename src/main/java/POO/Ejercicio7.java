package POO;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<Autor> autors = new ArrayList<>();
        Autor a1 = new Autor("1234A","Cervantes","1598");
        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("123141284N","El Quijote");
        List<Ejemplar> ejemplars = new ArrayList<>();
        Ejemplar ejemplar1 = new Ejemplar("3214","24-21-1231");
        List<lector> lectors = new ArrayList<>();
        lector lector1= new lector("123112421A","Alberto");
        List<Historico> historicos = new ArrayList<>();
        Historico historico1 = new Historico(ejemplar1.getData_p(),"25-21-1232",ejemplar1.getN_reg(),lector1.getDni());
        historicos.add(historico1);
        ejemplar1.setHistoricos(historicos);
        ejemplars.add(ejemplar1);
        lector1.setEjemplars(ejemplars);
        lectors.add(lector1);
        libro1.setEjemplars(ejemplars);
        libros.add(libro1);
        a1.setLibros(libros);
        autors.add(a1);
        libro1.setAutores(autors);
        List<Temas> temas = new ArrayList<>();
        Temas temas1 = new Temas("Caballeresca","12312",libros);
        temas.add(temas1);
        List<Editorial> editoriales = new ArrayList<>();
        Editorial editorial1 = new Editorial("12345","Editorial caballeresca",libros);
        editoriales.add(editorial1);
        System.out.println("Autores:");
        System.out.println(autors);
        System.out.println("-----------------------");
        System.out.println("Libros:");
        System.out.println(libros);
        System.out.println("-----------------------");
        System.out.println("Ejemplars:");
        System.out.println(ejemplars);
        System.out.println("-----------------------");
        System.out.println("Lectores:");
        System.out.println(lectors);
        System.out.println("-----------------------");
        System.out.println("Temas:");
        System.out.println(temas);
        System.out.println("-----------------------");
        System.out.println("Editorials:");
        System.out.println(editoriales);
        System.out.println("-----------------------");
        System.out.println("Historicos:");
        System.out.println(historicos);
        System.out.println("-----------------------");



    }
}

class Autor{
    private String cod_aut;
    private String nombre;
    private String anyo;
    private List<Libro> libros;

    public Autor(String cod_aut, String nombre, String anyo) {
        this.cod_aut = cod_aut;
        this.nombre = nombre;
        this.anyo = anyo;

    }
    public Autor(String cod_aut, String nombre, String anyo, List<Libro> libros) {
        this.cod_aut = cod_aut;
        this.nombre = nombre;
        this.anyo = anyo;
        this.libros = libros;
    }


    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }


    public String getCod_aut() {
        return cod_aut;
    }

    public void setCod_aut(String cod_aut) {
        this.cod_aut = cod_aut;
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

    @Override
    public String toString() {
        return  "cod_aut: "+cod_aut+"\n nombre: "+nombre+"\n anyo: "+anyo;
    }

}
class Libro{
    private String ISBN;
    private List<Autor> autores;
    private String titulo;
    private List<Ejemplar> ejemplars;

    public List<Ejemplar> getEjemplars() {
        return ejemplars;
    }
    public void setEjemplars(List<Ejemplar> ejemplars) {
        this.ejemplars = ejemplars;
    }
    public Libro(String ISBN, List<Autor> autores, String titulo, List<Ejemplar> ejemplars){
        this.ISBN = ISBN;
        this.autores = autores;
        this.titulo = titulo;
        this.ejemplars = ejemplars;
    }
    public Libro(String ISBN, List<Autor> autores, String titulo) {
        this.ISBN = ISBN;
        this.autores = autores;
        this.titulo = titulo;
    }
    public Libro(String ISBN, String titulo) {
        this.ISBN = ISBN;
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "ISBN: " + ISBN + "\n autores: " + autores + "\n titulo: " + titulo;
    }
}

class Temas{
    private String tema;
    private String cod_t;
    private List<Libro> libros;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getCod_t() {
        return cod_t;
    }

    public void setCod_t(String cod_t) {
        this.cod_t = cod_t;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Temas(String tema, String cod_t, List<Libro> libros) {
        this.tema = tema;
        this.cod_t = cod_t;
        this.libros = libros;
    }
    public Temas(String tema, String cod_t) {
        this.tema = tema;
        this.cod_t = cod_t;
    }
    @Override
    public String toString() {
        return "tema: " + tema + "\n cod_t: " + cod_t + "\n libros: " + libros;
    }
}

class Editorial{
    private String cod_edit;
    private String nombre;
    private List<Libro> libros;

    public Editorial(String cod_edit, String nombre) {
        this.cod_edit = cod_edit;
        this.nombre = nombre;
    }

    public Editorial(String cod_edit, String nombre, List<Libro> libros) {
        this.cod_edit = cod_edit;
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getCod_edit() {
        return cod_edit;
    }

    public void setCod_edit(String cod_edit) {
        this.cod_edit = cod_edit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    @Override
    public String toString() {
        return "cod_edit: " + cod_edit + "\n nombre: " + nombre + "\n libros: " + libros;
    }
}
class Ejemplar {
    private String n_reg;
    private List<Historico> historicos;
    private String data_p;

    public Ejemplar(String n_reg, List<Historico> historicos, String data_p) {
        this.n_reg = n_reg;
        this.historicos = historicos;
        this.data_p = data_p;
    }
    public Ejemplar(String n_reg, String data_p) {
        this.n_reg = n_reg;
        this.data_p = data_p;
    }

    public String getN_reg() {
        return n_reg;
    }

    public void setN_reg(String n_reg) {
        this.n_reg = n_reg;
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<Historico> historicos) {
        this.historicos = historicos;
    }

    public String getData_p() {
        return data_p;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }
    @Override
    public String toString() {
        return "n_reg: " + n_reg + "\n historicos: " + historicos + "\n data_p: " + data_p;
    }
}

class Historico{
    private String data_p;
    private String data_t;
    private String n_reg;
    private String dni;

    public Historico(String data_p, String data_t, String n_reg, String dni) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.n_reg = n_reg;
        this.dni = dni;
    }

    public String getData_p() {
        return data_p;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }

    public String getData_t() {
        return data_t;
    }

    public void setData_t(String data_t) {
        this.data_t = data_t;
    }

    public String getN_reg() {
        return n_reg;
    }

    public void setN_reg(String n_reg) {
        this.n_reg = n_reg;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "data_p: " + data_p + " \n data_t: " + data_t + " \n n_reg: " + n_reg + " \n dni: " + dni;
    }

}

class lector{
    private String dni;
    private String nombre;
    private List<Ejemplar> ejemplars;

    public lector(String dni, String nombre, List<Ejemplar> ejemplars) {
        this.dni = dni;
        this.nombre = nombre;
        this.ejemplars = ejemplars;
    }
    public lector(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ejemplar> getEjemplars() {
        return ejemplars;
    }

    public void setEjemplars(List<Ejemplar> ejemplars) {
        this.ejemplars = ejemplars;
    }
    @Override
    public String toString() {
        return "dni: " + dni + "\n nombre: " + nombre + "\n Ejemplares:" + ejemplars;
    }
}


