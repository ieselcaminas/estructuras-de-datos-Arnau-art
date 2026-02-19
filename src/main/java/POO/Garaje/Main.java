package POO.Garaje;

public class Main {
    public static void main(String[] args) {
        Terrestre t1= new Terrestre("Pickup4x4");
        t1.move();
        System.out.println("--------------------------------");
        Terrelectrico t2= new Terrelectrico("Nissan4x4");
        t2.move();
        t2.cargar();
        System.out.println("-----------------------");
        Aquatico a1= new Aquatico("Barcamadera");
        a1.move();
        System.out.println("-----------------------------------");
        Aquaelectrico a2= new Aquaelectrico("BarcaFibra");
        a2.move();
        a2.cargar();
    }
}
