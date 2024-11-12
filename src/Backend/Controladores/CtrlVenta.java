package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Entidad;
import Backend.Entidades.Venta;

import java.util.ArrayList;

public class CtrlVenta implements GestorSQLServer<Venta> {
    @Override
    public void registrar(Venta nuevaEntidad) {

    }

    @Override
    public Venta leer(String condicionLeer) {
        return null;
    }

    @Override
    public void eliminar(Venta eliminadoEntidad) {

    }

    @Override
    public void actualizar(Venta actualizadoEntidad) {

    }

    @Override
    public ArrayList<Venta> listar() {
        return null;
    }
}
