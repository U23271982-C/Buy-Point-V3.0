package Backend.ConexionBD;

import redis.clients.jedis.Jedis;

public class RedisConexion extends BaseDatosConexion<Jedis> {
    @Override
    protected void connect() {

    }

    @Override
    protected void disconnect() {

    }

    @Override
    public Jedis getConnection() {
        return null;
    }
}
