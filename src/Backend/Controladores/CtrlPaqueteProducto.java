package Backend.Controladores;

import Backend.Entidades.Comprobante;
import Backend.Gestores.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.PaqueteProducto;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlPaqueteProducto implements GestorSQLServer<PaqueteProducto>{

    public CtrlPaqueteProducto() {

    }

    @Override
    public void registrar(PaqueteProducto nuevaEntidad) {
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
    public PaqueteProducto leer(PaqueteProducto leerEntidad) {
        PaqueteProducto paqueteProducto = null;
        String consultaSQL = "{ CALL pa_leerPaqueteProducto(?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar()
                             .prepareCall(consultaSQL)){

            comando.setString(1,leerEntidad
                    .getProducto().getCodigo().getCodigo());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                paqueteProducto = new PaqueteProducto();

                paqueteProducto.
                        getProducto().setNombreProducto
                                (filas.getString(1));

                paqueteProducto.setCantidad
                        (filas.getInt(2));

                paqueteProducto.setFechaCaducidad
                        (filas.getDate(3).toLocalDate());

                paqueteProducto.setCaducado(filas.getBoolean(4));

            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return paqueteProducto;
    }

    @Override
    public void eliminar(PaqueteProducto eliminadoEntidad) {
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
    public void actualizar(PaqueteProducto actualizadoEntidad) {
        // FALTA LÓGICA
    }

    @Override
    public ArrayList<PaqueteProducto> listar() {
        ArrayList<PaqueteProducto> paqueteProductos = new ArrayList<>();
        String consulta = "{ CALL pa_listarPaqueteProducto() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            PaqueteProducto co = null;
            while (filas.next()) {
                co = new PaqueteProducto();

                co.getProducto().setNombreProducto
                        (filas.getString(1));
                co.setCantidad(filas.getInt(2));
                co.setFechaCaducidad(filas.getDate(3).toLocalDate());
                co.setCaducado(filas.getBoolean(4));

                paqueteProductos.add(co);
            }

            return paqueteProductos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
