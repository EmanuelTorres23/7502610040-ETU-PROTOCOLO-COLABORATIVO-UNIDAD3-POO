package taller14.Ejercicio2;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona(),
                new Estudiante(),
                new Profesor()
        };

        for (Persona persona : personas) {
            persona.presentarse();
        }
    }
}