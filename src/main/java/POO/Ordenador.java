package POO;

public class Ordenador implements Comparable<Ordenador>{
    private String procesador;
    private String RAM;
    private String cpu;
    private String almacenamiento;
    private String grafica;
    private int precio;


    public Ordenador (String procesador, String RAM, String cpu, String almacenamiento, int precio, String grafica) {
        this.procesador = procesador;
        this.RAM = RAM;
        this.cpu = cpu;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.grafica = grafica;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "CPU:"+this.cpu + " RAM:"+this.RAM + " Almacenamiento:"+this.almacenamiento + " Grafica:"+this.grafica + " Precio:"+this.precio;
    }
    @Override
    public int compareTo(Ordenador other){
    return Integer.compare(this.precio, other.precio);
    }


    public static void main(String[] args) {
        Ordenador pc1 = new Ordenador("Intel","16GB","Gygabyte","560GB",521, "NVIDIA 4060");
        Ordenador pc2 = new Ordenador("AMD","32GB","ASUS","1TB SSD",4661,"NVIDIA RTX 4070");
        if (pc1.compareTo(pc2) > 0){
            System.out.println("El pc1 es mas caro");
        } else {
            System.out.println("El pc2 es mas caro");
        }
    }

}

