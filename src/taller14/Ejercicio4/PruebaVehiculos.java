package taller14.Ejercicio4;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Coche();
        miVehiculo.mover();

        miVehiculo = new Bicicleta();
        miVehiculo.mover();
    }
}