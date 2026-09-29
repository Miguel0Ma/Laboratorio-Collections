package Ej13;

public class Paciente  implements  Comparable<Paciente>{
    private static int contador=0;
    private  int secuencia;
    private String nombre;
    private NivelUrgencia nivelUrgencia;

    public Paciente(String nombre, NivelUrgencia nivelUrgencia) {
        this.secuencia = ++contador;
        this.nombre = nombre;
        this.nivelUrgencia = nivelUrgencia;
    }
    public String getNombre() {
        return nombre;
    }
    public NivelUrgencia getNivelUrgencia() {
        return nivelUrgencia;
    }
    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public int compareTo(Paciente paciente) {
        int cmp=this.nivelUrgencia.compareTo(paciente.nivelUrgencia);
        if(cmp!=0){
            return cmp;
        }
        return Integer.compare(this.secuencia,paciente.secuencia);
    }
    @Override
    public String toString() {
        return "["+nivelUrgencia+"]"+nombre;
    }
}
