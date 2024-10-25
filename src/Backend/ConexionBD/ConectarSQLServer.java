package Backend.ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarSQLServer {
    static void conectar
            (String nombreBD, String usuario, String contrasena) {
        String url = String.format
                ("jdbc:sqlserver://localhost:1433;databaseName=%s;" +
                        "encrypt=true;trustServerCertificate=true", nombreBD);

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasena)) {
            System.out.println("¡Conexión exitosa a SQL Server!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
