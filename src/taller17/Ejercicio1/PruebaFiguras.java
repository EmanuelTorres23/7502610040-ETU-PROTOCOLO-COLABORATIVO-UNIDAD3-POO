package taller17.Ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(3),
                new Rectangulo(4, 5)
        };

        for (Figura figura : figuras) {
            System.out.println(figura.getClass().getSimpleName() + ": " + String.format("%.2f", figura.calcularArea()));
        }
    }
}