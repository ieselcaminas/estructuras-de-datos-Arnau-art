package POO.Herenciastiponetwork;

public class main {
    public static void main(String[] args) {
    PaginaWeb paginaWeb1 = new PaginaWeb("Compras", "www.compras.com");
    Administrador administrador1 = new Administrador("pablo","Perez","Pperez","1234",paginaWeb1,"13451");
    Comprador c1 = new Comprador("Alberto","Jose","AJ","1234",paginaWeb1);
    Comprador c2 = new Comprador("Jose","Kina","JK","1234",paginaWeb1);
    Articulo a1= new Articulo("Peine","12€");
    Articulo a2= new Articulo("Secador","90€");
    Articulo a3 = new Articulo("Tenedor","5€");
    administrador1.subirArticulos(a1);
    administrador1.subirArticulos(a2);
    administrador1.subirArticulos(a3);
    for (Articulo articulo : paginaWeb1.getArticulos()){
        System.out.println(articulo.getNombre());
    }
    administrador1.EliminarUsuarios(c1);
    paginaWeb1.iniciarSesion("Pperez","1234");
    paginaWeb1.iniciarSesion("Alberto","123");
    c2.añadircarrito(a1);
    c2.añadircarrito(a2);
    c2.añadircarrito(a3);
    c2.vercatalogo(a1);
    c2.añadircomentario("El producto ha sido muy bueno!");
    System.out.println(c2.getComentarios());
    c2.eliminarcomentario("El producto ha sido muy bueno!");
    System.out.println(c2.getComentarios());
    c2.eliminarcarrito(a1);
    System.out.println(c2.getCarrito());

        System.out.println("hola");


    }
}
