package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Comprobante;
import Backend.Entidades.Entidad;

import java.util.ArrayList;

public class CtrlComprobante implements GestorSQLServer<Comprobante> {
    @Override
    public void registrar(Comprobante nuevaEntidad) {

    }

    @Override
    public Comprobante leer(Comprobante leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Comprobante eliminadoEntidad) {

    }

    @Override
    public void actualizar(Comprobante actualizadoEntidad) {

    }

    @Override
    public ArrayList<Comprobante> listar() {
        return null;
    }
}
