package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.DetalleVenta;
import Backend.Entidades.Venta;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlVenta implements GestorSQLServer<Venta> {
    public CtrlVenta() {
    }

    @Override
    public void registrar(Venta nuevaEntidad) {
        String consultaSQL =
                "{ CALL paT_registrarVentaCompuesto" +
                        "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setDate
                    (1,
                    java.sql.Date.valueOf(nuevaEntidad.getFecha()));
            comando.setTime
                    (2,
                    java.sql.Time.valueOf(nuevaEntidad.getHora()));
            comando.setBigDecimal
                    (3, nuevaEntidad.getSubTotal());
            comando.setBigDecimal
                    (4, nuevaEntidad.getTotal());

            comando.setString
                    (5, nuevaEntidad.getCliente().getCliente());
            comando.setString
                    (6, nuevaEntidad.getCliente()
                            .getIdentificacion());
            comando.setInt
                    (7, nuevaEntidad.getCliente()
                            .getDepartamento().getTorre());
            comando.setInt
                    (8, nuevaEntidad.getCliente()
                            .getDepartamento().getDepartamento());
            comando.setString
                    (9, nuevaEntidad.getCliente()
                            .getCuenta().getNombre());
            comando.setString
                    (10, nuevaEntidad.getCliente()
                            .getCuenta().getApellido());
            comando.setInt
                    (11, nuevaEntidad.getCliente()
                            .getCuenta().getTelefono());
            comando.setInt
                    (12, nuevaEntidad.getComprobante()
                            .getIdComprobante());

            comando.executeUpdate();
            String aviso = "Se registró la Venta";

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                            ("ERROR al registrar la Venta"));
        }
    }

    @Override
    public Venta leer(Venta leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Venta eliminadoEntidad) {

    }

    @Override
    public void actualizar(Venta actualizarEntidad) {

    }

    @Override
    public ArrayList<Venta> listar() {
        return null;
    }
}
