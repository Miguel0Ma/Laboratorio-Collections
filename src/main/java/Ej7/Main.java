package Ej7;

public class Main {
    public static void main(String[] args) {
        ColaBanco banco = new ColaBanco();

        banco.llegarCliente("Ana");
        banco.llegarCliente("Luis");
        banco.llegarCliente("Carlos");
        banco.mostrarFila();               // [Ana, Luis, Carlos]

        System.out.println("Próximo: " + banco.proximoEnFila()); // Ana, sin retirarla

        banco.atenderSiguiente();          // Atiende a Ana
        banco.mostrarFila();               // [Luis, Carlos]

        banco.llegarCliente("Marta");
        banco.llegarClienteUrgente("Sra. Pérez (adulto mayor)");
        banco.mostrarFila();               // [Sra. Pérez..., Luis, Carlos, Marta]

        while (!banco.estaVacia()) {
            banco.atenderSiguiente();
        }
        banco.atenderSiguiente();          // fila vacía: aviso, no excepción
    }
}