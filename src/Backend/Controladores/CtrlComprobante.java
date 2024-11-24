package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Comprobante;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlComprobante implements GestorSQLServer<Comprobante> {
    public CtrlComprobante() {
    }

    @Override
    public void registrar(Comprobante nuevaEntidad) {
        String consultaSQL =
                "{ CALL paT_registrarComprobanteCompuesto(?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getComprobante());
            comando.setString(2,
                    nuevaEntidad.getTipoPago().getTipoPago());

            comando.executeUpdate();
            System.out.printf("Se registró el comprobante: %s",
                    nuevaEntidad.getComprobante());
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("Se registró el comprobante: %s y %s",
                            nuevaEntidad.getComprobante(),
                            nuevaEntidad.getTipoPago().getTipoPago()));

        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                    ("ERROR al registrar el cliente"));
        }
    }

    @Override
    public Comprobante leer(Comprobante leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Comprobante eliminadoEntidad) {

    }

    @Override
    public void actualizar(Comprobante actualizadoEntidad) {

    }

    @Override
    public ArrayList<Comprobante> listar() {
        return null;
    }
}
