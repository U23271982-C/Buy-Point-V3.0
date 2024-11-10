package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Cuenta;
import Backend.Entidades.Entidad;

import java.util.ArrayList;

public class CtrlCuenta implements GestorSQLServer<Cuenta> {
    @Override
    public void registrar(Cuenta nuevaEntidad) {

    }

    @Override
    public Cuenta leer(Cuenta leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Cuenta eliminadoEntidad) {

    }

    @Override
    public void actualizar(Cuenta actualizadoEntidad) {

    }

    @Override
    public ArrayList<Cuenta> listar() {
        return null;
    }
}
