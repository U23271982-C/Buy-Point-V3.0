package Backend.ConexionBD;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class BaseDatosConexionFactory {
    public static <T extends BaseDatosConexion> T getConexion(Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            instance.connect();
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("No se encontró una conexión para la clase: " + clazz.getSimpleName(), e);
        }
    }
}
