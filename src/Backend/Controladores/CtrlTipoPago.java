package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Entidad;
import Backend.Entidades.TipoPago;

import java.util.ArrayList;

public class CtrlTipoPago implements GestorSQLServer<TipoPago> {
    @Override
    public void registrar(TipoPago nuevaEntidad) {

    }

    @Override
    public TipoPago leer(TipoPago leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(TipoPago eliminadoEntidad) {

    }

    @Override
    public void actualizar(TipoPago actualizadoEntidad) {

    }

    @Override
    public ArrayList<TipoPago> listar() {
        return null;
    }
}
