package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Codigo;
import Backend.Entidades.Entidad;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCodigo implements GestorSQLServer<Codigo> {
    @Override
    public void registrar(Codigo nuevaEntidad) {
        String consultaSQL = "{ CALL pa_registrarCodigo(?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)){

            comando.setString(1, nuevaEntidad.getCodigo());
            comando.setString(2, nuevaEntidad.getProducto().getNombreProducto());

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
    public Codigo leer(Codigo leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Codigo eliminadoEntidad) {

    }

    @Override
    public void actualizar(Codigo actualizadoEntidad) {

    }

    @Override
    public ArrayList<Codigo> listar() {
        return null;
    }
}
