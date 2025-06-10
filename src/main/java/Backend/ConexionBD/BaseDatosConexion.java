package Backend.ConexionBD;

public abstract class BaseDatosConexion <T> {
    protected T connection;
    protected String nameBD;
    protected String host;
    protected String url;
    protected String port;
    protected String user;
    protected String password;

    protected abstract void connect();
    protected abstract void disconnect();
    public abstract T getConnection();
}
