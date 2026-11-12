package taller16.Ejercicio2;

public class ExportadorWord implements Exportador {
    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a Word: " + documento.getTitulo());
    }
}