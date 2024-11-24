package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Departamento;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlDepartamento implements GestorSQLServer<Departamento> {
    public CtrlDepartamento() {
    }

    @Override
    public void registrar(Departamento nuevaEntidad) {
        String consultaSQL =
                "{ CALL pa_registrarDepartamento(?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setInt(1,
                    nuevaEntidad.getTorre());
            comando.setInt(2,
                    nuevaEntidad.getDepartamento());

            comando.executeUpdate();
            String aviso = String.format
                    ("Se registró el Departamento: %s %s",
                            nuevaEntidad.getTorre(),
                            nuevaEntidad.getDepartamento());

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("ERROR al registrar el Departamento"));
        }
    }

    @Override
    public Departamento leer(Departamento leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Departamento eliminadoEntidad) {

    }

    @Override
    public void actualizar(Departamento actualizadoEntidad) {

    }

    @Override
    public ArrayList<Departamento> listar() {
        return null;
    }
}
