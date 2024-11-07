package Backend.ConexionBD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLServerBD {
    public static Logger logger = Logger.getLogger(GestorSQLServer.class.getName());
    private Connection conn = null;
    private static SQLServerBD instancia = null;

    //Patrón Singleton
    public SQLServerBD() {
        final String nombreBD = "BD_BuyPoint";
        final String usuario = "sa";
        final String contrasena = "12345689";
        final String strConexion = String.format
                ("jdbc:sqlserver://localhost:1433;databaseName=%s;" +
                        "encrypt=true;trustServerCertificate=true", nombreBD);
        try {
            conn = DriverManager.getConnection(strConexion, usuario, contrasena);
            System.out.println("¡Conexión exitosa a SQL Server!");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error de conexión de Baase de Datos", e);

            JOptionPane.showMessageDialog(null,
                    "Error de conexión de Base de Datos");
        }
    }

    public static SQLServerBD instanciaConexcion(){
        if (instancia == null) instancia = new SQLServerBD();
        return instancia;
    }

    public Connection conectar() {//Server de USERISRAEL
        return conn;
    }
}
