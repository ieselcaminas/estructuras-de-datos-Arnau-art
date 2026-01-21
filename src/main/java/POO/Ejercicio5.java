package POO;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Banc> bancos = new ArrayList<>();
        Banc banco = new Banc("BBVA");
        List<Sucursal> sucursales = new ArrayList<>();
        Sucursal sucursal = new Sucursal(21,banco);
        System.out.println(sucursal);
        sucursales.add(sucursal);
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new Cliente("1231321N");
        List<Prestec>  prestecs = new ArrayList<>();



    }


}
class Banc{
    private String n_ent;

    List<Sucursal>Sucursal=new ArrayList<>();

    public String getN_ent() {
        return n_ent;
    }

    public void setN_ent(String n_ent) {
        this.n_ent = n_ent;
    }

    public Banc(String n_ent) {
        this.n_ent = n_ent;
    }
    public List<Sucursal> getSucursal() {
        return Sucursal;
    }

    public Banc(String n_ent, List<Sucursal> Sucursal) {
        this.n_ent = n_ent;
        this.Sucursal = Sucursal;
    }
}

class Sucursal{
    private int n_suc;
    private Banc n_ent;
    List<CuentaCorriente> CuentasCorrientes=new ArrayList<>();
    List<Prestec> Prestamos=new ArrayList<>();


    public List<CuentaCorriente> getCuentasCorrientes() {
        return CuentasCorrientes;
    }

    public List<Prestec> getPrestamos() {
        return Prestamos;
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public Banc getN_ent() {
        return n_ent;
    }

    public void setN_ent(Banc n_ent) {
        this.n_ent = n_ent;
    }

    public Sucursal(int n_suc, Banc n_ent) {
        this.n_ent = n_ent;
        this.n_suc = n_suc;
    }

    public Sucursal(int n_suc, Banc n_ent, List<CuentaCorriente> cuentasCorrientes, List<Prestec> prestamos) {
        this.n_suc = n_suc;
        this.n_ent = n_ent;
        CuentasCorrientes = cuentasCorrientes;
        Prestamos = prestamos;
    }



}

class Cliente{
    private String DNI;
    List<Prestec> Prestamos=new ArrayList<>();

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public Cliente(String DNI) {
        this.DNI = DNI;
    }
    public Cliente(String DNI, List<Prestec> Prestamos) {
        this.DNI = DNI;
        this.Prestamos = Prestamos;
    }

    public List<Prestec> getPrestamos() {
        return Prestamos;
    }

}

class CuentaCorriente{
    private int n_cc;
    private Sucursal n_suc;
    List<Domiciliacion> Domiciliaciones=new ArrayList<>();
    List<Cliente> Clientes=new ArrayList<>();
    public List<Cliente> getClientes(){
        return Clientes;
    }
    public List<Domiciliacion> getDomiciliaciones() {
        return Domiciliaciones;
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public int getN_suc() {
        return  n_suc.getN_suc();
    }

    public void setN_suc(Sucursal n_suc) {
        this.n_suc = n_suc;
    }

    public CuentaCorriente(int n_cc, Sucursal n_suc) {
        this.n_cc = n_cc;
        this.n_suc =n_suc ;
    }


}
class Domiciliacion{
    private int num_d;
    private CuentaCorriente n_cc;
    private CuentaCorriente cuenta;

    public Domiciliacion(int num_d, CuentaCorriente n_cc, CuentaCorriente cuenta) {
        this.num_d = num_d;
        this.n_cc = n_cc;
        this.cuenta = cuenta;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public CuentaCorriente getN_cc() {
        return n_cc;
    }

    public void setN_cc(CuentaCorriente n_cc) {
        this.n_cc = n_cc;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }
}
class Prestec{
    private int num_p;
    private Sucursal n_suc;
    private Sucursal sucursal;
    private Cliente DNI;

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public Sucursal getN_suc() {
        return n_suc;
    }

    public void setN_suc(Sucursal n_suc) {
        this.n_suc = n_suc;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getDNI() {
        return DNI;
    }

    public void setDNI(Cliente DNI) {
        this.DNI = DNI;
    }

    public Prestec(int num_p, Sucursal n_suc, Sucursal sucursal, Cliente DNI) {
        this.num_p = num_p;
        this.n_suc = n_suc;
        this.sucursal = sucursal;
        this.DNI = DNI;
    }
}


