package Backend.ConexionBD;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface GestorSQLServer {

    static boolean encontrar_Registro(String consulta, String mensajeError) {
        boolean encontrado = false;

        try (Statement st = SQLServerBD.instanciaConexcion().conectar().createStatement()){
                ResultSet rs = st.executeQuery(consulta);
                while (rs.next())
                    encontrado = true;

            //System.out.println("Se encotró");
        }catch (SQLException e){
            System.out.println("ERROR ENCONTRAR_REGISTRO" + e);
            JOptionPane.showMessageDialog(null, mensajeError);
        }
        return encontrado;
    }

    static void modificar_Registro(String consulta,
                                   String mensajeRegistrado, String mensajeError){
        //Connection conexionBaseDatos = ConexionBaseDatos.conectar();

        try(Statement st = SQLServerBD.instanciaConexcion().conectar().createStatement()){

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
