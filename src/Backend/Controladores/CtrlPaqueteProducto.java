package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Entidad;
import Backend.Entidades.PaqueteProducto;

import java.util.ArrayList;

public class CtrlPaqueteProducto implements GestorSQLServer<PaqueteProducto> {
    @Override
    public void registrar(PaqueteProducto nuevaEntidad) {

    }

    @Override
    public PaqueteProducto leer(String condicionLeer) {
        return null;
    }

    @Override
    public void eliminar(PaqueteProducto eliminadoEntidad) {

    }

    @Override
    public void actualizar(PaqueteProducto actualizadoEntidad) {

    }

    @Override
    public ArrayList<PaqueteProducto> listar() {
        return null;
    }
}
