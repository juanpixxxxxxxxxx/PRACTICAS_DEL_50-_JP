package cuentab;



public class main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", "Pérez", "1234567890", "Ahorros");

        System.out.println("Datos de la Cuenta Bancaria:");
        cuenta.imprimirDatos();

        cuenta.consignar(1000.0);
        System.out.println("Saldo actual: $" + cuenta.consultarSaldo());

        cuenta.retirar(500.0);
        System.out.println("Saldo actual: $" + cuenta.consultarSaldo());

        cuenta.retirar(700.0);
    }
}