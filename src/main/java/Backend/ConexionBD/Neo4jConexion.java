package Backend.ConexionBD;

import org.neo4j.driver.Driver;

public class Neo4jConexion extends BaseDatosConexion<Driver> {
    @Override
    protected void connect() {

    }

    @Override
    protected void disconnect() {

    }

    @Override
    protected Driver getConnection() {
        return null;
    }
}
