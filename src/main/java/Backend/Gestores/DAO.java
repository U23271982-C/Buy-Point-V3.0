package Backend.Gestores;

import java.util.List;

public interface DAO<T> extends Registrable<T>,
                                Leible<T>,
                                Eliminable<T>,
                                Actualizable<T>,
                                Listable<T>
{
    @Override
    void registrar(T nuevaEntidad);

    @Override
    T leer(T leerEntidad);

    @Override
    void eliminar(T eliminadoEntidad);

    @Override
    void actualizar(T actualizarEntidad);

    @Override
    List<T> listar();

}
