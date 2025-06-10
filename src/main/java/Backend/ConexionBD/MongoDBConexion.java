package Backend.ConexionBD;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.sql.Connection;

public class MongoDBConexion extends BaseDatosConexion<MongoDatabase> {
    MongoClient mongoClient;
    public MongoDBConexion() {
        super.url = "mongodb://localhost:27017";
        super.nameBD = "MongoDB";
    }

    @Override
    protected void connect() {

        // Aquí se implementaría la lógica para establecer una conexión a MongoDB.
        // Por ejemplo, utilizando MongoClient y obteniendo una base de datos específica.
        // super.connection = mongoClient.getDatabase("nombre_de_la_base_de_datos");
        //ejem
        mongoClient = MongoClients.create(url);
        super.connection = mongoClient.getDatabase(nameBD);
    }

    @Override
    protected void disconnect() {
        // Obtenemos la conexión a la base de datos MongoDB y la cerramos.
        if (mongoClient != null) {
            mongoClient.close();
            super.connection = null;
        }
    }

    @Override
    protected MongoDatabase getConnection() {
        // Obtenemos la conexión a la base de datos MongoDB.
        return super.connection;
    }
}
