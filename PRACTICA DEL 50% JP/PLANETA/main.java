package planeta;



public class main {
    public static void main(String[] args) {
        planeta planeta1 = new planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139822, 778, planeta.TipoPlaneta.GASEOSO, true);
        planeta planeta2 = new planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 1, planeta.TipoPlaneta.TERRESTRE, true);

        System.out.println("Datos del Planeta 1:");
        planeta1.imprimirDatos();
        System.out.println("Densidad del Planeta 1: " + planeta1.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + (planeta1.esPlanetaExterior() ? "Sí" : "No"));

        System.out.println("\nDatos del Planeta 2:");
        planeta2.imprimirDatos();
        System.out.println("Densidad del Planeta 2: " + planeta2.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + (planeta2.esPlanetaExterior() ? "Sí" : "No"));
    }
}
