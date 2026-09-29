package Ej2;

public class Main {
    public static void main(String[] args) {
        PilaHomogenea pila = new PilaHomogenea();

        pila.push(10);      // pila vacía: acepta
        pila.push(20);      // Integer sobre Integer: acepta
        pila.push("hola");  // String sobre Integer: RECHAZA
        pila.push(3.5);     // Double sobre Integer: RECHAZA
        System.out.println("Pila: " + pila);   // [10, 20]

        pila.pop();
        pila.pop();
        System.out.println("¿Vacía? " + pila.isEmpty());  // true

        // Ahora el primer elemento define el nuevo tipo
        pila.push("hola");
        pila.push("mundo");
        pila.push(99);      // Integer sobre String: RECHAZA
        System.out.println("Pila: " + pila);   // [hola, mundo]
    }
}
