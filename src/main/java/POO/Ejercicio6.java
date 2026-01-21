package POO;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {

        List<AreaConeixement> areaConeixements = new ArrayList<>();
        AreaConeixement area= new AreaConeixement("1234","Programación");
        List<Departament> departaments = new ArrayList<>();
        Departament departament = new Departament("5678","Java",area.getId());
        List<Professor> professores = new ArrayList<>();
        Professor professor1= new Professor(6905,"Pablo",departament.getId_departament());
        Professor professor2= new Professor(9251,"Marian",departament.getId_departament());
        professores.add(professor1);
        professores.add(professor2);
        //profesores ya esta//
        List<Catedra> catedras = new ArrayList<>();
        Catedra catedra1= new Catedra(9581,"Informatica",departament.getId_departament());
        catedras.add(catedra1);
        //catedra ya esta aqui//
        departament.setCatedras(catedras);
        departament.setProfessors(professores);
        departaments.add(departament);
        //Departamentes ya esta//
        area.setDepartaments(departaments);
        areaConeixements.add(area);
        //area ya esta//
        List<adscrit> adscrits = new ArrayList<>();
        adscrit adscrit = new adscrit("24-2-6985",professores,catedras);
        adscrits.add(adscrit);
        //adscrit ya esta//
        List<Facultad> facultades = new ArrayList<>();
        Facultad facultad=new Facultad(79485,"Ciencias");
        facultades.add(facultad);
        //Facultad ya estaria//
        System.out.println("El area:");
        System.out.println(areaConeixements);
        System.out.println("-------------------------------------");
        System.out.println("Los Departamentos:");
        for (Departament departament1: departaments){
            System.out.println(departament1);
        }
        System.out.println("-----------------------------------");
        System.out.println("Los Professores:");
        for(Professor professor:professores){
            System.out.println(professor);
        }
        System.out.println("-----------------------------------");
        System.out.println("Los adscritos");
        System.out.println("Data: "+adscrit.getData());
        for (Catedra catedra: catedras){
            System.out.println(catedra);
        }
        for (Professor professor: professores){
            System.out.println(professor);
        }
        System.out.println("-----------------------------------");
        System.out.println("Los Catedras:");
        for (Catedra catedra: catedras){
            System.out.println(catedra);
        }
        System.out.println("-----------------------------------");
        System.out.println("Los Facultades:");
        System.out.println(facultades);







    }
}
class AreaConeixement{
    private String id;
    private String aasignatura;
    private List<Departament> departaments = new ArrayList<>();

    public AreaConeixement(String id, String aasignatura, List<Departament> departaments) {
        this.id = id;
        this.aasignatura = aasignatura;
        this.departaments = departaments;
    }
    public AreaConeixement(String id, String aasignatura) {
        this.id = id;
        this.aasignatura = aasignatura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAasignatura() {
        return aasignatura;
    }

    public void setAasignatura(String aasignatura) {
        this.aasignatura = aasignatura;
    }

    public List<Departament> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(List<Departament> departaments) {
        this.departaments = departaments;
    }

    @Override
    public String toString() {
        return "id_Area: "+id+"  |"+"asignatura_Area: "+aasignatura+" |departamento/s: "+departaments.toString();
    }
}

class Departament{
    private String id_departament;
    private String Asignatura;
    private String id_AreaConeixement;
    List<Professor> professors = new ArrayList<>();
    List<Catedra> catedras = new ArrayList<>();

    public Departament(String id_departament, String asignatura, String id_AreaConeixement) {
        this.id_departament = id_departament;
        Asignatura = asignatura;
        this.id_AreaConeixement = id_AreaConeixement;
    }


    public Departament(String id_departament, String asignatura, String id_AreaConeixement, List<Professor> professors) {
        this.id_departament = id_departament;
        Asignatura = asignatura;
        this.id_AreaConeixement = id_AreaConeixement;
        this.professors = professors;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Departament(String id_departament, String asignatura, String id_AreaConeixement, List<Professor> professors, List<Catedra> catedras) {
        this.id_departament = id_departament;
        Asignatura = asignatura;
        this.id_AreaConeixement = id_AreaConeixement;
        this.professors = professors;
        this.catedras = catedras;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public String getId_departament() {
        return id_departament;
    }

    public void setId_departament(String id_departament) {
        this.id_departament = id_departament;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    public String getId_AreaConeixement() {
        return id_AreaConeixement;
    }

    public void setId_AreaConeixement(String id_AreaConeixement) {
        this.id_AreaConeixement = id_AreaConeixement;
    }
     @Override
    public String toString() {
        return "id departamento: "+id_departament+" | Asignatura_Departamento: "+Asignatura+" | id_AreaConeixement: "+id_AreaConeixement+" | id_professor/es: "+professors.toString()+"Catedras: "+catedras.toString();
     }
}

class Professor{
    private int id_professor;
    private String nome;
    private String id_dep;

    public Professor(int id_professor, String nome, String id_dep) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.id_dep = id_dep;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId_dep() {
        return id_dep;
    }

    public void setId_dep(String id_dep) {
        this.id_dep = id_dep;
    }

    @Override
    public String toString() {
        return "id_professor: "+id_professor+" | nombre: "+nome+" | id_dep: "+id_dep;
    }
}

class Catedra {
    private int id_catedra;
    private String Asignatura;
    private String id_departament;

    public Catedra(int id_catedra, String asignatura, String id_departament) {
        this.id_catedra = id_catedra;
        this.Asignatura = asignatura;

        this.id_departament = id_departament;
    }

    public int getId_catedra() {
        return id_catedra;
    }

    public void setId_catedra(int id_catedra) {
        this.id_catedra = id_catedra;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }


    public String getId_departament() {
        return id_departament;
    }

    public void setId_departament(String id_departament) {
        this.id_departament = id_departament;
    }
    @Override
    public String toString() {
        return "id_catedra: "+id_catedra+" | Asignatura: "+Asignatura+" | id_departament: "+id_departament;
    }
}

class Facultad{
    private int id_facultad;
    private String nombre;

    public Facultad(int id_facultad, String nombre) {
        this.id_facultad = id_facultad;
        this.nombre = nombre;
    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "id_facultad: "+id_facultad+" | nombre: "+nombre;
    }
}
class adscrit{
    private String data;
    List<Professor> professores;
    List<Catedra> catedras;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public adscrit(String data, List<Professor> professores, List<Catedra> catedras) {
        this.data = data;
        this.professores = professores;
        this.catedras = catedras;
    }

    @Override
    public String toString() {
        return "data: "+data+" | professores: "+professores+" | catedras: "+catedras;
    }
}
