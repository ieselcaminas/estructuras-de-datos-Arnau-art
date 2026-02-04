package POO.HerenciasNetwork;

import java.util.List;

public abstract class Publicacion {
    private String Nombre;
    private String Hora;
    private String Likes;
    private List<String> comentarios;

    public Publicacion(String nombre, String hora, String likes, List<String> comentarios) {
        Nombre = nombre;
        Hora = hora;
        Likes = likes;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getLikes() {
        return Likes;
    }

    public void setLikes(String likes) {
        Likes = likes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
    @Override
    public String toString() {
        return "Publicacion:" +"\n"+"Nombre: "+ Nombre +"\n Hora: "+Hora+"\n Likes: " + Likes+"\n Comentarios: " + comentarios;
    }
}
