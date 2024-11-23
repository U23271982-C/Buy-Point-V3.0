package Backend.Controladores;

import Backend.Entidades.DetalleVenta;
import Backend.Gestores.GestorSQLServer;

import java.util.ArrayList;

public class CtrlDetalleVenta implements GestorSQLServer<DetalleVenta> {
    ArrayList<DetalleVenta> detallesVenta1;

    public CtrlDetalleVenta(ArrayList<DetalleVenta> detallesVenta) {
        this.detallesVenta1 = detallesVenta;
    }
    @Override
    public void registrar(DetalleVenta nuevaEntidad) {

    }

    @Override
    public DetalleVenta leer(DetalleVenta leerEntidad) {
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
