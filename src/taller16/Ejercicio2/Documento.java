package taller16.Ejercicio2;

public class Documento {
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exportarPDF() {
        System.out.println("Exportando a PDF: " + titulo);
    }
}