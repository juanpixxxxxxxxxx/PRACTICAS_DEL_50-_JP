public class triangulo extends figura {
    private double base;
    private double altura;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == altura || base != altura) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
