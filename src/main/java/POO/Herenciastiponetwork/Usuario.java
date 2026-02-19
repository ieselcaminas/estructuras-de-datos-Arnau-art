package POO.Herenciastiponetwork;

public class Usuario {
    private String nombre;
    private String apellido;
    private String Username;
    private String contrasenya;
    private PaginaWeb paginaWeb;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public PaginaWeb getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(PaginaWeb paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public Usuario(String nombre, String apellido, String username, String contrasenya, PaginaWeb paginaWeb) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Username = username;
        this.contrasenya = contrasenya;
        this.paginaWeb = paginaWeb;
        paginaWeb.getUsuario().add(this);
    }
}