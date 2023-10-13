package avion;



public class main {
    public static void main(String[] args) {
        avion a1 = new avion("Airbus", 4);
        avion a2 = new avion("Lockheed", 4);

        System.out.println("Datos del Avión a1:");
        System.out.println("Fabricante: " + a1.getFabricante());
        System.out.println("Número de Motores: " + a1.getNumeroMotores());

        System.out.println("\nDatos del Avión a2:");
        System.out.println("Fabricante: " + a2.getFabricante());
        System.out.println("Número de Motores: " + a2.getNumeroMotores());

        a1.setFabricante("Stealth");

        System.out.println("\nDespués de cambiar el fabricante de a1:");
        System.out.println("Datos del Avión a1:");
        System.out.println("Fabricante: " + a1.getFabricante());
        System.out.println("Número de Motores: " + a1.getNumeroMotores());

        System.out.println("\nDatos del Avión a2:");
        System.out.println("Fabricante: " + a2.getFabricante());
        System.out.println("Número de Motores: " + a2.getNumeroMotores());

        a2.cambiarFabricante(a1);

        System.out.println("\nDespués de llamar a cambiarFabricante:");
        System.out.println("Datos del Avión a1:");
        System.out.println("Fabricante: " + a1.getFabricante());
        System.out.println("Número de Motores: " + a1.getNumeroMotores());

        System.out.println("\nDatos del Avión a2:");
        System.out.println("Fabricante: " + a2.getFabricante());
        System.out.println("Número de Motores: " + a2.getNumeroMotores());
    }
}