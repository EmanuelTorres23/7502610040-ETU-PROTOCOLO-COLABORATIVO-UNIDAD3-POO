package taller15.Ejercicio1;

public class PersistenciaService {
    public void guardar(Libro libro) {
        System.out.println("Guardando el libro " + libro.getTitulo() + " en la base de datos...");
    }
}