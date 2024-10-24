package Backend;

public class Controlador implements ConsultadorSQL{
    public boolean iniciarSesion(CredencialesUsuario credencialesUsuario){
        String consultaSQL = "";
        return ConsultadorSQL.registroEncontrado(consultaSQL);
    }
}
