package POO.Herenciastiponetwork;

public class Administrador extends Usuario {
   private String codigoempleado;

    public Administrador(String nombre, String apellido, String username, String contrasenya, PaginaWeb paginaWeb,String codigoempleado) {
        super(nombre, apellido, username, contrasenya, paginaWeb);
        this.codigoempleado=codigoempleado;
    }

    public String getCodigoempleado() {
        return codigoempleado;
    }
    public void setCodigoempleado(String codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    public void EliminarUsuarios(Usuario usuario){
        System.out.println("El usuario:" +usuario.getNombre() + " ha sido eliminado");
        getPaginaWeb().getUsuario().remove(usuario);

    }
    public void EliminarArticulos(Articulo articulo){
        getPaginaWeb().getArticulos().remove(articulo);
        System.out.println("El articulo:" +articulo.getNombre() + " ha sido eliminado");
    }
    public void subirArticulos(Articulo articulo){
        getPaginaWeb().getArticulos().add(articulo);
        System.out.println("El articulo:" +articulo.getNombre() + " ha sido subido");
    }



}
