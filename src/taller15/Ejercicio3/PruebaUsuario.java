package taller15.Ejercicio3;

public class PruebaUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");

        AutenticacionService autenticacionService = new AutenticacionService();
        ValidacionService validacionService = new ValidacionService();

        System.out.println("Validación usuario admin: " + validacionService.validar(usuario));
        System.out.println("Autenticación correcta: " + autenticacionService.autenticar(usuario, "1234"));
        System.out.println("Autenticación incorrecta: " + autenticacionService.autenticar(usuario, "0000"));

        Usuario usuarioCorto = new Usuario("ana", "12");
        System.out.println("Validación usuario con contraseña corta: " + validacionService.validar(usuarioCorto));
    }
}