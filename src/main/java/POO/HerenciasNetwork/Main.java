package POO.HerenciasNetwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> comentarios = new ArrayList<>();
        comentarios.add("Que bonito!");
        comentarios.add("Increible!!");
        Imagen i1= new Imagen("Jiayong","20:00","200",comentarios,"Imagen","Amanecer" );
        System.out.println(i1);
        List<String> comentariosTex= new ArrayList<>();
        comentariosTex.add("Que triste!");
        comentariosTex.add("Lamentable!!");
        TEXTO t1 = new TEXTO("Pablo","17:12","134",comentariosTex,"DASDIWIS","Buenos días mundo!");
        System.out.println(t1);
    }
}
