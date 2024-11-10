package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.CategoriaProducto;
import Backend.Entidades.Entidad;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCategoriaProducto implements GestorSQLServer <CategoriaProducto> {
    @Override
    public void registrar(CategoriaProducto nuevaEntidad) {

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
