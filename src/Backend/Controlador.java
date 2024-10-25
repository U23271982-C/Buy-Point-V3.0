package Backend;

import Backend.ConexionBD.GestorSQLServer;
/*
* Contralador, se encarga de controlar todos los botones de la App
* */
public class Controlador implements GestorSQLServer {

    String consultaSQL;

    public Controlador() {
    }

    //Inicar sesion de BuyPoint
    public boolean iniciarSesion(CredencialesUsuario credencialesUsuario){
        consultaSQL =
                String.format("SELECT Usuario, Constrasenna\n" +
                        "FROM CredencialesTienda\n" +
                        "WHERE Usuario = '%s' AND Constrasenna = '%s'",
                        credencialesUsuario.getUsuario(),
                        credencialesUsuario.getContrasenna());

        return GestorSQLServer.registroEncontrado
                (consultaSQL, "Error al Iniciar Sesion");
    }

}
