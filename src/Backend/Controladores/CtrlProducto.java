package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Entidad;
import Backend.Entidades.Producto;

import java.util.ArrayList;

public class CtrlProducto implements GestorSQLServer<Producto> {
    @Override
    public void registrar(Producto nuevaEntidad) {

    }

    @Override
    public Producto leer(String condicionLeer) {
        return null;
    }

    @Override
    public void eliminar(Producto eliminadoEntidad) {

    }

    @Override
    public void actualizar(Producto actualizadoEntidad) {

    }

    @Override
    public ArrayList<Producto> listar() {
        return null;
    }
}
