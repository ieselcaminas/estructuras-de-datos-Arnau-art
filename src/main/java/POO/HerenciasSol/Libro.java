package POO.HerenciasSol;

public class Libro {
    private String titulo;
    private Religion religion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }
    public Libro(String titulo, Religion religion) {
        this.titulo = titulo;
        this.religion = religion;
        religion.setLibro(this);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", religion=" + religion +
                '}';
    }

}
