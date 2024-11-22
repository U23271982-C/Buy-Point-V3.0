package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Cuenta;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCuenta implements GestorSQLServer<Cuenta> {
    public CtrlCuenta() {
    }

    @Override
    public void registrar(Cuenta nuevaEntidad) {
        String consultaSQL =
                "{ CALL pa_registrarDepartamento(?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getNombre());
            comando.setString(2,
                    nuevaEntidad.getApellido());
            comando.setInt(3,
                    nuevaEntidad.getTelefono());

            comando.executeQuery();
            String aviso = String.format
                    ("Se registró la Cuenta de %s %s",
                            nuevaEntidad.getNombre(),
                            nuevaEntidad.getApellido());

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null, aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al registrar la Cuenta");
        }
    }

    @Override
    public Cuenta leer(Cuenta leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Cuenta eliminadoEntidad) {

    }

    @Override
    public void actualizar(Cuenta actualizadoEntidad) {

    }

    @Override
    public ArrayList<Cuenta> listar() {
        return null;
    }
}
