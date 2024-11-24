package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.TipoPago;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlTipoPago implements GestorSQLServer<TipoPago> {
    public CtrlTipoPago() {
    }

    @Override
    public void registrar(TipoPago nuevaEntidad) {
        String consultaSQL =
                "{ CALL pa_registrarTipoPago(?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getTipoPago());

            comando.executeUpdate();
            String aviso = String.format
                    ("Se registró el Tipo de Pago: %s",
                    nuevaEntidad.getTipoPago());

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("ERROR al registrar el Tipo de Pago"));
        }
    }

    @Override
    public TipoPago leer(TipoPago leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(TipoPago eliminadoEntidad) {

    }

    @Override
    public void actualizar(TipoPago actualizadoEntidad) {

    }

    @Override
    public ArrayList<TipoPago> listar() {
        return null;
    }
}
