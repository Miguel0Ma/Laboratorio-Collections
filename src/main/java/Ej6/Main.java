package Ej6;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregar(new Producto("P003", "Teclado", 85000, 12));
        inventario.agregar(new Producto("P001", "Mouse", 45000, 0));
        inventario.agregar(new Producto("P002", "Audifonos", 120000, 5));
        inventario.agregar(new Producto("P003", "Monitor", 5000000, 3));
        inventario.agregar(new Producto("P004", "Cable", 1000, 0));
    }
}
