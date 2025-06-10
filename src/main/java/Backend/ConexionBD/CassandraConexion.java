package Backend.ConexionBD;

import com.datastax.oss.driver.api.core.CqlSession;

public class CassandraConexion extends BaseDatosConexion<CqlSession> {
    @Override
    protected void connect() {

    }

    @Override
    protected void disconnect() {

    }

    @Override
    public CqlSession getConnection() {
        return null;
    }
}
