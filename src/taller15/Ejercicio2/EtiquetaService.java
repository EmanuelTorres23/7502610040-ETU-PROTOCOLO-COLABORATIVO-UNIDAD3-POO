package taller15.Ejercicio2;

public class EtiquetaService {
    public void generarEtiqueta(Producto producto) {
        System.out.println("=== ETIQUETA ===");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
    }
}