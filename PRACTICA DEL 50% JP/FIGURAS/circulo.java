    public class circulo extends figura {
        private double radio;

        public circulo(double radio) {
            this.radio = radio;
        }


        public double calcularArea() {
            return Math.PI * radio * radio;
        }


        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

