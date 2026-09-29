package Ej4;

import java.awt.*;

public class Tarea implements Comparable<Tarea>{
    private static int contador = 0;
    private int secuencia;
    private String descripcion;
    private final Importancia importancia;

    public Tarea(String descripcion, Importancia importancia) {
        this.secuencia=contador++;
        this.descripcion = descripcion;
        this.importancia = importancia;
    }

    public String getDescripcion() {return descripcion;}
    public Importancia getImportancia() {return importancia;}

    @Override
    public int compareTo(Tarea otra) {
        int cmp=this.importancia.compareTo(otra.importancia);
        if(cmp==0){
            return cmp;
        }
        return Integer.compare(this.secuencia,otra.secuencia);
    }

    @Override
    public String toString() {
        return "["+ importancia +"]"+ descripcion;
    }
}
