package pelicula;

public class pelicula {



        private String nombre;
        private String director;
        private GeneroPelicula genero;
        private int duracion;
        private int año;
        private double calificacion;

        public pelicula(String nombre, String director, GeneroPelicula genero, int duracion, int año, double calificacion) {
            this.nombre = nombre;
            this.director = director;
            this.genero = genero;
            this.duracion = duracion;
            this.año = año;
            this.calificacion = calificacion;
        }

       
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public GeneroPelicula getGenero() {
            return genero;
        }

        public void setGenero(GeneroPelicula genero) {
            this.genero = genero;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public double getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(double calificacion) {
            this.calificacion = calificacion;
        }

       
        public void imprimir() {
            System.out.println("-------- " + nombre + " ----------");
            System.out.println("****");
            System.out.println(año);
            System.out.println(genero);
            System.out.println(director);
            System.out.println(calcularValoracion());
        }

      
        private boolean esPeliculaEpica() {
            return duracion >= 180; 
        }

       
        private String calcularValoracion() {
            if (calificacion >= 9.0) {
                return "Excelente";
            } else if (calificacion >= 7.0) {
                return "Muy Buena";
            } else if (calificacion >= 5.0) {
                return "Buena";
            } else {
                return "Regular";
            }
        }

       
        private void imprimirCartel() {
            System.out.println("-------- " + nombre + " ----------");
            System.out.println("****");
            System.out.println(año);
            System.out.println(genero);
            System.out.println(director);
            String valoracion = calcularValoracion();
            int numAsteriscos = (int) (calificacion / 2); 
            String asteriscos = "*".repeat(numAsteriscos);
            System.out.println(asteriscos);
        }

    }





