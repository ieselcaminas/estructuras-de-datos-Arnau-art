package POO.Estudios;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Area a1 = new Area("Area1","Asignatura1");
        Departamento d1 = new Departamento("1","Ciencias",a1);
        Facultat f1 = new Facultat("1","Ciencias");
        Catedra c1 = new Catedra("Catedra12",d1,f1);
        Profesores p1 = new Profesores("12312312A","Pepe",d1);
        adscritos ad1 = new adscritos(p1,c1,"23.41123-");





        System.out.println("hola");
    }
}
