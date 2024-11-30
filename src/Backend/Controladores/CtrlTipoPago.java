package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Comprobante;
import Backend.Entidades.TipoPago;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
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
        TipoPago tipoPago = null;
        String consultaSQL = "{ CALL pa_leerTipoPagoe(?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar()
                             .prepareCall(consultaSQL)){

            comando.setString(1, leerEntidad.getTipoPago());


            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                tipoPago = new TipoPago();

                tipoPago.setTipoPago(filas.getString(1));
            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return tipoPago;
    }

    @Override
    public void eliminar(TipoPago eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarTipoProducto(?) }";

        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar()
                            .prepareCall(consultaSQL)) {

            comando.setString(1, eliminadoEntidad.getTipoPago());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Comprobante eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(TipoPago actualizadoEntidad) {

    }

    @Override
    public ArrayList<TipoPago> listar() {
        ArrayList<TipoPago> tipoPagos = new ArrayList<>();
        String consulta = "{ CALL pa_listarTipoPago() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            TipoPago co = null;
            while (filas.next()) {
                co = new TipoPago();
                co.setTipoPago(filas.getString(1));

                tipoPagos.add(co);
            }

            return tipoPagos;

        } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}}
