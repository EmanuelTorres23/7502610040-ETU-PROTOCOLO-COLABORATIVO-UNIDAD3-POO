//package taller14.Ejercicio3;

//public class PruebaAnimal {
    //public static void main(String[] args) {
        //Animal miAnimal = new Perro();
        //miAnimal.hacerSonido();

        // INTENTO INCORRECTO (comentado para que el proyecto compile)
        // miAnimal.correr();
        // Error de compilación (IntelliJ):
        // "Cannot resolve method 'correr()' in 'Animal'"
        //
        // Para ver el error: quita // solo de la línea miAnimal.correr();
        // y vuelve a comentarla después.
        //
        // ¿Por qué está mal?
        // miAnimal es de tipo Animal, así que el compilador solo permite
        // llamar los métodos que existen en Animal, como hacerSonido().
        // El objeto real es un Perro y sí tiene correr(), pero el compilador
        // revisa el tipo de la referencia, no el tipo del objeto que contiene.
        // Para usar correr() hay que declarar la variable como Perro:
        // Perro miPerro = new Perro();
        // miPerro.correr();
    //}
//}