package taller16.Ejercicio2;

public class PruebaDocumento {
    public static void main(String[] args) {
        Documento documento = new Documento("Informe mensual");

        documento.exportarPDF();

        Exportador[] exportadores = {
                new ExportadorWord(),
                new ExportadorExcel()
        };

        for (Exportador exportador : exportadores) {
            exportador.exportar(documento);
        }
    }
}