package Backend.ConexionBD;

public interface BaseDatosConexion {
    void connect();
    void disconnect();
    Object getConnection();
}
