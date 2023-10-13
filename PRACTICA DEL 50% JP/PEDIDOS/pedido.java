package pedido;

public class pedido {

        public double calcularValorPedido(String primerPlato, String bebida) {

            double precioPrimerPlato = 10.0;
            double precioBebida = 2.5;
            return precioPrimerPlato + precioBebida;
        }

        public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida) {

            double precioPrimerPlato = 10.0;
            double precioSegundoPlato = 15.0;
            double precioBebida = 2.5;
            return precioPrimerPlato + precioSegundoPlato + precioBebida;
        }

        public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida, String postre) {

            double precioPrimerPlato = 10.0;
            double precioSegundoPlato = 15.0;
            double precioBebida = 2.5;
            double precioPostre = 5.0;
            return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
        }


    }


