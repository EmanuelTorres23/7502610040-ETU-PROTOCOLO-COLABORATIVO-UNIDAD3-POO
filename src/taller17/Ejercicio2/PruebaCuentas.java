package taller17.Ejercicio2;

public class PruebaCuentas {
    public static void main(String[] args) {
        CuentaAhorros ahorros = new CuentaAhorros(1000000, 0.02);

        CuentaBancaria[] cuentas = {
                new CuentaBancaria(500000),
                ahorros
        };

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.depositar(200000);
            System.out.println("Saldo: " + cuenta.getSaldo());
            System.out.println("Retiro de 100000: " + cuenta.retirar(100000));
        }

        ahorros.aplicarInteres();
        System.out.println("Saldo después de interés: " + ahorros.getSaldo());
    }
}