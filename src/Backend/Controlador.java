package Backend;

public class Controlador implements ConsultadorSQL{
    public boolean iniciarSesion(CredencialesUsuario credencialesUsuario){
        String consultaSQL =
                String.format("SELECT Usuario, Constrasenna\n" +
                        "FROM CredencialesTienda\n" +
                        "WHERE Usuario = '%s' AND Constrasenna = '%s'",
                        credencialesUsuario.getUsuario(), credencialesUsuario.getContrasenna());
        return ConsultadorSQL.registroEncontrado(consultaSQL);
    }
}
