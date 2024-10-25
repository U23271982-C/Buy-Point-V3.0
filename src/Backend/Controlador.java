package Backend;

import Backend.ConexionBD.GestorSQLServer;

public class Controlador implements GestorSQLServer {
    public boolean iniciarSesion(CredencialesUsuario credencialesUsuario){

        String consultaSQL =
                String.format("SELECT Usuario, Constrasenna\n" +
                        "FROM CredencialesTienda\n" +
                        "WHERE Usuario = '%s' AND Constrasenna = '%s'",
                        credencialesUsuario.getUsuario(),
                        credencialesUsuario.getContrasenna());

        return GestorSQLServer.registroEncontrado
                (consultaSQL, "Error al Iniciar Sesion");
    }
}
