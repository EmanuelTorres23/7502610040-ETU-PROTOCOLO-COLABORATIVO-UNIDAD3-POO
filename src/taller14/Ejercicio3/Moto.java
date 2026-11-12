//package taller14.Ejercicio3;

// public class Moto extends Vehiculo {
//     @Override
//     public void mover() {
//         super.mover(); // Solo llama al método del padre
//     }
// }
//
// ¿Por qué está mal?
// Moto sobrescribe mover(), pero no cambia nada. Solo llama a super.mover(),
// así que imprime exactamente lo mismo que Vehiculo: "El vehículo se está moviendo."
//
// Sobrescribir significa dar un comportamiento propio. Aquí no hay ningún
// comportamiento propio, así que el método sobra.
//
// Por qué es mala práctica:
// 1) Quien lea Moto cree que tiene un mover() distinto al de Vehiculo y pierde
//    tiempo buscando la diferencia.
// 2) Agrega código que no hace nada útil, y ese código hay que mantenerlo.
// 3) Si Moto debe moverse igual que Vehiculo, lo correcto es borrar mover()
//    y dejar que lo herede.
//
// No genera error de compilación, por eso es una mala práctica y no un error.