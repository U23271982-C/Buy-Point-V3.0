package Backend.Gestores;

import java.util.ArrayList;

public interface GestorSQLServer <T>{
    void registrar(T nuevaEntidad);
    T leer(T leerEntidad);
    void eliminar(T eliminadoEntidad);
    void actualizar(T actualizarEntidad);
    ArrayList<T> listar();

}
