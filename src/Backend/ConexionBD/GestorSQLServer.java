package Backend.ConexionBD;

import javax.swing.*;
import java.sql.*;

public interface GestorSQLServer {
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

    static boolean encontrar_Registro(String consulta, String mensajeError) {
        boolean encontrado = false;

        Connection con = GestorSQLServer.conectar();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()){
                encontrado = true;
            }
            //System.out.println("Se encotró");
        }catch (SQLException e){
            System.out.println("ERROR ENCONTRAR_REGISTRO" + e.getMessage());
            JOptionPane.showMessageDialog(null, mensajeError);
        }
        return encontrado;
    }

    static void modificar_Registro(String consulta,
                                   String mensajeRegistrado, String mensajeError){
        //Connection conexionBaseDatos = ConexionBaseDatos.conectar();
        Connection con = GestorSQLServer.conectar();
        try{
            Statement st = con.createStatement();
            int filasRegistradas = st.executeUpdate(consulta);

            JOptionPane.showMessageDialog(null, mensajeRegistrado);
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, mensajeError);
        }
    }

    //da el numero de registros que hay
    static int cantidad_Registro() {
        return 0;
    }

    void registrar();
    void eliminar();
    void actualizar();

}
