package Backend.Gestores;

import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.Entidad;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public interface GestorSQLServer <T extends Entidad>{
    void registrar(T nuevaEntidad);
    T leer(T leerEntidad);
    void eliminar(T eliminadoEntidad);
    void actualizar(T actualizarEntidad);
    ArrayList<T> listar();

}
