package Backend.Controladores;

import Backend.Gestores.GestorSQLServer;
import Backend.ConexionBD.SQLServerBD;
import Backend.Entidades.PaqueteProducto;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlPaqueteProducto implements GestorSQLServer<PaqueteProducto>{

    public CtrlPaqueteProducto() {

    }

    @Override
    public void registrar(PaqueteProducto nuevaEntidad) {
        String consultaSQL = "{ CALL paT_registrarPaqueteProducto(?, ?, ?) }";

        try (CallableStatement comando = SQLServerBD.instanciaConexcion()
                .conectar().prepareCall(consultaSQL)){

            comando.setInt
                    (1, nuevaEntidad.getProducto().getPaqueteProducto().getCantidad());
            comando.setDate
                    (2, java.sql.Date.valueOf(nuevaEntidad.getProducto().getPaqueteProducto().getFechaCaducidad()   ));
            comando.setString
                    (3, nuevaEntidad.getProducto().getCodigo()
                            .getCodigo());

            comando.executeUpdate();

            System.out.println("Se registró el nuevo Paquete del Producto");
            JOptionPane.showMessageDialog(null,
                    "Se registró el nuevo Paquete del Producto");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al registrar el Paquete del Producto");
        }
    }

    @Override
    public PaqueteProducto leer(PaqueteProducto leerEntidad) {
        return null;
    }

    @Override
    public void eliminar(PaqueteProducto eliminadoEntidad) {

    }

    @Override
    public void actualizar(PaqueteProducto actualizadoEntidad) {

    }

    @Override
    public ArrayList<PaqueteProducto> listar() {
        return null;
    }
}
