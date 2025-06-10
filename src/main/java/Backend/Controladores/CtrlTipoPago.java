package Backend.Controladores;

import Backend.ConexionBD.SQLServerConexion;
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
                     SQLServerConexion.instanciaConexcion()
                             .getConnection().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getNombreTipoPago());

            comando.executeUpdate();
            String aviso = String.format
                    ("Se registró el Tipo de Pago: %s",
                    nuevaEntidad.getNombreTipoPago());

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
                     SQLServerConexion.instanciaConexcion().getConnection()
                             .prepareCall(consultaSQL)){

            comando.setString(1, leerEntidad.getNombreTipoPago());


            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                tipoPago = new TipoPago();

                tipoPago.setNombreTipoPago(filas.getString(1));
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
                    SQLServerConexion.instanciaConexcion().getConnection()
                            .prepareCall(consultaSQL)) {

            comando.setString(1, eliminadoEntidad.getNombreTipoPago());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Comprobante eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(TipoPago actualizarEntidad) {

    }

    @Override
    public ArrayList<TipoPago> listar() {
        ArrayList<TipoPago> tipoPagos = new ArrayList<>();
        String consulta = "{ CALL pa_listarTipoPago() }";

        try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                .getConnection().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            TipoPago co = null;
            while (filas.next()) {
                co = new TipoPago();
                co.setNombreTipoPago(filas.getString(1));

                tipoPagos.add(co);
            }

            return tipoPagos;

        } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}}
