package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Comprobante;
import Backend.Entidades.Cuenta;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCuenta implements GestorSQLServer<Cuenta> {
    public CtrlCuenta() {
    }

    @Override
    public void registrar(Cuenta nuevaEntidad) {
        String consultaSQL =
                "{ CALL pa_registrarCuenta(?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setString(1,
                    nuevaEntidad.getNombre());
            comando.setString(2,
                    nuevaEntidad.getApellido());
            comando.setInt(3,
                    nuevaEntidad.getTelefono());

            comando.executeUpdate();
            String aviso = String.format
                    ("Se registró la Cuenta de %s %s",
                            nuevaEntidad.getNombre(),
                            nuevaEntidad.getApellido());

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null, aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al registrar la Cuenta");
        }
    }

    @Override
    public Cuenta leer(Cuenta leerEntidad) {
        Cuenta c = null;
        String consultaSQL = "{ CALL pa_leerCuenta(?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar()
                             .prepareCall(consultaSQL)){

            comando.setString(1, leerEntidad.getNombre());
            comando.setString(2, leerEntidad.getApellido());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                c = new Cuenta();

                c.setNombre(filas.getString(1));
                c.setApellido(filas.getString(2));
                c.setTelefono(filas.getInt(3));

            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return c;
    }

    @Override
    public void eliminar(Cuenta eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarCuenta(?, ?) }";

        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar()
                            .prepareCall(consultaSQL)) {

            comando.setString(1, eliminadoEntidad.getNombre());
            comando.setString(2, eliminadoEntidad.getApellido());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Comprobante eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Cuenta actualizarEntidad) {
        // FALTA LÓGICA
    }

    @Override
    public ArrayList<Cuenta> listar() {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        String consulta = "{ CALL pa_listarCuenta() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            Cuenta co = null;
            while (filas.next()) {
                co = new Cuenta();
                co.setNombre(filas.getString(1));
                co.setApellido(filas.getString(2));
                co.setTelefono(filas.getInt(3));

                cuentas.add(co);
            }

            return cuentas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
