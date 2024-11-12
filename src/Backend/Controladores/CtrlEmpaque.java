package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Empaque;
import Backend.Entidades.Entidad;

import java.util.ArrayList;

public class CtrlEmpaque implements GestorSQLServer<Empaque> {
    @Override
    public void registrar(Empaque nuevaEntidad) {

    }

    @Override
    public Empaque leer(String condicionLeer) {
        return null;
    }

    @Override
    public void eliminar(Empaque eliminadoEntidad) {

    }

    @Override
    public void actualizar(Empaque actualizadoEntidad) {

    }

    @Override
    public ArrayList<Empaque> listar() {
        return null;
    }
}
