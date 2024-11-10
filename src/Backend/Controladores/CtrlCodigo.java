package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Codigo;
import Backend.Entidades.Entidad;

import java.util.ArrayList;

public class CtrlCodigo implements GestorSQLServer<Codigo> {
    @Override
    public void registrar(Codigo nuevaEntidad) {

    }

    @Override
    public Codigo leer(Codigo leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Codigo eliminadoEntidad) {

    }

    @Override
    public void actualizar(Codigo actualizadoEntidad) {

    }

    @Override
    public ArrayList<Codigo> listar() {
        return null;
    }
}
