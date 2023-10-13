package planeta;



public class planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaAlSol;
    private TipoPlaneta tipo;
    private boolean observableASimpleVista;


    public enum TipoPlaneta {
        GASEOSO,
        TERRESTRE,
        ENANO
    }

    public planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaAlSol, TipoPlaneta tipo, boolean observableASimpleVista) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observableASimpleVista;
    }

    public void imprimirDatos() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia media al Sol: " + distanciaAlSol + " millones de km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es observable a simple vista: " + observableASimpleVista);
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {

        double distanciaEnKilometros = distanciaAlSol * 149597870;
        return distanciaEnKilometros > 340000000;
    }

    public static void main(String[] args) {
        planeta planeta1 = new planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139822, 778, TipoPlaneta.GASEOSO, true);
        planeta planeta2 = new planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 1, TipoPlaneta.TERRESTRE, true);

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
