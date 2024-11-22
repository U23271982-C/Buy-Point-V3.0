package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Empaque;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlEmpaque implements GestorSQLServer<Empaque> {
    public CtrlEmpaque() {
    }

    @Override
    public void registrar(Empaque nuevaEntidad) {
        String consultaSQL =
                "{ CALL pa_registrarEmpaque(?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getTipoEmpaque());

            comando.executeQuery();
            String aviso = String.format
                    ("Se registró el Empaque: %s",
                            nuevaEntidad.getTipoEmpaque());

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("ERROR al registrar el Empaque"));
        }
    }

    @Override
    public Empaque leer(Empaque leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Empaque eliminadoEntidad) {

    }

    @Override
    public void actualizar(Empaque actualizadoEntidad) {

    }

    @Override
    public ArrayList<Empaque> listar() {
        return null;
    }
}
