package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.*;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                    (3, nuevaEntidad.calcularSubTotal());
            comando.setBigDecimal
                    (4, nuevaEntidad.calcularTotal());

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

    /*public static void main(String[] args) {
        *//*DateTimeFormatter fttHora = DateTimeFormatter.ofPattern("HH:mm:ss");
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

        System.out.println(v.getTotal());*//*

        //ctrlVenta.registrar(v);
        Object[] nol = CtrlVenta.fechaMasVenta();
        System.out.println(nol[0]);
    }*/

    @Override
    public Venta leer(Venta leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Venta eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarVenta(?) }";

        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar()
                            .prepareCall(consultaSQL)) {

            comando.setInt(1, eliminadoEntidad.getIdVenta());


            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Venta actualizarEntidad) {

    }

    @Override
    public ArrayList<Venta> listar() {
        ArrayList<Venta> ventas = new ArrayList<>();
        String consulta = "{ CALL pa_listarVenta() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            Venta co = null;
            while (filas.next()) {
                co = new Venta();
                co.setFecha(filas.getDate(1).toLocalDate());
                co.setHora(filas.getTime(2).toLocalTime());
                co.setSubTotal(filas.getBigDecimal(3));
                co.setTotal(filas.getBigDecimal(4));
                co.getCliente().setCliente(filas.getString(5));
                co.getCliente().setIdentificacion(filas.getString(6));
                co.getCliente().getDepartamento().setTorre(filas.getShort(7));
                co.getCliente().getDepartamento().setDepartamento(filas.getShort(8));
                co.getCliente().getCuenta().setNombre(filas.getString(9));
                co.getCliente().getCuenta().setApellido(filas.getString(10));
                co.getCliente().getCuenta().setTelefono(filas.getInt(11));
                co.setIdVenta(filas.getInt(12));

                ventas.add(co);
            }

            return ventas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int ultimoID(){
        String consultaSQL = " SELECT dbo.fn_extraerID_UltimaVenta() ";
        int res = 0;
        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                res = filas.getInt(1);
            }
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }
        return res;
    }

    public static Object[] fechaMasVenta(){
        String consultaSQL = "{ CALL pa_FechaMasVenta() }";
        Object[] cosas = new Object[2];
        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                cosas[0] = filas.getDate(1).toLocalDate();
                cosas[1] = filas.getDouble(2);
            }
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }
        return cosas;
    }

    public static List<Object[]> utilidadFecha(int reporteDias){
        String consultaSQL = "{ CALL pa_UtilidadFecha(?) }";
        List<Object[]> lista = new ArrayList<>();
        Object[] cosas = null;
        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){
            comando.setInt(1, reporteDias);

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                cosas = new Object[2];

                cosas[0] = filas.getDate(1).toLocalDate();
                cosas[1] = filas.getDouble(2);
                lista.add(cosas);
            }
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }
        return lista;
    }

/*    public static void main(String[] args) {
        System.out.println(Arrays.toString(CtrlVenta.utilidadFecha(2).get(0)));
    }*/
}
