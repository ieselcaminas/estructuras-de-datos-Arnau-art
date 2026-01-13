package POO;

public class Cuenta {
    public static void main(String[] args) {
        Cuentabancaria cuenta1 = new Cuentabancaria("Arnau");
        System.out.println(cuenta1);
        cuenta1.ingresar(100);
        System.out.println(cuenta1);
        cuenta1.retirar(50);
        System.out.println(cuenta1);
        cuenta1.retirar(100);
        System.out.println(cuenta1);
    }

}
class Cuentabancaria{
    private String titular;
    private double cantidad;

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }



    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }
    public Cuentabancaria (String titular) {
        this.titular = titular;
    }
    public Cuentabancaria(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad<0){
            throw new IllegalArgumentException("El cantidad debe ser mayor a 0");
        } else {
            this.cantidad = this.cantidad + cantidad;
        }
    }
    public void retirar(double cantidad) {
        if (this.cantidad <= cantidad) {
            this.cantidad= 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
}