package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Gestores.GestorCadenas;
import Backend.Gestores.GestorSQLServer;
import Backend.Entidades.CategoriaProducto;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCategoriaProducto implements GestorSQLServer<CategoriaProducto>{

    @Override
    public void registrar(CategoriaProducto nuevaEntidad) {
        String consultaSQL = "{ CALL pa_registrarCategoriaProducto(?) }";
        try (CallableStatement comando =
                     SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL);){

            comando.setString(1, nuevaEntidad.getNombre());

            comando.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CategoriaProducto leer(CategoriaProducto leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(CategoriaProducto eliminadoEntidad) {

    }

    @Override
    public void actualizar(CategoriaProducto actualizadoEntidad) {

    }

    @Override
    public ArrayList<CategoriaProducto> listar() {
        return null;
    }
}
