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

    /*public static void main(String[] args) {
        if ("s123".matches("^[a-zA-Z]+[0-9]*$")){
            System.out.println("paso");
        }else{
            System.out.println("no paso");
        }
    }*/ // Main

    @Override
    public void registrar(CategoriaProducto nuevaEntidad) {
        if (nuevaEntidad.getNombre().matches("^[a-zA-Z]+[0-9]*$")){
            // FALTA, tienen que confirmar si va en el Frontend o Backend
        }

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
    public CategoriaProducto leer(String condicionLeer) {
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
