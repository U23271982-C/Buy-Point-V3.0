package Backend.Controladores;

import Backend.ConexionBD.BaseDatosConexionFactory;
import Backend.ConexionBD.SQLServerConexion;
import Backend.Gestores.DAO;
import Backend.Entidades.CategoriaProducto;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlCategoriaProducto implements DAO<CategoriaProducto> {
    public CtrlCategoriaProducto() {
    }

    @Override
    public void registrar(CategoriaProducto nuevaEntidad) {
        String consultaSQL = "{ CALL pa_registrarCategoriaProducto(?) }";
        try (CallableStatement comando =
                     /*SQLServerConexion.instanciaConexcion().getConnection()*/
             BaseDatosConexionFactory.getConexion(SQLServerConexion.class).prepareCall(consultaSQL);){

            comando.setString(1, nuevaEntidad.getNombre());

            comando.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    @Override
    public CategoriaProducto leer(CategoriaProducto leerEntidad) {
        CategoriaProducto cp = null;
        String consultaSQL = "{ CALL pa_leerCategoriaProducto(?) }";

        try (CallableStatement comando =
                     SQLServerConexion.instanciaConexcion()
                             .getConnection().prepareCall(consultaSQL)){

            comando.setString(1,
                    leerEntidad.getNombre());

            ResultSet filas = comando.executeQuery();
            if (filas.next()) {
                cp = CategoriaProducto.builder()
                        .idCategoriaProducto(filas.getInt(1))
                        .nombre(filas.getString(2))
                        .build();

            }//else {
            //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
            //}

            //System.out.println("Se realizó la lectura");
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
        }

        return cp;
    }

    @Override
    public void eliminar(CategoriaProducto eliminadoEntidad) {
        String consultaSQL = "{ CALL pa_eliminarCategoriaProducto(?) }";

        try(CallableStatement comando =
                    SQLServerConexion.instanciaConexcion().getConnection()
                            .prepareCall(consultaSQL)) {

            comando.setString(1, eliminadoEntidad.getNombre());

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Credenciales eliminadas");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }

    @Override
    public void actualizar(CategoriaProducto actualizarEntidad) {
        String consultaInsert =
                "{ CALL pa_actualizarCategoriaProducto( ?,?) }";

        try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                .getConnection().prepareCall(consultaInsert)) {

            comando.setInt(1,
                    actualizarEntidad.getIdCategoriaProducto());
            comando.setString(2,
                    actualizarEntidad.getNombre());


            comando.executeUpdate();
            System.out.println("Se realizó la actualización");
            JOptionPane.showMessageDialog
                    (null, "Se actulizo la categoría de producto");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<CategoriaProducto> listar() {
        ArrayList<CategoriaProducto> categoriaProductos = new ArrayList<>();
        String consulta = "{ CALL pa_listarCategoriaProducto() }";

        try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                .getConnection().prepareCall(consulta)) {

            ResultSet filas = comando.executeQuery();

            while (filas.next()) {
                CategoriaProducto categoriaProducto = null;
                categoriaProductos.add(categoriaProducto);
                categoriaProducto = CategoriaProducto.builder()
                        .nombre(filas.getString(1))
                        .build();
            }

            return categoriaProductos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
