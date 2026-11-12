package taller15.Ejercicio2;

public class PrecioService {
    public double calcularPrecioConImpuesto(Producto producto) {
        return producto.getPrecio() * 1.15;
    }
}