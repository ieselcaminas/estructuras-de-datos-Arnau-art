package POO.Herenciastiponetwork;

public class Articulo {
    private String nombre;
    private String precio;
    private PaginaWeb paginaWeb;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public PaginaWeb getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(PaginaWeb paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public Articulo(String nombre, String precio, PaginaWeb paginaWeb) {
        this.nombre = nombre;
        this.precio = precio;
        this.paginaWeb = paginaWeb;
        paginaWeb.getArticulos().add(this);


    }
    public Articulo(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.paginaWeb = paginaWeb;



    }
}
