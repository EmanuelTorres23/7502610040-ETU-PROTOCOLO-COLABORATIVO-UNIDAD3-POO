package taller14.Ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Figura(),
                new Circulo(3),
                new Rectangulo(4, 5)
        };

        for (Figura figura : figuras) {
            figura.calcularArea();
        }
    }
}