package Ej7;

import java.util.LinkedList;

public class ColaBanco {
    private LinkedList<String> fila = new LinkedList<>();

    // Cliente normal: se une al final de la fila
    public void llegarCliente(String nombre) {
        fila.addLast(nombre);
        System.out.println(nombre + " se unió a la fila.");
    }

    // Cliente urgente: entra directo al inicio, sin afectar a los demás
    public void llegarClienteUrgente(String nombre) {
        fila.addFirst(nombre);
        System.out.println(nombre + " ingresó con urgencia al inicio de la fila.");
    }

    // Atiende y retira al primero de la fila
    public String atenderSiguiente() {
        if (fila.isEmpty()) {
            System.out.println("No hay clientes en espera.");
            return null;
        }
        String atendido = fila.removeFirst();
        System.out.println("Atendiendo a: " + atendido);
        return atendido;
    }

    // Consultar sin retirar
    public String proximoEnFila() {
        return fila.peekFirst();
    }

    public boolean estaVacia() {
        return fila.isEmpty();
    }

    public int cantidadEnEspera() {
        return fila.size();
    }

    public void mostrarFila() {
        System.out.println("Fila actual: " + fila);
    }
}
