package POO.HerenciasNetwork;

import java.util.List;

public class TEXTO extends  Publicacion {
    private String ID;
    private String texto;

    public TEXTO(String nombre, String hora, String likes, List<String> comentarios, String ID, String texto) {
        super(nombre, hora, likes, comentarios);
        this.ID = ID;
        this.texto = texto;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+"TEXTO{" + "ID=" + ID + ", texto=" + texto + '}';
    }
}
