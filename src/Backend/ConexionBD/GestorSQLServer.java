package Backend.ConexionBD;

import javax.swing.*;
import java.sql.*;

public interface GestorSQLServer {
    static Connection conectarBD() {
        //Server de USERISRAEL
        String nombreBD = "BD_BuyPoint";
        String usuario = "sa";
        String contrasena = "12345689";
        String url = String.format
                ("jdbc:sqlserver://localhost:1433;databaseName=%s;" +
                        "encrypt=true;trustServerCertificate=true", nombreBD);
        try (Connection conn =
                     DriverManager.getConnection(url, usuario, contrasena)) {
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

    static boolean registroEncontrado(String consulta, String mensajeError) {

        boolean encontrado = false;

        Statement st;
        try{
            st = GestorSQLServer.conectarBD().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()){
                encontrado = true;
            }
        }catch (SQLException e){
            System.out.println("Erro al Iniciar Sesion" + e);
            JOptionPane.showMessageDialog(null, mensajeError);
        }
        return encontrado;
    }
    //da el numero de registros que hay
    static int cantidadRegistro() {
        return 0;
    }
}
