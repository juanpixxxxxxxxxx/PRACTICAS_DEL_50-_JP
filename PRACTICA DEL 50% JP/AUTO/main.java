package automovil;



public class main {
    public static void main(String[] args) {
        automovil auto = new automovil("Toyota", 2023, 2.0, automovil.Combustible.GASOLINA,
                automovil.TipoAutomovil.COMPACTO, 4, 5, 200, automovil.Color.AZUL);
        System.out.println("Velocidad Actual: " + auto.getVelocidadActual() + " km/h");

        auto.acelerar(20);
        System.out.println("Velocidad Actual: " + auto.getVelocidadActual() + " km/h");

        auto.desacelerar(50);
        System.out.println("Velocidad Actual: " + auto.getVelocidadActual() + " km/h");

        auto.frenar();
        System.out.println("Velocidad Actual: " + auto.getVelocidadActual() + " km/h");

        auto.mostrarDatos();
    }
}
