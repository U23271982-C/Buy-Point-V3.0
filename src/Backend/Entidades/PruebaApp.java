package Backend.Entidades;

public class PruebaApp {
    public static void main(String[] args) {
        CredencialesUsuario credencialesUsuario = new CredencialesUsuario();
        credencialesUsuario.setUsuario("user_Israel");
        credencialesUsuario.setContrasenna("123456");
        credencialesUsuario.setNombre("Israel");
        credencialesUsuario.setDireccion("dsf");
        credencialesUsuario.setCorreoElectronico("665");

        credencialesUsuario.eliminar();

        System.out.println("SELECT Usuario, Constrasenna\n" +
                "FROM CredencialesTienda\n" +
                "WHERE Usuario = 'USER1' AND Constrasenna = '123'");
    }
}
