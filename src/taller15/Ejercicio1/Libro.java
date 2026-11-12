package taller15.Ejercicio1;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public void generarReporte() {
        System.out.println("Reporte del libro: " + titulo + " de " + autor);
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando el libro " + titulo + " en la base de datos...");
    }
}

// Libro tiene tres razones para cambiar:
// 1) Si cambia la información que tiene un libro.
// 2) Si cambia el formato del reporte.
// 3) Si cambia la forma de guardarlo (la base de datos).
// Cada cambio obliga a modificar la misma clase.