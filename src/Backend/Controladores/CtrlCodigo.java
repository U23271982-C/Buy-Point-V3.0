package Backend.Controladores;

import Backend.Entidades.Cliente;
import Backend.Entidades.Producto;
import Backend.Gestores.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Codigo;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCodigo implements GestorSQLServer<Codigo> {
    public CtrlCodigo() {
    }

    @Override
    public void registrar(Codigo nuevaEntidad) {
        String consultaSQL = "{ CALL pa_registrarCodigo(?, ?) }";

        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)){

            comando.setString(1, nuevaEntidad.getCodigo());
            comando.setString(2, nuevaEntidad.getProducto().getNombreProducto());

            comando.executeUpdate();
            System.out.println("Se registró las nuevas Credenciales");
            JOptionPane.showMessageDialog(null, "Se registró las nuevas Credenciales");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }
    }

    @Override
    public Codigo leer(Codigo leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Codigo eliminadoEntidad) {

    }

    @Override
    public void actualizar(Codigo actualizarEntidad) {

    }

    @Override
    public ArrayList<Codigo> listar() {
        ArrayList<Codigo> codigos = new ArrayList<>();
        String consulta = "{ CALL pa_listarCliente() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();
            Codigo c = null;
            while (filas.next()) {
                c = new Codigo();
                c.setCodigo(filas.getString(1));
                /*Producto p = new Producto();
                c.setProducto(p);*/
                c.getProducto().setNombreProducto(filas.getString(2));

                codigos.add(c);
            }
            return codigos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

