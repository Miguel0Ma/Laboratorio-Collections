package Ej15;

public class Main {
    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        directorio.agregarContacto("Ana Torres", "3001234567");
        directorio.agregarContacto("Luis Gómez", "3009876543");
        directorio.agregarContacto("Carlos Pérez", "3005551234");

        // Duplicado (aunque cambie mayúsculas)
        directorio.agregarContacto("ana torres", "3000000000");  // ERROR, no reemplaza

        directorio.listarTodos();

        System.out.println("\nTeléfono de Luis Gómez: " + directorio.buscarTelefono("luis gómez"));
        System.out.println("Teléfono de alguien inexistente: " + directorio.buscarTelefono("Pedro"));

        directorio.actualizarTelefono("Carlos Pérez", "3019998888");
        System.out.println("Carlos actualizado: " + directorio.buscarTelefono("Carlos Pérez"));

        directorio.eliminarContacto("Ana Torres");
        directorio.listarTodos();
    }
}
