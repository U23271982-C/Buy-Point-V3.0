package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Entidad;
import Backend.Entidades.PaqueteProducto;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlPaqueteProducto implements GestorSQLServer<PaqueteProducto>{
    @Override
    public void registrar(PaqueteProducto nuevaEntidad) {
        String consultaSQL = "{ CALL pa_registrarPaqueteProducto(?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)){

            comando.setInt(1, nuevaEntidad.getCantidad());
            comando.setDate(2, java.sql.Date.valueOf(nuevaEntidad.getFechaCaducidad()));
            comando.setString(3, nuevaEntidad.getProducto().getCodigo().getCodigo());

            comando.executeQuery();
            System.out.println("Se registró las nuevas Credenciales");
            JOptionPane.showMessageDialog(null, "Se registró las nuevas Credenciales");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }
    }

    @Override
    public PaqueteProducto leer(PaqueteProducto leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(PaqueteProducto eliminadoEntidad) {

    }

    @Override
    public void actualizar(PaqueteProducto actualizadoEntidad) {

    }

    @Override
    public ArrayList<PaqueteProducto> listar() {
        return null;
    }
}
