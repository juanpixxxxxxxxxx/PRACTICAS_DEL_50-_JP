package automovil;



public class automovil {
    private String marca;
    private int modelo;
    private double motor;
    private Combustible tipoCombustible;
    private TipoAutomovil tipo;
    private int numPuertas;
    private int numAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;


    public enum Combustible {
        GASOLINA,
        BIOETANOL,
        DIESEL,
        BIODIESEL,
        GAS_NATURAL
    }

    public enum TipoAutomovil {
        CIUDAD,
        SUBCOMPACTO,
        COMPACTO,
        FAMILIAR,
        EJECUTIVO,
        SUV
    }

    public enum Color {
        BLANCO,
        NEGRO,
        ROJO,
        NARANJA,
        AMARILLO,
        VERDE,
        AZUL,
        VIOLETA
    }

    public automovil(String marca, int modelo, double motor, Combustible tipoCombustible,
                     TipoAutomovil tipo, int numPuertas, int numAsientos,
                     int velocidadMaxima, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipo = tipo;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;

    }


    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }



    public void acelerar(int incremento) {
        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima.");
        }
    }



    public void desacelerar(int decremento) {
        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
        } else {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        }
    }



    public void frenar() {
        velocidadActual = 0;
    }



    public double calcularTiempoEstimado(int distancia) {
        return (double) distancia / velocidadActual;
    }


    
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipo);
        System.out.println("Número de Puertas: " + numPuertas);
        System.out.println("Número de Asientos: " + numAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }


}
