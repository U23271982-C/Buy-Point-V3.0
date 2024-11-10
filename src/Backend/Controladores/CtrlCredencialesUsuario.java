package Backend.Controladores;

import Backend.ConexionBD.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.CredencialesUsuario;
import Backend.Entidades.Entidad;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCredencialesUsuario implements GestorSQLServer<CredencialesUsuario> {
    @Override
    public void registrar(CredencialesUsuario nuevaEntidad) {

    }

    @Override
    public CredencialesUsuario leer(CredencialesUsuario leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(CredencialesUsuario eliminadoEntidad) {

    }

    @Override
    public void actualizar(CredencialesUsuario actualizadoEntidad) {

    }

    @Override
    public ArrayList<CredencialesUsuario> listar() {
        return null;
    }
}
