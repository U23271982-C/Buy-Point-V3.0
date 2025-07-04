package Backend.ConexionBD;

import java.sql.*;
import java.util.logging.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;

public class SQLServerConexion extends BaseDatosConexion<Connection> {
    public static Logger logger = Logger.getLogger(SQLServerConexion.class.getName());
    //private Connection conn = null;
    private static SQLServerConexion instancia = null;
    private static final String ENCRYPTION_KEY = "1234567891234567";

    //Se modificó la clase SQLServerBD para poder recibir los datos del archivo database.properties
    //Patrón Singleton
    public SQLServerConexion() {
        try {
            //Cargamos las propiedades de la base de datos desde el archivo database.properties
            Properties props = loadProperties();
            super.nameBD = props.getProperty("db.name");
            super.host = props.getProperty("db.host");
            super.port = props.getProperty("db.port");
            super.user = decrypt(props.getProperty("db.user"));
            super.password = decrypt(props.getProperty("db.password"));

            super.url = String.format(
                    "jdbc:sqlserver://%s:%s;databaseName=%s;" +
                            "encrypt=true;trustServerCertificate=true",
                    host, port, nameBD);
        } catch (Exception e){
            logger.log(Level.SEVERE, "Error al inicializar la conexión a SQL Server", e);
            throw new RuntimeException("Error al inicializar la conexión a SQL Server", e);
        }
    }

    //cargamos los datos almacenamos en el archivo database.properties
    private Properties loadProperties() {
        Properties props = new Properties();
        try (InputStream input = SQLServerConexion.class.getClassLoader()
                .getResourceAsStream("database.properties")) {
            if (input == null) {
                throw new RuntimeException("No se puede encontrar database.properties");
            }
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Error al cargar la configuración", e);
        }
        return props;
    }

    //Descencriptamos las credenciales para la conexion a la bd
    private String decrypt(String encryptedText) throws Exception {
        SecretKeySpec key = new SecretKeySpec(
                ENCRYPTION_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(
                Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }

    public static SQLServerConexion instanciaConexcion() {
        // Verificamos si la instancia es nula, si es así, creamos una nueva instancia
        if (instancia == null) instancia = new SQLServerConexion();
        return instancia;
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    protected void connect() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
                logger.info("¡Conexión exitosa a SQL Server!");
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error de conexión de Base de Datos", e);
                throw new RuntimeException("Error al conectar con la base de datos", e);
            }
        }

    }

    @Override
    protected void disconnect() {
        try {
            // Verificamos si la conexión no es nula y está abierta antes de cerrarla
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión a SQL Server cerrada.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al cerrar conexión SQL Server", e);
        }
    }
}
