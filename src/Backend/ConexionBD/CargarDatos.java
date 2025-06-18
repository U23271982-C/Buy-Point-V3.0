package Backend.ConexionBD;

import java.io.InputStream;
import java.util.Properties;

public class CargarDatos {
    //cargamos los datos almacenamos en el archivo database.properties
    public static Properties loadProperties() {
        Properties props = new Properties();
        try (InputStream input = SQLServerBD.class.getClassLoader()
                .getResourceAsStream("resources/database.properties")) {
            if (input == null) {
                throw new RuntimeException("No se puede encontrar database.properties");
            }
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Error al cargar la configuración", e);
        }
        return props;
    }
}
