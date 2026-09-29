package Ej11;

import java.util.LinkedHashSet;
import java.util.Set;

public class ListaFavoritos {
    private Set<String> favoritas = new LinkedHashSet<>();

    public boolean marcarFavorita(String cancion){
        boolean esNueva=favoritas.add(cancion);
        if(esNueva){
            System.out.println(cancion+" añadida a favoritos ");
        }else{
            System.out.println(cancion+ " ya esta en favoritos ");
        }
        return esNueva;
    }
    public boolean esFavorita(String cancion) {
        return favoritas.contains(cancion);
    }

    public boolean quitarFavorita(String cancion){
        return favoritas.remove(cancion);
    }
    public void moverAlFinal(String cancion){
        favoritas.remove(cancion);
        favoritas.add(cancion);
    }
    public int total(){
        return favoritas.size();
    }
    public void listar(){
        System.out.println("Lista de favoritas");
        int i = 1;
        for(String cancion : favoritas){
            System.out.println(i++ +" - "+cancion);
        }
    }
}
