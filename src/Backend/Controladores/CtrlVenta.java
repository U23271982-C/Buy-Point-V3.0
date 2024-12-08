package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.*;
import Backend.Gestores.GestorSQLServer;

import javax.sound.sampled.Port;
import javax.swing.*;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CtrlVenta implements GestorSQLServer<Venta> {
    public CtrlVenta() {
    }

    @Override
    public void registrar(Venta nuevaEntidad) {
        String consultaSQL =
                "{ CALL paT_registrarVentaCompuesto" +
                        "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";

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
            comando.setString
                    (12, nuevaEntidad.getComprobante()
                            .getComprobante());
            comando.setString
                    (13, nuevaEntidad.getComprobante()
                            .getTipoPago().getTipoPago());

            comando.executeUpdate();
            String aviso = "Se registró la 1Venta";

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                            ("ERROR al registrar la Venta"));
        }
    }

    public static void main(String[] args) {
        DateTimeFormatter fttHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter fttFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        CtrlVenta ctrlVenta = new CtrlVenta();
        Venta v = new Venta();
        Cliente cliente = new Cliente();
        Comprobante comprobante = new Comprobante();
        DetalleVenta detalleVenta = new DetalleVenta();
        Producto producto = new Producto();
        comprobante.setIdComprobante(1);
        cliente.setCliente("Directo");

        producto.getInventario().setPrecioCosto(BigDecimal.valueOf(20.20));
        detalleVenta.setPrecioUnitario(BigDecimal.valueOf(30.30));
        detalleVenta.setTotal(BigDecimal.valueOf(12.20));

        v.setFecha(LocalDate.now());
        v.setHora(LocalTime.now());
        v.getDetallesVenta().add(detalleVenta);
        //v.setSubTotal(BigDecimal.valueOf(20.20));
        //v.setTotal(BigDecimal.valueOf(12.20));
        v.setCliente(cliente);
        v.setComprobante(comprobante);

        System.out.println(v.getTotal());

        //ctrlVenta.registrar(v);
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
