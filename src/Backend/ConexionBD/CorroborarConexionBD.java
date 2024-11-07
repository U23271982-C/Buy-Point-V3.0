package Backend.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;

public class CorroborarConexionBD {
    public static void main(String[] args) {
        try(Connection o = SQLServerBD.instanciaConexcion().conectar()){

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
