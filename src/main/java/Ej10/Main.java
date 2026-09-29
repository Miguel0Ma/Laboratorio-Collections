package Ej10;

public class Main {
    public static void main(String[] args) {
        ControlAcceso edificio = new ControlAcceso();

        edificio.registrarEmpleados("01");
        edificio.registrarEmpleados("02");
        edificio.registrarEmpleados("03");

        // Intento de registrar un ID duplicado
        edificio.registrarEmpleados("01");   // ERROR

        System.out.println("Total registrados: " + edificio.totalRegistrados()); // 3

        System.out.println("\n--- Intentos de ingreso ---");
        edificio.intentarIngreso("02");     // concedido
        edificio.intentarIngreso("99");     // denegado

        System.out.println("\n--- Eliminacion de empleado ---");
        edificio.eliminar("003");
        edificio.intentarIngreso("03");     // ahora denegado
    }
}
