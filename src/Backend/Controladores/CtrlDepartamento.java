package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Departamento;
import Backend.Entidades.Entidad;

import java.util.ArrayList;

public class CtrlDepartamento implements GestorSQLServer<Departamento> {
    @Override
    public void registrar(Departamento nuevaEntidad) {

    }

    @Override
    public Departamento leer(Departamento leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Departamento eliminadoEntidad) {

    }

    @Override
    public void actualizar(Departamento actualizadoEntidad) {

    }

    @Override
    public ArrayList<Departamento> listar() {
        return null;
    }
}
