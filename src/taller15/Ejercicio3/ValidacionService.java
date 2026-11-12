package taller15.Ejercicio3;

public class ValidacionService {
    public boolean validar(Usuario usuario) {
        return usuario.getNombre() != null
                && !usuario.getNombre().isEmpty()
                && usuario.getContrasena().length() >= 4;
    }
}