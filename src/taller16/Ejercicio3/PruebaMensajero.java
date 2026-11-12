package taller16.Ejercicio3;

public class PruebaMensajero {
    public static void main(String[] args) {
        Mensajero[] mensajeros = {
                new Mensajero(),
                new MensajeroSMS(),
                new MensajePush()
        };

        for (Mensajero mensajero : mensajeros) {
            mensajero.enviar("Tu pedido fue enviado");
        }
    }
}