package Ej13;

import java.security.Principal;
import java.util.PriorityQueue;

public class SalaEspera {
    private PriorityQueue<Paciente> cola = new PriorityQueue<>();

    public void registrarPaciente(Paciente paciente){
        cola.add(paciente);
        System.out.println("Paciente registrado"+ paciente);
    }
    public Paciente atenderSiguiente(){
        Paciente atendido = cola.poll();
        if(atendido == null){
            System.out.println("Paciente no encontrado");
        }else {
            System.out.println("llamando a"+ atendido);
        }
        return atendido;
    }

    public boolean actualizarUrgencia(Paciente paciente, NivelUrgencia nuevonivel){
        boolean estaba = cola.remove(paciente);
        if(!estaba){
            return  false;
        }
        paciente.setNivelUrgencia(nuevonivel);
        cola.offer(paciente);
        System.out.println("Paciente actualizado"+ nuevonivel);
        return true;
    }
    public int pacientesEnEspera(){
        return cola.size();
    }
}
