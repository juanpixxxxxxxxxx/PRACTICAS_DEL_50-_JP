

class principal {
    public static void main(String[] args) {
        circulo circulo = new circulo(5);
        rectangulo rectangulo = new rectangulo(4, 6);
        cuadrado cuadrado = new cuadrado(3);
        triangulo triangulo = new triangulo(5, 12);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());
    }
}
