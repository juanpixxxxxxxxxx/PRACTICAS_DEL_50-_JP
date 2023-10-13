package ejerciciopersona;

public class Main {
    public static void main(String[] args) {
        ejerciciopersona persona = new ejerciciopersona("Juan", "Pérez", "12345678", 1990, "España", 'H');

        System.out.println("Datos de la Persona:");
        persona.imprimir();
    }
}