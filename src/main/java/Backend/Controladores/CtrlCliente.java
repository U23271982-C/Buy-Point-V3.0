package Backend.Controladores;

import Backend.ConexionBD.SQLServerConexion;
import Backend.Entidades.Cliente;
import Backend.Gestores.DAO;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCliente implements DAO<Cliente> {
    public CtrlCliente() {
    }

    @Override
    public void registrar(Cliente nuevaEntidad) {
        String consultaSQL =
                "{ CALL paT_registrarClienteCompuesto" +
                        "(?, ?, ?, ?, ?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion()
                             .getConnection().prepareCall(consultaSQL)){

            comando.setString
                    (1,nuevaEntidad.getCliente());
            comando.setString
                    (2,nuevaEntidad.getIdentificacion());
            comando.setInt
                    (3,nuevaEntidad.getDepartamento()
                            .getTorre());
            comando.setInt
                    (4,nuevaEntidad.getDepartamento()
                            .getDepartamento());
            comando.setString
                    (5,nuevaEntidad.getCuenta()
                            .getNombre());
            comando.setString
                    (6,nuevaEntidad.getCuenta()
                            .getApellido());
            comando.setInt
                    (7,nuevaEntidad.getCuenta()
                            .getTelefono());
            comando.executeUpdate();
            System.out.printf("Se registró el producto: %s",
                    nuevaEntidad.getCliente());
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("Se registró el Cliente %s",
                                    nuevaEntidad.getCliente()));

        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                    ("ERROR al registrar el cliente"));
        }
    }

    @Override
    public Cliente leer(Cliente leerEntidad) {
        Cliente cliente = null;
        String consultaSQL = "{ CALL pa_leerCliente(?, ?, ?, ?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion().getConnection()
                             .prepareCall(consultaSQL)){

            comando.setString(1, leerEntidad.getCliente());
            comando.setString(2, leerEntidad.getIdentificacion());
            comando.setInt(3, leerEntidad.getDepartamento().getTorre());
            comando.setInt(4, leerEntidad.getDepartamento().getDepartamento());
            comando.setString(5, leerEntidad.getCuenta().getNombre());
            comando.setString(6, leerEntidad.getCuenta().getApellido());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                cliente = new Cliente();
                cliente.setCliente(filas.getString(1));
                cliente.setIdentificacion(filas.getString(2));
                cliente.getDepartamento().setTorre(filas.getShort(3));
                cliente.getDepartamento().setTorre(filas.getShort(4));
                cliente.getCuenta().setNombre(filas.getString(5));
                cliente.getCuenta().setApellido(filas.getString(6));
            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return cliente;
    }

    @Override
    public void eliminar(Cliente eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarCliente(?) }";

        try(CallableStatement comando =
                    SQLServerConexion.instanciaConexcion().getConnection()
                            .prepareCall(consultaSQL)) {

            comando.setInt(1, eliminadoEntidad.getIdCliente());


            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Cliente actualizarEntidad) {
        String consultaSQL =
                "{ CALL paT_registrarClienteCompuesto" +
                        "(?, ?, ?, ?, ?, ?, ?, ?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion()
                             .getConnection().prepareCall(consultaSQL)){

            comando.setString
                    (1,actualizarEntidad.getCliente());
            comando.setString
                    (2,actualizarEntidad.getIdentificacion());
            comando.setInt
                    (3,actualizarEntidad.getDepartamento()
                            .getTorre());
            comando.setInt
                    (4,actualizarEntidad.getDepartamento()
                            .getDepartamento());
            comando.setString
                    (5,actualizarEntidad.getCuenta()
                            .getNombre());
            comando.setString
                    (6,actualizarEntidad.getCuenta()
                            .getApellido());
            comando.setInt
                    (7,actualizarEntidad.getCuenta()
                            .getTelefono());
            comando.setInt(8, actualizarEntidad.getIdCliente());

            comando.executeUpdate();
            System.out.printf("Se registró el producto: %s",
                    actualizarEntidad.getCliente());
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("Se registró el Cliente %s",
                                    actualizarEntidad.getCliente()));

        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    String.format
                            ("ERROR al registrar el cliente"));
        }
    }

    @Override
    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String consulta = "{ CALL pa_listarCliente() }";

        try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                .getConnection().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            Cliente c = null;
            while (filas.next()) {
                c = new Cliente();
                c.setCliente(filas.getString(1));
                c.setIdentificacion(filas.getString(2));
                c.getDepartamento().setTorre(filas.getShort(3));
                c.getDepartamento().setDepartamento(filas.getShort(4));
                c.getCuenta().setNombre(filas.getString(5));
                c.getCuenta().setApellido(filas.getString(6));
                c.getCuenta().setTelefono(filas.getInt(7));

                clientes.add(c);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return clientes;
    }
}
