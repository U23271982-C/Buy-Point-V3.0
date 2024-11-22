package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Cliente;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCliente implements GestorSQLServer<Cliente> {
    public CtrlCliente() {
    }

    @Override
    public void registrar(Cliente nuevaEntidad) {
        String consultaSQL = "{ CALL paT_registrarClienteCompuesto(?, ?, ?, ?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)){

            comando.setString(1,nuevaEntidad.getCliente());
            comando.setString(2,nuevaEntidad.getCliente());
            comando.setInt(3,nuevaEntidad.getDepartamento().getTorre());
            comando.setInt(4,nuevaEntidad.getDepartamento().getDepartamento());
            comando.setString(5,nuevaEntidad.getCuenta().getNombre());
            comando.setString(6,nuevaEntidad.getCuenta().getApellido());

            comando.executeQuery();
            System.out.printf("Se registró el producto: %s", nuevaEntidad.getCliente());
            JOptionPane.showMessageDialog(null, String.format
                    ("Se registró el CLiente"));

        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, String.format
                    ("ERROR al registrar el cliente"));
        }
    }

    @Override
    public Cliente leer(Cliente leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Cliente eliminadoEntidad) {

    }

    @Override
    public void actualizar(Cliente actualizadoEntidad) {

    }

    @Override
    public ArrayList<Cliente> listar() {
        return null;
    }
}
