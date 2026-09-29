package Ej3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> elementos = new HashSet<String>();

        System.out.println(elementos.add("Manzana"));
        System.out.println(elementos.add("Pera"));
        System.out.println(elementos.add("Uva"));
        System.out.println(elementos.add("Manzana")); //false porque esta duplicado
        System.out.println(elementos.add("Pera"));
        System.out.println(elementos.add("Uva")); //false porque esta duplicado

        System.out.println("Tamaño"+ elementos.size());
        //recorrido de iterador
        System.out.println("contenido");
        Iterator<String> it = elementos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println(elementos);
        }
    }

}
