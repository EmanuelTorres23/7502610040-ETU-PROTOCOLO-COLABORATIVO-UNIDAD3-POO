package taller16.Ejercicio3;

public class MensajePush extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
}