package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.CredencialesUsuario;

/*
* Contralador, se encarga de controlar todos los botones de la App
* */
public class ControladorApp {

    static String consultaSQL;

    public ControladorApp() {
    }
    //Inicar sesion de  BuyPoint
    public static boolean iniciarSesion(CredencialesUsuario credencialesUsuario){
        consultaSQL =
                String.format("SELECT Usuario, Constrasenna\n" +
                        "FROM CredencialesTienda\n" +
                        "WHERE Usuario = '%s' AND Constrasenna = '%s'",
                        credencialesUsuario.getUsuario(),
                        credencialesUsuario.getContrasenna());

        return GestorSQLServer.encontrar_Registro
                (consultaSQL, "Error al Iniciar Sesion");
    }

}
