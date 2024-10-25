package Backend.ConexionBD;

public class CorroborarConexionBD {
    public static void main(String[] args) {
        ConectarSQLServer.conectar
                ("BD_BuyPoint","sa","12345689");
    }
}
