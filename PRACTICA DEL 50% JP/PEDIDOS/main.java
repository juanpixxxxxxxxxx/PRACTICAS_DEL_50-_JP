package pedido;



public class main {
    public static void main(String[] args) {
        pedido pedido = new pedido();

        double valorPedido1 = pedido.calcularValorPedido("Pasta", "Refresco");
        double valorPedido2 = pedido.calcularValorPedido("Sopa", "Parrillada", "Vino");
        double valorPedido3 = pedido.calcularValorPedido("Ensalada", "Pescado", "Agua", "Tarta");

        System.out.println("Valor del Pedido 1: $" + valorPedido1);
        System.out.println("Valor del Pedido 2: $" + valorPedido2);
        System.out.println("Valor del Pedido 3: $" + valorPedido3);
    }
}