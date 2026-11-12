package taller16.Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double monto;

    public DescuentoFijo(double monto) {
        super(0);
        this.monto = monto;
    }

    @Override
    public double aplicar(double precio) {
        return precio - monto;
    }
}