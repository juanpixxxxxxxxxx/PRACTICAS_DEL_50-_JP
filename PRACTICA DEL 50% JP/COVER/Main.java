package convertor;

public class Main {
    public static void main(String[] args) {
        double metros = 5.0;

        double centimetros = convertor.metrosACentimetros(metros);
        double milimetros = convertor.metrosAMilimetros(metros);
        double pulgadas = convertor.metrosAPulgadas(metros);
        double pies = convertor.metrosAPies(metros);
        double yardas = convertor.metrosAYardas(metros);

        System.out.println(metros + " metros equivale a:");
        System.out.println(centimetros + " centímetros");
        System.out.println(milimetros + " milímetros");
        System.out.println(pulgadas + " pulgadas");
        System.out.println(pies + " pies");
        System.out.println(yardas + " yardas");
    }
}
