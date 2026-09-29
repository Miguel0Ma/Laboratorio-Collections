package co.edu.uniquindio;

public class RecorrerArreglo {
    public static void recorrer(int[] arreglo, int posicion) {

        // Caso base
        if (posicion == arreglo.length) {
            return;
        }

        System.out.println(arreglo[posicion]);

        // caso recursivo
        recorrer(arreglo, posicion + 1);
    }

}