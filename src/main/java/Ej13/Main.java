package Ej13;

public class Main {
    public static void main(String[] args) {
        SalaEspera sala = new SalaEspera();

        Paciente p1 = new Paciente("Ana",    NivelUrgencia.MODERADO);
        Paciente p2 = new Paciente("Luis",   NivelUrgencia.CRITICO);
        Paciente p3 = new Paciente("Carlos", NivelUrgencia.LEVE);
        Paciente p4 = new Paciente("Marta",  NivelUrgencia.URGENTE);

        sala.registrarPaciente(p1);
        sala.registrarPaciente(p2);
        sala.registrarPaciente(p3);
        sala.registrarPaciente(p4);

        // Carlos (LEVE) se agrava durante la espera
        System.out.println("\n--- Carlos se agrava ---");
        sala.actualizarUrgencia(p3, NivelUrgencia.CRITICO);

        System.out.println("\n--- Orden de atención ---");
        while (sala.pacientesEnEspera() > 0) {
            sala.atenderSiguiente();
        }
    }
}
