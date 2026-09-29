package Ej11;

public class Main {
    public static void main(String[] args) {
        ListaFavoritos favoritos = new ListaFavoritos();

        favoritos.marcarFavorita("Bohemian Rhapsody");
        favoritos.marcarFavorita("Shape of You");
        favoritos.marcarFavorita("Billie Jean");
        favoritos.listar();
        // 1. Bohemian Rhapsody
        // 2. Shape of You
        // 3. Billie Jean

        // Intento de duplicado: no cambia el orden
        favoritos.marcarFavorita("Shape of You");
        favoritos.listar();  // el orden sigue igual

        favoritos.marcarFavorita("Imagine");
        favoritos.listar();
        // 1. Bohemian Rhapsody
        // 2. Shape of You
        // 3. Billie Jean
        // 4. Imagine

        System.out.println("\n¿'Imagine' es favorita? " + favoritos.esFavorita("Imagine"));  // true

        // Ahora sí la movemos manualmente al final
        favoritos.moverAlFinal("Bohemian Rhapsody");
        favoritos.listar();
        // 1. Shape of You
        // 2. Billie Jean
        // 3. Imagine
        // 4. Bohemian Rhapsody
    }
}
