package Ej4;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarea> cola= new PriorityQueue<>();
        cola.offer(new Tarea("limpiar escritorio",Importancia.BAJA));
        cola.offer(new Tarea("Entregar taller",Importancia.ALTA));
        cola.offer(new Tarea("Revisar classroom",Importancia.MEDIA));

        System.out.println("Proxima tarea"+ cola.peek());

        System.out.println("Prioridad");
        while(!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }
}
