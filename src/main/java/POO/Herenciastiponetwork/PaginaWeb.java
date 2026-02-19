package POO.Herenciastiponetwork;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb {
    private String nombre;
    private String url;
    private List<Usuario> usuario=new ArrayList<>();
    private List<Articulo> articulos= new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    public PaginaWeb(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public PaginaWeb(String nombre, String url, List<Usuario> usuario) {
        this.nombre = nombre;
        this.url = url;
        this.usuario = usuario;
        for (Usuario u : usuario) {
            u.setPaginaWeb(this);
        }
    }

    public PaginaWeb(String nombre, String url, List<Usuario> usuario, List<Articulo> articulos) {
        this.nombre = nombre;
        this.url = url;
        this.usuario = usuario;
        for (Usuario u : usuario) {
            u.setPaginaWeb(this);
        }
        this.articulos = articulos;
        for (Articulo a : articulos) {
            a.setPaginaWeb(this);
        }
    }

    public Usuario iniciarSesion(String username, String contrasenya) {
        if (usuario == null) {
            return null;
        }

        for (Usuario u : usuario) {
            if (u.getUsername().equals(username) &&
                    u.getContrasenya().equals(contrasenya)) {

                System.out.println("Has iniciado sesión con éxito");
                return u;
            }
        }

        System.out.println("Error al iniciar sesión");
        return null;
    }
    public void articulos(Articulo articulo){
        System.out.println(articulos);
    }


}
