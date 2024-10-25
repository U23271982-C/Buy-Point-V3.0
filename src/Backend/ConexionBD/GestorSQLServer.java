package Backend.ConexionBD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public interface GestorSQLServer {
    static void conectar() {
        //Server de USERISRAEL
        String nombreBD = "BD_BuyPoint";
        String usuario = "sa";
        String contrasena = "12345689";
        String url = String.format
                ("jdbc:sqlserver://localhost:1433;databaseName=%s;" +
                        "encrypt=true;trustServerCertificate=true", nombreBD);
        try (Connection conn =
                     DriverManager.getConnection(url, usuario, contrasena)) {
            //System.out.println("¡Conexión exitosa a SQL Server!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog
                    (null,
                            "Error de conexión de Base de Datos");
        }
    }

    static boolean registroEncontrado(String consulta) {
        boolean rsp = false;
        GestorSQLServer.conectar();
        /*try{
        }catch (SQLException e){

        }*/
        //Connection conexion = Conexion.conectar();
        //Statement sta;
        //try{
            /*
            //st = cn.createStatement();
            //ResultSet = st.executeQuery(rsp);
            while(rs.next){
                rsp = true;
            }

            return rsp;
        }catch(/*SQLException e){
            JOptionPane.showMessageDialog
                    (null, "Error al iniciar sesión");
        }
        */
        return true;
    }
    //da el numero de registros que hay
    static int cantidadRegistro() {
        return 0;
    }
}
