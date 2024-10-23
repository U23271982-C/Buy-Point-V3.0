/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Backend;

/**
 *
 * @author ISRAEL
 */
public interface GestionadorRegistro {
    //registra Producto o Categoria
    void registrar(Object obj);

    void eliminarRegistro(Object obj);

    static boolean registroEncontrado(String consulta) {
        boolean rsp = false;
        /*
        //Connection conexion = Conexion.conectar();
        //Statement sta;
        try{
            /*
            //st = cn.createStatement();
            //ResultSet = st.executeQuery(rsp);
            while(rs.next){
                rsp = true;
            }

            return rsp;
        }catch(/*SQLException e){
            JOptionPane.showMessageDialog
                    (null, "Error al iniciar sesión");
        }
        */
        return true;
    }

    //da el numero de registros que hay
    static int cantidadRegistro() {
        return 0;
    }

}
