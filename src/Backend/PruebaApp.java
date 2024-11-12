package Backend;

import Backend.Entidades.CredencialesTienda;

public class PruebaApp {
    public static void main(String[] args) {
        CredencialesTienda credencialesUsuario = new CredencialesTienda();
        credencialesUsuario.setUsuario("user_Israel");
        credencialesUsuario.setContrasenna("123456");
        credencialesUsuario.setNombre("Israel");
        credencialesUsuario.setDireccion("dsf");
        credencialesUsuario.setCorreoElectronico("665");

        //credencialesUsuario.<CredencialesUsuario > eliminar();

        System.out.println("SELECT Usuario, Constrasenna\n" +
                "FROM CredencialesTienda\n" +
                "WHERE Usuario = 'USER1' AND Constrasenna = '123'");
    }
}
