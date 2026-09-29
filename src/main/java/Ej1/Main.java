package Ej1;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TecnoQuindío");

        empresa.agregarProducto(new Producto("P003", "Teclado", 85000));
        empresa.agregarProducto(new Producto("P001", "Mouse", 45000));
        empresa.agregarProducto(new Producto("P002", "Monitor", 620000));

        // Intento de duplicado (mismo código)
        boolean agregado = empresa.agregarProducto(new Producto("P001", "Otro mouse", 50000));
        System.out.println("¿Se agregó el duplicado? " + agregado); // false

        System.out.println("--- Listado (ordenado por código) ---");
        empresa.listarProductos();

        System.out.println("--- Búsquedas ---");
        System.out.println(empresa.buscarPorCodigo("P002"));   // encontrado
        System.out.println(empresa.buscarPorCodigo("P999"));   // null
    }
}