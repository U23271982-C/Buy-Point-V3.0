package Backend.Controladores;

import Backend.Gestores.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Lote;
import Backend.Entidades.Producto;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlPaqueteProducto implements GestorSQLServer<Lote>{

    public CtrlPaqueteProducto() {

    }

    @Override
    public void registrar(Lote nuevaEntidad) {
        String consultaSQL = "{ CALL paT_registrarPaqueteProducto(?, ?, ?) }";

        try (CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consultaSQL)){

            comando.setInt
                    (1, nuevaEntidad.getProducto().getPaqueteProducto().getCantidad());
            comando.setDate
                    (2, java.sql.Date.valueOf(nuevaEntidad.getProducto().getPaqueteProducto().getFechaCaducidad()   ));
            comando.setString
                    (3, nuevaEntidad.getProducto().getCodigo()
                            .getCodigo());

            comando.executeUpdate();

            System.out.println("Se registró el nuevo Paquete del Producto");
            JOptionPane.showMessageDialog(null,
                    "Se registró el nuevo Paquete del Producto");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al registrar el Paquete del Producto");
        }
    }

    @Override
    public Lote leer(Lote leerEntidad) {
        Lote lote = null;
        String consultaSQL = "{ CALL pa_leerPaqueteProducto(?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar()
                             .prepareCall(consultaSQL)){

            comando.setString(1,leerEntidad
                    .getProducto().getCodigo().getCodigo());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                lote = new Lote();

                lote.
                        getProducto().setNombreProducto
                                (filas.getString(1));

                lote.setCantidad
                        (filas.getInt(2));

                lote.setFechaCaducidad
                        (filas.getDate(3).toLocalDate());

                lote.setCaducado(filas.getBoolean(4));

            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return lote;
    }

    @Override
    public void eliminar(Lote eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarPaqueteProducto(?) }";

        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar()
                            .prepareCall(consultaSQL)) {

            comando.setInt(1,
                    eliminadoEntidad.getIdPaqueteProducto());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Comprobante eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Lote actualizarEntidad) {
        // FALTA LÓGICA
    }

    @Override
    public ArrayList<Lote> listar() {
        ArrayList<Lote> lotes = new ArrayList<>();
        String consulta = "{ CALL pa_listarPaqueteProducto() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            //leer()
            //comando.setString(1, );
            ResultSet filas = comando.executeQuery();
            Lote co = null;
            Producto p = null;
            while (filas.next()) {
                co = new Lote();
                p = new Producto();
                
                co.setProducto(p);
                co.getProducto().setNombreProducto
                        (filas.getString(1));
                co.setCantidad(filas.getInt(2));
                co.setFechaCaducidad(filas.getDate(3).toLocalDate());
                co.setCaducado(filas.getBoolean(4));
                co.setIdPaqueteProducto(filas.getInt(5));

                lotes.add(co);
            }

            return lotes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // Listar paquete de producto a partir de un codigo de barras del producto
    public ArrayList<Lote> codigoProducto(Lote lote){
        ArrayList<Lote> lotes = new ArrayList<>();
        String consulta = "{ CALL pa_listarPaqueteProductoCodigo(?) }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                    .conectar().prepareCall(consulta)) {

            //leer()
            comando.setString(1, lote.getProducto().getCodigo().getCodigo());
            ResultSet filas = comando.executeQuery();
            Lote co = null;
            Producto p = null;
            while (filas.next()) {
                co = new Lote();
                p = new Producto();

                co.setProducto(p);
                co.getProducto().setNombreProducto
                        (filas.getString(1));
                co.setCantidad(filas.getInt(2));
                co.setFechaCaducidad(filas.getDate(3).toLocalDate());
                co.setCaducado(filas.getBoolean(4));
                co.setIdPaqueteProducto(filas.getInt(5));

                lotes.add(co);
            }

            return lotes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //String codigo = "";
    }

}
