package taller15.Ejercicio2;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Teclado mecánico", 150000);

        EtiquetaService etiquetaService = new EtiquetaService();
        etiquetaService.generarEtiqueta(producto);

        System.out.println("---");

        PrecioService precioService = new PrecioService();
        double precioFinal = precioService.calcularPrecioConImpuesto(producto);
        System.out.println("Precio con impuesto: " + String.format("%.2f", precioFinal));
    }
}