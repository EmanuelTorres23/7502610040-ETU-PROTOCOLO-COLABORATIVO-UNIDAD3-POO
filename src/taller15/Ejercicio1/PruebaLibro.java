package taller15.Ejercicio1;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez");

        libro.mostrarInformacion();
        System.out.println("---");

        InformeService informeService = new InformeService();
        informeService.generarReporte(libro);

        PersistenciaService persistenciaService = new PersistenciaService();
        persistenciaService.guardar(libro);
    }
}