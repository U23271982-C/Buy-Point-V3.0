package Backend.ConexionBD;

import java.util.HashMap;
import java.util.Map;

public class BaseDatosConexionFactory {
    private static final Map<Class<?>, BaseDatosConexion<?>> INSTANCIAS = new HashMap<>();

    public static synchronized <T extends BaseDatosConexion<S>, S> S getConexion(Class<T> clazz) {
        try {
            @SuppressWarnings("unchecked") // Evitamos advertencias de tipo unchecked
            // Obtenemos la instancia de la clase de conexión, si ya existe
            T instance = (T) INSTANCIAS.computeIfAbsent(clazz, c  -> {
                // Si no existe, creamos una nueva instancia
                try {
                    // Creamos una nueva instancia de la clase de conexión
                    T nueva = clazz.getDeclaredConstructor().newInstance();
                    nueva.connect();
                    return nueva;
                } catch (Exception e) {
                    throw new RuntimeException("Error creando la conexion: " + clazz.getSimpleName() , e);
                }
            });

            return instance.getConnection(); // Retornamos la conexión de la instancia
        } catch (Exception e) {
            throw new RuntimeException("No se encontró una conexión para la clase: " + clazz.getSimpleName(), e);
        }
    }

    public static void main(String[] args) {
        BaseDatosConexionFactory.getConexion(SQLServerConexion.class);
    }
}
