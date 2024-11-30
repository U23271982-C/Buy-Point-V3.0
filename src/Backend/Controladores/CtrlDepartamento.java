package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Comprobante;
import Backend.Entidades.Departamento;
import Backend.Gestores.GestorSQLServer;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlDepartamento implements GestorSQLServer<Departamento> {
    public CtrlDepartamento() {
    }

    @Override
    public void registrar(Departamento nuevaEntidad) {
        String consultaSQL =
                "{ CALL pa_registrarDepartamento(?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion()
                             .conectar().prepareCall(consultaSQL)){

            comando.setInt(1,
                    nuevaEntidad.getTorre());
            comando.setInt(2,
                    nuevaEntidad.getDepartamento());

            comando.executeUpdate();
            String aviso = String.format
                    ("Se registró el Departamento: %s %s",
                            nuevaEntidad.getTorre(),
                            nuevaEntidad.getDepartamento());

            System.out.printf(aviso);
            JOptionPane.showMessageDialog(null,aviso);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("ERROR al registrar el Departamento"));
        }
    }

    @Override
    public Departamento leer(Departamento leerEntidad) {
        Departamento departamento = null;
        String consultaSQL = "{ CALL pa_leerDepartamento(?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar()
                             .prepareCall(consultaSQL)){

            comando.setShort(1, leerEntidad.getTorre());
            comando.setShort(2, leerEntidad.getDepartamento());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                departamento = new Departamento();

                departamento.setTorre(filas.getShort(1));
                departamento.setDepartamento((filas.getShort(2)));

            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return departamento;
    }

    @Override
    public void eliminar(Departamento eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarDepartamento(?, ?) }";

        try(CallableStatement comando =
                    SQLServerBD.instanciaConexcion().conectar()
                            .prepareCall(consultaSQL)) {

            comando.setShort(1, eliminadoEntidad.getTorre());
            comando.setShort(2, eliminadoEntidad.getDepartamento());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Departamento eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Departamento actualizadoEntidad) {
        // FALTA LÓGICA
    }

    @Override
    public ArrayList<Departamento> listar() {
        ArrayList<Departamento> departamentos = new ArrayList<>();
        String consulta = "{ CALL pa_listarDepartamento() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            Departamento co = null;
            while (filas.next()) {
                co = new Departamento();
                co.setTorre(filas.getShort(1));
                co.setDepartamento(filas.getShort(2));

                departamentos.add(co);
            }

            return departamentos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
