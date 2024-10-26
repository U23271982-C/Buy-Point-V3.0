package Backend.ConexionBD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    static Connection conectar() {
        //Server de USERISRAEL
        String nombreBD = "BD_BuyPoint";
        String usuario = "sa";
        String contrasena = "12345689";
        String url = String.format
                ("jdbc:sqlserver://localhost:1433;databaseName=%s;" +
                        "encrypt=true;trustServerCertificate=true", nombreBD);
        try {
            Connection conn =
                    DriverManager.getConnection(url, usuario, contrasena);

            System.out.println("¡Conexión exitosa a SQL Server!");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog
                    (null,
                            "Error de conexión de Base de Datos");
        }
        return null;
    }
}
