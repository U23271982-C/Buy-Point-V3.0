package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.Entidades.Entidad;
import Backend.Entidades.Inventario;

import java.util.ArrayList;

public class CtrlInventario  implements GestorSQLServer<Inventario> {
    @Override
    public void registrar(Inventario nuevaEntidad) {

    }

    @Override
    public Inventario leer(Inventario leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(Inventario eliminadoEntidad) {

    }

    @Override
    public void actualizar(Inventario actualizadoEntidad) {

    }

    @Override
    public ArrayList<Inventario> listar() {
        return null;
    }
}
