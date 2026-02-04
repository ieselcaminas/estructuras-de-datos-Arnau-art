package POO;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {
        Hospital hospital= new Hospital("1234","La Plana");
        Hospital hospital2=new Hospital("3123","La fe");

        Departamento departamento1= new Departamento("0298", "Farmacología", hospital);
        Departamento departamento2= new Departamento("0941", "Medicina interna", hospital);
        Departamento departamento3 = new Departamento("1491", "Medicina general", hospital2);
        Departamento departamento4 = new Departamento("5612", "Radiología", hospital2);
        habitacion hab1 = new habitacion("14124");
        habitacion hab2 = new habitacion("2151");
        Medico medico1 = new Medico("123541N","Juan",departamento1);
        Medico medico2 = new Medico("411030L","Maria",departamento2);
        Intervencion inter1 = new Intervencion("14122","12-10-2021",medico1);
        Intervencion inter2 = new Intervencion("24112","12-10-2021",medico2);
        Medicamento med1= new Medicamento("AACC","Paracetamol");
        med1.añadirIntervencion(inter1);
        Medicamento med2= new Medicamento("A2BC","Lorazepam");
        med2.añadirIntervencion(inter2);
        Paciente paciente = new Paciente("14123B");
        paciente.añadirIntervencion(inter1);
        Paciente paciente2 = new Paciente("12314N");
        paciente2.añadirIntervencion(inter2);
        paciente.setHabitacion(hab1);
        paciente2.setHabitacion(hab2);
        hab1.añadirPaciente(paciente);
        hab2.añadirPaciente(paciente2);


        System.out.println(hospital);
        System.out.println(departamento3);
        System.out.println(hab1);

    }
}

class Hospital {
    private String cod_hosp;
    private String nombre;
    private List<Departamento> departamenTos = new ArrayList<>();


    public String getCod_hosp() {
        return cod_hosp;
    }

    public void setCod_hosp(String cod_hosp) {
        this.cod_hosp = cod_hosp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamenTos() {
        return departamenTos;
    }

    public void setDepartamenTos(List<Departamento> departamenTos) {
        this.departamenTos = departamenTos;
    }


    public Hospital(String cod_hosp, String nombre, List<Departamento> departamenos) {
        this.cod_hosp = cod_hosp;
        this.nombre = nombre;
        this.departamenTos = departamenos;
    }

    public Hospital(String cod_hosp, String nombre) {
        this.cod_hosp = cod_hosp;
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        String resultado="cod_hosp: " + cod_hosp + "\n nombre: " + nombre + "\n departamentos:";
        for (Departamento departamento : departamenTos) {
            resultado+=departamento.getNombre()+", ";
        }
        return resultado;
    }

}
class Departamento {
    private String cod_dep;
    private String nombre;
    private Hospital hospital;
    private List<Medico> medicos = new ArrayList<>();

    public List<Medico> getMedicos() {
        return medicos;
    }

    public Departamento(String cod_dep, String nombre, Hospital hospital, List<Medico> medicos) {
        this.cod_dep = cod_dep;
        this.nombre = nombre;
        this.hospital = hospital;
        this.medicos = medicos;
        hospital.getDepartamenTos().add(this);
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public String getCod_dep() {
        return cod_dep;
    }

    public void setCod_dep(String cod_dep) {
        this.cod_dep = cod_dep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }


    public Departamento(String cod_dep, String nombre, Hospital hospital) {
        this.cod_dep = cod_dep;
        this.nombre = nombre;
        this.hospital = hospital;
        this.hospital.getDepartamenTos().add(this);
    }

    public Departamento(String cod_dep, String nombre) {
        this.cod_dep = cod_dep;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String resultado = "cod_dep: " + cod_dep + "\n nombre: " + nombre + "\n hospital: " + hospital.getNombre() + "\nMedicos:";
        for (Medico medico : medicos) {
            resultado+=medico.getNombre()+", ";
        }
        return resultado;
    }


}

class Medico{
    private String DNI;
    private String Nombre;
    private List<Departamento> departamenos= new ArrayList<>();
    private List<Intervencion> Intervenciones = new ArrayList<>();

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<Departamento> getDepartamenos() {
        return departamenos;
    }

    public void setDepartamenos(List<Departamento> departamenos) {
        this.departamenos = departamenos;
    }

    public List<Intervencion> getIntervenciones() {
        return Intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        Intervenciones = intervenciones;
    }

    public Medico(String DNI, String nombre, Departamento departamento) {
        this.DNI = DNI;
        Nombre = nombre;
        this.departamenos.add(departamento);
        departamento.getMedicos().add(this);
    }

    public Medico(List<Departamento> departamenos, String nombre, String DNI) {
        this.departamenos = departamenos;
        Nombre = nombre;
        this.DNI = DNI;
        for (Departamento departamento : departamenos) {
            departamento.getMedicos().add(this);
        }
    }

    public Medico(String DNI, String nombre, List<Departamento> departamenos, List<Intervencion> intervenciones) {
        this.DNI = DNI;
        Nombre = nombre;
        this.departamenos = departamenos;
        Intervenciones = intervenciones;
        for (Departamento departamento : departamenos) {
            departamento.getMedicos().add(this);
        }
    }
    @Override
    public String toString() {
        String resultado = "DNI:" + DNI + "\n Nombre: " + Nombre + "\n Departamento";
        for (Departamento departamento : departamenos) {
            resultado+=departamento.getNombre()+", ";
        }
        resultado+="\nIntervenciones:";
        for (Intervencion intervencion : Intervenciones) {
            resultado+=intervencion.getFecha()+", ";
        }
        return resultado;
    }


}

class Intervencion{
    private String cod_int;
    private String fecha;
    private Medico medico;
    private Paciente paciente;
    private List<Medicamento> Medicamentos= new ArrayList<>();

    public String getCod_int() {
        return cod_int;
    }

    public void setCod_int(String cod_int) {
        this.cod_int = cod_int;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Medicamento> getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        Medicamentos = medicamentos;
    }

    public Intervencion(String cod_int, String fecha) {
        this.cod_int = cod_int;
        this.fecha = fecha;
    }

    public Intervencion(String cod_int, String fecha, Medico medico) {
        this.cod_int = cod_int;
        this.fecha = fecha;
        this.medico = medico;
        medico.getIntervenciones().add(this);
    }

    public Intervencion(String cod_int, String fecha, Medico medico, Paciente paciente) {
        this.cod_int = cod_int;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        medico.getIntervenciones().add(this);
        paciente.getIntervenciones().add(this);
    }

    public Intervencion(String cod_int, String fecha, Medico medico, Paciente paciente, List<Medicamento> medicamentos) {
        this.cod_int = cod_int;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        Medicamentos = medicamentos;
        medico.getIntervenciones().add(this);
        paciente.getIntervenciones().add(this);
        for (Medicamento medicamento : medicamentos) {
            medicamento.getIntervencions().add(this);
        }
    }
    @Override
    public String toString() {
        String resultado = "cod_int: " + cod_int + "\n fecha: " + fecha+"\nMedico: "+medico+"\nPaciente: "+getPaciente()+"\nMedicamentos:";
        for (Medicamento medicamento : Medicamentos) {
            resultado+=medicamento.getNombre()+", ";
        }
        return resultado;
    }


}
class habitacion{
    private String n_habitacion;
    private List<Paciente> pacientes = new ArrayList<>();

    public String getN_habitacion() {
        return n_habitacion;
    }

    public void setN_habitacion(String n_habitacion) {
        this.n_habitacion = n_habitacion;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;

    }

    public habitacion(String n_habitacion, List<Paciente> pacientes) {
        this.n_habitacion = n_habitacion;
        this.pacientes = pacientes;
        for (Paciente paciente : pacientes) {
            paciente.setHabitacion(this);
        }

    }

    public habitacion(String n_habitacion) {
        this.n_habitacion = n_habitacion;
    }
    public void añadirPaciente(Paciente paciente){
        pacientes.add(paciente);
        paciente.setHabitacion(this);
    }
    @Override
    public String toString() {
        String resultado = "n_habitacion: " + n_habitacion + "\n pacientes:";
        for (Paciente paciente : pacientes) {
            resultado+=paciente.getDNI()+", ";
        }
        return resultado;
    }
}

class Paciente{
    private String DNI;
    private List<Intervencion> intervenciones = new ArrayList<>();
    private habitacion habitacion;

    public habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public Paciente(habitacion habitacion, String DNI) {
        this.habitacion = habitacion;
        this.DNI = DNI;
        habitacion.getPacientes().add(this);
    }

    public Paciente(String DNI, List<Intervencion> intervenciones, habitacion habitacion) {
        this.DNI = DNI;
        this.intervenciones = intervenciones;
        this.habitacion = habitacion;
        habitacion.getPacientes().add(this);
        for (Intervencion intervencion : intervenciones) {
            intervencion.setPaciente(this);
        }
    }
    public void añadirIntervencion(Intervencion intervencion){
        intervenciones.add(intervencion);
        intervencion.setPaciente(this);
    }
    public Paciente(String DNI) {
        this.DNI = DNI;
    }

    public Paciente(String DNI, List<Intervencion> intervenciones) {
        this.DNI = DNI;
        this.intervenciones = intervenciones;
        for (Intervencion intervencion : intervenciones) {
            intervencion.setPaciente(this);
        }

    }
    @Override
    public String toString() {
        String resultado = "DNI: " + DNI+"\n";
        if (habitacion != null) {
            resultado+="Habitacion: "+habitacion.getN_habitacion()+"\n";
        }
        resultado+="\nIntervenciones:";
        for (Intervencion intervencion : intervenciones) {
            resultado+=intervencion.getFecha()+"| ";
        }
        return resultado;
    }
}

class Medicamento{
    private String cod_medicamento;
    private String nombre;
    private List<Intervencion> intervencions= new ArrayList<>();

    public String getCod_medicamento() {
        return cod_medicamento;
    }

    public void setCod_medicamento(String cod_medicamento) {
        this.cod_medicamento = cod_medicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Intervencion> getIntervencions() {
        return intervencions;
    }

    public void setIntervencions(List<Intervencion> intervencions) {
        this.intervencions = intervencions;
        for (Intervencion intervencion : intervencions) {
            intervencion.getMedicamentos().add(this);
        }
    }

    public Medicamento(String cod_medicamento, String nombre) {
        this.cod_medicamento = cod_medicamento;
        this.nombre = nombre;
    }
    public void añadirIntervencion(Intervencion intervencion){
        intervencions.add(intervencion);
        intervencion.getMedicamentos().add(this);
    }

    public Medicamento(String cod_medicamento, String nombre, List<Intervencion> intervencions) {
        this.cod_medicamento = cod_medicamento;
        this.nombre = nombre;
        this.intervencions = intervencions;
            for (Intervencion intervencion : intervencions) {
                intervencion.getMedicamentos().add(this);
            }
    }
}
