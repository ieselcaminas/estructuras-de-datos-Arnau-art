package POO.HerenciasTrabajadores;

public class Main {
    public static void main(String[] args) {
        Tecnico t1= new Tecnico("Pablo");
        t1.Frase();
        Oficial o1= new Oficial("Jordi");
        o1.Frase();
        Directivo d1= new Directivo("Jiayong");
        d1.Frase();
    }
}
