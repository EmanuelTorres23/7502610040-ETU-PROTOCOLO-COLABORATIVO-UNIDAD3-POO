package taller17.Ejercicio3;

public class PruebaTransporte {
    public static void main(String[] args) {
        Transporte[] transportes = {
                new Bicicleta(),
                new Coche()
        };

        for (Transporte transporte : transportes) {
            transporte.mover();
        }
    }
}