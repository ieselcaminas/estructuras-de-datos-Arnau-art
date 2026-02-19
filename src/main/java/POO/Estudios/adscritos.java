package POO.Estudios;

import java.util.ArrayList;
import java.util.List;

public class adscritos {
    private Profesores professores;
    private Catedra catedras;
    private String data;

    public adscritos(String data){
        this.data = data;
    }
    public adscritos(Profesores professores, Catedra catedras, String data){
        this.professores = professores;
        this.catedras = catedras;
        this.data = data;

    }


    public Profesores getProfessores() {
        return professores;
    }

    public void setProfessores(Profesores professores) {
        this.professores = professores;
    }

    public Catedra getCatedras() {
        return catedras;
    }

    public void setCatedras(Catedra catedras) {
        this.catedras = catedras;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
