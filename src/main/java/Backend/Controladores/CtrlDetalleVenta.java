package Backend.Controladores;

import Backend.ConexionBD.SQLServerConexion;
import Backend.Entidades.DetalleVenta;
import Backend.Gestores.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;

public class CtrlDetalleVenta implements DAO<DetalleVenta> {
    //ArrayList<DetalleVenta> detallesVenta1;

    public CtrlDetalleVenta() {
        
    }
    @Override
    public void registrar(DetalleVenta nuevaEntidad) {
         String consultaSQL =
                "{ CALL paT_registrarDetalleVenta" +
                        "(?, ?, ?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion()
                             .getConnection().prepareCall(consultaSQL)){

            comando.setInt
                    (1, nuevaEntidad.getCantidad());
            comando.setBigDecimal
                    (2, nuevaEntidad.getPrecioUnitario());
            comando.setBigDecimal
                    (3, nuevaEntidad.getSubTotal());
            comando.setBigDecimal
                    (4, nuevaEntidad.getTotal());
            comando.setString
                    (5, nuevaEntidad.getProducto().getNombreProducto());

            comando.executeUpdate();
            String aviso = "Se registró la 0Venta";

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                            ("ERROR al registrar la Venta" + e.getMessage() ));
        }
    }

    @Override
    public DetalleVenta leer(DetalleVenta leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(DetalleVenta eliminadoEntidad) {

    }

    @Override
    public void actualizar(DetalleVenta actualizarEntidad) {

    }

    @Override
    public ArrayList<DetalleVenta> listar() {
        return null;
    }
}
