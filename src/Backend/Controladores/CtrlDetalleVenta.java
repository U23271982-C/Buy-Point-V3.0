package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.DetalleVenta;
import Backend.Entidades.Entidad;

import java.util.ArrayList;

public class CtrlDetalleVenta implements GestorSQLServer<DetalleVenta> {
    @Override
    public void registrar(DetalleVenta nuevaEntidad) {

    }

    @Override
    public DetalleVenta leer(String condicionLeer) {
        return null;
    }

    @Override
    public void eliminar(DetalleVenta eliminadoEntidad) {

    }

    @Override
    public void actualizar(DetalleVenta actualizadoEntidad) {

    }

    @Override
    public ArrayList<DetalleVenta> listar() {
        return null;
    }
}
