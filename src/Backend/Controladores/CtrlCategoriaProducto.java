package Backend.Controladores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Empaque;
import Backend.Gestores.GestorCadenas;
import Backend.Gestores.GestorSQLServer;
import Backend.Entidades.CategoriaProducto;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCategoriaProducto implements GestorSQLServer<CategoriaProducto>{
    public CtrlCategoriaProducto() {
    }

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
        ArrayList<CategoriaProducto> categoriaProductos = new ArrayList<>();
        String consulta = "{ CALL pa_listarCategoriaProducto() }";

        try(CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();

            while (filas.next()) {
                CategoriaProducto categoriaProducto = new CategoriaProducto();
                categoriaProductos.add(categoriaProducto);
                categoriaProducto.setNombre(filas.getString(1));
            }

            return categoriaProductos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
