package POO.Herenciastiponetwork;

import java.util.ArrayList;
import java.util.List;

public class Comprador extends Usuario{
    private List<String> carrito = new ArrayList<>();
    private List<String> Comentarios = new ArrayList<>();


    public List<String> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<String> carrito) {
        this.carrito = carrito;
    }

    public List<String> getComentarios() {
        return Comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        Comentarios = comentarios;
    }
    public Comprador(String nombre, String apellido, String username, String contrasenya, PaginaWeb paginaWeb){
        super(nombre,apellido,username,contrasenya,paginaWeb);

    }


    public Comprador(String nombre, String apellido, String username, String contrasenya, PaginaWeb paginaWeb, List<String> carrito, List<String> comentarios){
        super(nombre,apellido,username,contrasenya,paginaWeb);
        this.carrito=carrito;
        this.Comentarios=comentarios;
    }

    public void ComprarArticulo(Articulo articulo){
        getPaginaWeb().getArticulos().remove(articulo);
        System.out.println("El articulo:" +articulo.getNombre() + " ha sido comprado");
    }
    public void vercatalogo(Articulo articulo){
        for (Articulo articulo1 : getPaginaWeb().getArticulos()){
            System.out.println(articulo1.getNombre());
        }
    }
    public void añadircarrito(Articulo articulo){
        carrito.add(articulo.getNombre());
        System.out.println("El articulo:" +articulo.getNombre() + " ha sido añadido al carrito");

    }
    public void eliminarcarrito(Articulo articulo){
        carrito.remove(articulo.getNombre());
        System.out.println("El articulo:" +articulo.getNombre() + " ha sido eliminado del carrito");

    }
    public void añadircomentario(String comentario){
        Comentarios.add(comentario);
        System.out.println("El comentario:" +comentario + " ha sido añadido");
    }
    public void eliminarcomentario(String comentario){
        Comentarios.remove(comentario);
        System.out.println("El comentario:" +comentario + " ha sido eliminado");
    }

}
