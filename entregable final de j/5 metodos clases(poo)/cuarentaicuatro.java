
public class cuarentaicuatro {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        cuenta.depositar(500.0);
        System.out.println("Saldo después del depósito: " + cuenta.obtenerSaldo());

        cuenta.retirar(300.0);
        System.out.println("Saldo después del retiro: " + cuenta.obtenerSaldo());

        cuenta.retirar(1500.0); // Intentar retirar más de lo disponible
    }
}

class CuentaBancaria {
    private double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    // Método para obtener el saldo actual
    public double obtenerSaldo() {
        return saldo;
    }
}