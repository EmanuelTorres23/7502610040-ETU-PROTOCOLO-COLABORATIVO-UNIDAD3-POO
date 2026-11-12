package taller16.Ejercicio1;

public class PruebaDescuento {
    public static void main(String[] args) {
        double precio = 100000;

        Descuento descuentoPorcentaje = new Descuento(10);
        Descuento descuentoFijo = new DescuentoFijo(5000);

        System.out.println("Precio original: " + precio);
        System.out.println("Con descuento de 10%: " + descuentoPorcentaje.aplicar(precio));
        System.out.println("Con descuento fijo de 5000: " + descuentoFijo.aplicar(precio));
    }
}