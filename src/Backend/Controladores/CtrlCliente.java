package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Cliente;
import Backend.Entidades.Entidad;

import java.util.ArrayList;

public class CtrlCliente implements GestorSQLServer<Cliente> {
    @Override
    public void registrar(Cliente nuevaEntidad) {

    }

    @Override
    public Cliente leer(Cliente leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Cliente eliminadoEntidad) {

    }

    @Override
    public void actualizar(Cliente actualizadoEntidad) {

    }

    @Override
    public ArrayList<Cliente> listar() {
        return null;
    }
}
