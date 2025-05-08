package Backend.ConexionBD;

import Backend.Gestores.GestorSQLServer;
import javax.swing.*;
import java.sql.*;
import java.util.logging.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;

public class SQLServerBD {
    public static Logger logger = Logger.getLogger(SQLServerBD.class.getName());
    private Connection conn = null;
    private static SQLServerBD instancia = null;
    private static final String ENCRYPTION_KEY = "1234567891234567";

    //Se modificó la clase SQLServerBD para poder recibir los datos del archivo database.properties
    //Patrón Singleton
    public SQLServerBD() {
        try {
            Properties props = loadProperties();
            String nombreBD = props.getProperty("db.name");
            String host = props.getProperty("db.host");
            String port = props.getProperty("db.port");
            String usuario = decrypt(props.getProperty("db.user").substring(4));
            String contrasena = decrypt(props.getProperty("db.password").substring(4));

            String strConexion = String.format(
                    "jdbc:sqlserver://%s:%s;databaseName=%s;" +
                            "encrypt=true;trustServerCertificate=true",
                    host, port, nombreBD);

            conn = DriverManager.getConnection(strConexion, usuario, contrasena);
            logger.info("¡Conexión exitosa a SQL Server!");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error de conexión de Base de Datos", e);
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }

    }

    //cargamos los datos almacenamos en el archivo database.properties
    private Properties loadProperties() {
        Properties props = new Properties();
        try (InputStream input = SQLServerBD.class.getClassLoader()
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



    public static SQLServerBD instanciaConexcion(){
        if (instancia == null) instancia = new SQLServerBD();
        return instancia;
    }

    public Connection conectar() {
            return conn;
    }

    // Prueba de conexion
   /* public static void main(String[] args) {
        try {
            // Obtener la instancia del Singleton
            SQLServerBD connectionInstance = SQLServerBD.instanciaConexcion();
            // Probar la conexión
            if (connectionInstance.conectar() != null) {
                System.out.println("¡Conexión exitosa!");
            } else {
                System.out.println("Conexión fallida.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
