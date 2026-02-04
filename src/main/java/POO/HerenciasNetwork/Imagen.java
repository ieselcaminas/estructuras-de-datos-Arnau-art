package POO.HerenciasNetwork;

import java.util.List;

public class Imagen extends Publicacion{
    private String archivo;
    private String titulo;


    public Imagen(String nombre, String hora, String likes, List<String> comentarios, String archivo, String titulo) {
        super(nombre, hora, likes, comentarios);
        this.archivo = archivo;
        this.titulo = titulo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"archivo=" + archivo + "\ntitulo=" + titulo;
    }
}
