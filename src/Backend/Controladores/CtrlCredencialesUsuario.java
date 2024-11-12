package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.CredencialesTienda;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCredencialesUsuario implements GestorSQLServer<CredencialesTienda> {

    public CtrlCredencialesUsuario() {
    }

    @Override
    public void registrar(CredencialesTienda nuevaEntidad) {
        String consultaSQL = "{ CALL pa_registrarCredencialesTienda(?, ?, ?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)){

            comando.setString(1,nuevaEntidad.getUsuario());
            comando.setString(2,nuevaEntidad.getContrasenna());
            comando.setString(3,nuevaEntidad.getNombre());
            comando.setString(4,nuevaEntidad.getDireccion());
            comando.setString(5,nuevaEntidad.getCorreoElectronico());

            comando.executeQuery();
            System.out.println("Se registró las nuevas Credenciales");
            JOptionPane.showMessageDialog(null, "Se registró las nuevas Credenciales");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }
    }

    @Override
    public CredencialesTienda leer(String condicionLeer) {
        CredencialesTienda credencialesUsuario = null;
        String consultaSQL = "{ CALL pa_leerCredencialesUsuario(?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)){

            comando.setString(1, condicionLeer);

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                credencialesUsuario = new CredencialesTienda(
                        filas.getInt(1),
                        filas.getString(2),
                        filas.getString(3),
                        filas.getString(4),
                        filas.getString(5),
                        filas.getString(6)
                );
            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return credencialesUsuario;
    }

    @Override
    public void eliminar(CredencialesTienda eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarCredencialesUsuario(?, ?) }";

        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)) {

            comando.setString(1, eliminadoEntidad.getUsuario());
            comando.setString(2, eliminadoEntidad.getContrasenna());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Credenciales eliminadas");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(CredencialesTienda actualizadoEntidad) {
        String consultaInsert = "{ CALL usp_ActualizarEmpleado( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }";
        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaInsert)) {
            comando.setString(1,actualizadoEntidad.getUsuario());
            comando.setString(2,actualizadoEntidad.getContrasenna());
            comando.setString(3,actualizadoEntidad.getNombre());
            comando.setString(4,actualizadoEntidad.getDireccion());
            comando.setString(5,actualizadoEntidad.getCorreoElectronico());

            comando.executeQuery();
            System.out.println("Se realizó la lectura");
            JOptionPane.showMessageDialog
                    (null, "Se actulizo las Credenciales");

            comando.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<CredencialesTienda> listar() {
        ArrayList<CredencialesTienda> credencialesTienda = new ArrayList<>();
        String consultaInsert = "{ CALL usp_listarEmpleado() }";
        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaInsert)) {

            ResultSet filas = comando.executeQuery();

            while (filas.next()) {
                credencialesTienda.add(new CredencialesTienda(
                        filas.getInt(1),
                        filas.getString(2),
                        filas.getString(3),
                        filas.getString(4),
                        filas.getString(5),
                        filas.getString(6)
                ));
            }

            return credencialesTienda;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /*public static void main(String[] args) {
        CtrlCredencialesUsuario credencialesUsuario = new CtrlCredencialesUsuario();

        //CredencialesUsuario credencialesUsuario1 = ;

        System.out.println(credencialesUsuario.leer("usser"));

    }*/ // Main
}
