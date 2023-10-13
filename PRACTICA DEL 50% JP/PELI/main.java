package pelicula;




enum GeneroPelicula {
    ACCION,
    COMEDIA,
    DRAMA,
    SUSPENSO,
    CIENCIA_FICCION,
    AVENTURA,
    ROMANCE
}

public class main {
    public static void main(String[] args) {
        pelicula pelicula = new pelicula("Interstellar", "Christopher Nolan", GeneroPelicula.CIENCIA_FICCION, 169, 2014, 9.2);

        System.out.println("Datos de la Película:");
        pelicula.imprimir();
    }
}