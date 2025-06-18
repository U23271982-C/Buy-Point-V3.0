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
import static Backend.ConexionBD.CargarDatos.loadProperties;
import static Backend.ConexionBD.Decrypt.decrypt;

public class SQLServerBD {
    public static Logger logger = Logger.getLogger(SQLServerBD.class.getName());
    private Connection conn = null;
    private static SQLServerBD instancia = null;

    //Se modificó la clase SQLServerBD para poder recibir los datos del archivo database.properties
    //Patrón Singleton
    public SQLServerBD() {
        try {
            Properties props = loadProperties();
           String nombreBD = decrypt(props.getProperty("db.name"));
            String host = decrypt(props.getProperty("db.host"));
            String port = decrypt(props.getProperty("db.port"));
            String usuario = decrypt(props.getProperty("db.user"));
            String contrasena = decrypt(props.getProperty("db.password"));

            String strConexion = "jdbc:sqlserver://"+host+":"+port+";"
                    + "database="+nombreBD+";"
                    + "user="+usuario+";"
                    + "password="+contrasena+";"
                    + "encrypt=true;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=30;";


            conn = DriverManager.getConnection(strConexion);
            logger.info("¡Conexión exitosa a SQL Server!");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error de conexión de Base de Datos", e);
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }

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
