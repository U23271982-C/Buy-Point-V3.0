package Backend.Controladores;

import Backend.ConexionBD.SQLServerConexion;
import Backend.Entidades.Comprobante;
import Backend.Gestores.DAO;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlComprobante implements DAO<Comprobante> {
    public CtrlComprobante() {
    }

    @Override
    public void registrar(Comprobante nuevaEntidad) {
        String consultaSQL =
                "{ CALL paT_registrarComprobanteCompuesto(?, ?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion()
                             .getConnection().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getComprobante());
            comando.setString(2,
                    nuevaEntidad.getTipoPago().getNombreTipoPago());

            comando.executeUpdate();
            System.out.printf("Se registró el comprobante: %s",
                    nuevaEntidad.getComprobante());
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("Se registró el comprobante: %s y %s",
                            nuevaEntidad.getComprobante(),
                            nuevaEntidad.getTipoPago().getNombreTipoPago()));

        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                    ("ERROR al registrar el cliente"));
        }
    }

    @Override
    public Comprobante leer(Comprobante leerEntidad) {
        Comprobante comprobante = null;
        String consultaSQL = "{ CALL pa_leerComprobante(?, ?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion().getConnection()
                             .prepareCall(consultaSQL)){

            comando.setString(1, leerEntidad.getComprobante());
            comando.setString(2, leerEntidad.getTipoPago().getNombreTipoPago());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                comprobante = new Comprobante();

                comprobante.setComprobante(filas.getString(1));
                comprobante.getTipoPago().setNombreTipoPago(filas.getString(2));

            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return comprobante;
    }

    @Override
    public void eliminar(Comprobante eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarComprobante(?) }";

        try(CallableStatement comando =
                    SQLServerConexion.instanciaConexcion().getConnection()
                            .prepareCall(consultaSQL)) {

            comando.setString(1, eliminadoEntidad.getComprobante());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Comprobante eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Comprobante actualizarEntidad) {
        // FALTA CONFIRMAR LA LLÓGICA
    }

    @Override
    public ArrayList<Comprobante> listar() {
        ArrayList<Comprobante> comprobantes = new ArrayList<>();
        String consulta = "{ CALL pa_listarComprobante() }";

        try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                .getConnection().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            Comprobante co = null;
            while (filas.next()) {
                co = new Comprobante();
                co.setComprobante(filas.getString(1));
                co.getTipoPago().setNombreTipoPago(filas.getString(2));

                comprobantes.add(co);
            }

            return comprobantes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
