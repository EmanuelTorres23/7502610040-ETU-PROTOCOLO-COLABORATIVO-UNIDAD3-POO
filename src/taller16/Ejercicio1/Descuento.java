package taller16.Ejercicio1;

public class Descuento {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicar(double precio) {
        double descuento = precio * porcentaje / 100;
        return precio - descuento;
    }
}