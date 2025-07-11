package Backend.Controladores;

import Backend.ConexionBD.SQLServerConexion;
import Backend.Entidades.Empaque;
import Backend.Gestores.DAO;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlEmpaque implements DAO<Empaque> {
    public CtrlEmpaque() {
    }

    @Override
    public void registrar(Empaque nuevaEntidad) {
        String consultaSQL =
                "{ CALL pa_registrarEmpaque(?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion()
                             .getConnection().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getTipoEmpaque());

            comando.executeUpdate();
            String aviso = String.format
                    ("Se registró el Empaque: %s",
                            nuevaEntidad.getTipoEmpaque());

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("ERROR al registrar el Empaque"));
        }
    }

    @Override
    public Empaque leer(Empaque leerEntidad) {
        Empaque empaque = null;
        String consultaSQL = "{ CALL pa_leerEmpaque(?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion().getConnection()
                             .prepareCall(consultaSQL)){

            comando.setString(1, leerEntidad.getTipoEmpaque());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                empaque = new Empaque();

                empaque.setTipoEmpaque(filas.getString(1));

            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return empaque;
    }

    @Override
    public void eliminar(Empaque eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarEmpaque(?) }";

        try(CallableStatement comando =
                    SQLServerConexion.instanciaConexcion().getConnection()
                            .prepareCall(consultaSQL)) {

            comando.setString(1,
                    eliminadoEntidad.getTipoEmpaque());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Comprobante eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Empaque actualizarEntidad) {
        String consultaInsert =
                "{ CALL pa_actualizarEmpaque( ?,?) }";

        try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                .getConnection().prepareCall(consultaInsert)) {

            comando.setInt(1,
                    actualizarEntidad.getIdEmpaque());
            comando.setString(2,
                    actualizarEntidad.getTipoEmpaque());


            comando.executeUpdate();
            System.out.println("Se realizó la actualización");
            JOptionPane.showMessageDialog
                    (null, "Se actulizo la el empaque");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Empaque> listar() {
        ArrayList<Empaque> empaques = new ArrayList<>();
        String consulta = "{ CALL pa_listarEmpaque() }";

        try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                .getConnection().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();

            while (filas.next()) {
                Empaque empaque = new Empaque();
                empaques.add(empaque);
                empaque.setTipoEmpaque(filas.getString(1));
            }

            return empaques;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
