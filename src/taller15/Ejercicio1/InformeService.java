package taller15.Ejercicio1;

public class InformeService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro: " + libro.getTitulo() + " de " + libro.getAutor());
    }
}