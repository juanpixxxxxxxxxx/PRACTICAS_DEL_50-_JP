package cuentab;

public class CuentaBancaria {
    private String nombresTitular;
    private String apellidosTitular;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    private boolean activa;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, String numeroCuenta, String tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
        this.activa = false;
    }

    public void imprimirDatos() {
        System.out.println("Titular: " + nombresTitular + " " + apellidosTitular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Cuenta Activa: " + activa);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
            activa = true; 
            System.out.println("Se ha consignado $" + valor + " en la cuenta.");
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            if (saldo == 0) {
                activa = false; 
            }
            System.out.println("Se ha retirado $" + valor + " de la cuenta.");
        } else if (valor <= 0) {
            System.out.println("El valor a retirar debe ser mayor que cero.");
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }

    public boolean compararSaldos(CuentaBancaria otraCuenta) {
        return this.saldo >= otraCuenta.saldo;
    }

    public void transferir(CuentaBancaria cuentaDestino, double valor) {
        if (this.saldo >= valor && this.activa) {
            this.retirar(valor);
            cuentaDestino.consignar(valor);
            System.out.println("Se ha transferido $" + valor + " a la cuenta destino.");
        } else {
            System.out.println("No se puede realizar la transferencia.");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "Pérez", "1234567890", "Ahorros");
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", "Gomez", "9876543210", "Corriente");

        System.out.println("Datos de la Cuenta 1:");
        cuenta1.imprimirDatos();

        cuenta1.consignar(1000.0);
        System.out.println("Saldo actual de Cuenta 1: $" + cuenta1.consultarSaldo());

        cuenta1.transferir(cuenta2, 500.0);
        System.out.println("Saldo actual de Cuenta 1: $" + cuenta1.consultarSaldo());
        System.out.println("Saldo actual de Cuenta 2: $" + cuenta2.consultarSaldo());

        System.out.println("¿Cuenta 1 tiene un saldo mayor o igual que Cuenta 2?: " + cuenta1.compararSaldos(cuenta2));
    }
}
