package POO;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

    public static void main(String[] args) {
        Pujador p1 = new Pujador("Luis");
        Pujador p2 = new Pujador("Maria");
        Articulos a1 = new Articulos("Bota de Felipe II", 100);
        Articulos a2 = new Articulos("Mano de Napoleón", 214);
        Articulos a3 = new Articulos("Pepino dorado", 215);
        Lote l1 = new Lote("12124A",330);
        Lote l2 = new Lote("2959NB", 150);
        l1.addArticulo(a1);
        l1.addArticulo(a2);
        l2.addArticulo(a3);
        Pujas puja1= new Pujas(300,p1,l1);
        Pujas puja2= new Pujas(400,p2,l1);
        Pujas puja3= new Pujas(100,p1,l2);
        Pujas puja4= new Pujas(200,p2,l2);
        Subasta s1 = new Subasta("24-01-2024");
        s1.addLote(l1);
        s1.addLote(l2);
        s1.CerrarSubasta();

        for (Lote lote : s1.getLotes()) {
            System.out.println("El ganador del lote: "+ lote.getNumero() + " es: " + lote.getPujaGanadora().getPujadores().getNombre()
                    + " con una cantidad de: " + lote.getPujaGanadora().getCantidad());
        }



    }


}

class Articulos{
    private String nombre;
    private int precio;
    private Lote lote;

    public Articulos(String nombre, int precio, Lote lote) {
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
        lote.addArticulo(this);

    }
    public Articulos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }



}

class Lote {

    private String numero;
    private int precioSalida;
    private List<Articulos> articulos = new ArrayList<>();
    private List<Pujas> pujas = new ArrayList<>();
    private Subasta subasta;
    private Pujas pujaGanadora;

    // 🔹 Constructor mínimo
    public Lote(String numero, int precioSalida) {
        this.numero = numero;
        this.precioSalida = precioSalida;
    }

    // 🔹 Se une SOLO desde Subasta
    void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }

    // 🔹 Añadir artículo al lote
    public void addArticulo(Articulos articulo) {
        articulos.add(articulo);
        articulo.setLote(this);
    }

    // 🔹 Añadir puja (controlando estado de la subasta)
    public void addPuja(Pujas puja) {
        if (subasta.isAdjudicada()) {
            throw new IllegalStateException("La subasta está cerrada");
        }
        pujas.add(puja);
        puja.setLotes(this);
    }

    // 🔹 Cerrar lote y calcular ganador
    public void cerrarLote() {
        if (pujas.isEmpty()) {
            pujaGanadora = null;
            return;
        }

        pujaGanadora = pujas.get(0);
        for (Pujas puja : pujas) {
            if (puja.getCantidad() > pujaGanadora.getCantidad()) {
                pujaGanadora = puja;
            }
        }
    }

    // 🔹 Getters
    public String getNumero() {
        return numero;
    }

    public int getPrecioSalida() {
        return precioSalida;
    }

    public Pujas getPujaGanadora() {
        return pujaGanadora;
    }

    public List<Pujas> getPujas() {
        return pujas;
    }
}

class Pujador{
    private String Nombre;

    public Pujador(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}

class Pujas{
    private int cantidad;
    private Pujador pujadores;
    private Lote lotes;

    public Pujas(int cantidad, Pujador pujadores, Lote lotes) {
        this.cantidad = cantidad;
        this.pujadores = pujadores;
        this.lotes = lotes;
        lotes.getPujas().add(this);
    }

    public Pujas(int cantidad, Pujador pujadores) {
        this.cantidad = cantidad;
        this.pujadores = pujadores;

    }

    public Pujas(int cantidad, Lote lotes) {
        this.cantidad = cantidad;
        this.lotes = lotes;
        lotes.getPujas().add(this);

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pujador getPujadores() {
        return pujadores;
    }

    public void setPujadores(Pujador pujadores) {
        this.pujadores = pujadores;
    }

    public Lote getLotes() {
        return lotes;
    }

    public void setLotes(Lote lotes) {
        this.lotes = lotes;
    }
}
class Subasta{
    private String fecha;
    private List<Lote> lotes= new ArrayList<>();
    private boolean adjudicada= false;

    public Subasta(String fecha) {
        this.fecha = fecha;
    }

    public Subasta(String fecha, List<Lote> lotes) {
        this.fecha = fecha;
        this.lotes = lotes;

    }

    public Subasta(String fecha, List<Lote> lotes, boolean adjudicada) {
        this.fecha = fecha;
        this.lotes = lotes;
        this.adjudicada = adjudicada;
    }

    public Subasta(String fecha, boolean adjudicada) {
        this.fecha = fecha;
        this.adjudicada = adjudicada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public boolean isAdjudicada() {
        return adjudicada;
    }


    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }

    public void CerrarSubasta(){
        adjudicada = true;

        for (Lote lote : lotes) {
            lote.cerrarLote();
        }
    }

    public void addLote(Lote lote){
        lotes.add(lote);
        lote.setSubasta(this);
    }

}