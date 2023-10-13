package pedido;


    public class Suma {
        public int sumar(int num1, int num2) {
            return num1 + num2;
        }

        public int sumar(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }

        public double sumar(double num1, double num2) {
            return num1 + num2;
        }

        public double sumar(double num1, double num2, double num3) {
            return num1 + num2 + num3;
        }

        public static void main(String[] args) {
            Suma suma = new Suma();

            int resultado1 = suma.sumar(5, 3);
            int resultado2 = suma.sumar(2, 4, 6);
            double resultado3 = suma.sumar(3.5, 2.1);
            double resultado4 = suma.sumar(1.2, 2.3, 0.5);

            System.out.println("Resultado 1: " + resultado1);
            System.out.println("Resultado 2: " + resultado2);
            System.out.println("Resultado 3: " + resultado3);
            System.out.println("Resultado 4: " + resultado4);
        }
    }


