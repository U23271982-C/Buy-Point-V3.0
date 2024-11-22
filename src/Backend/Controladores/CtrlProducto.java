
package Backend.Controladores;

    import Backend.Gestores.GestorSQLServer;
    import Backend.ConexionBD.SQLServerBD;
    import Backend.Entidades.*;

    import javax.swing.*;
    import java.sql.*;
    import java.util.ArrayList;

public class CtrlProducto implements GestorSQLServer<Producto> {

    public CtrlProducto() {
    }

    @Override
        public void registrar(Producto nuevaEntidad) {
            String consultaSQL = "{ CALL paT_registrarProductoCompuesto(?, ?, ?, ?, ?, ?, ?, ?, ?) }";

            try (CallableStatement comando =
                         SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL)){

                comando.setString(1,nuevaEntidad.getCodigo().getCodigo());
                comando.setInt(2,nuevaEntidad.getPaqueteProducto().getCantidad());
                comando.setDate(3,java.sql.Date.valueOf
                        (nuevaEntidad.getPaqueteProducto().getFechaCaducidad()));
                comando.setString(4, nuevaEntidad.getNombreProducto());
                comando.setString(5,nuevaEntidad.getDescripcion());
                comando.setString(6,nuevaEntidad.getEmpaque().getTipoEmpaque());
                comando.setString(7,nuevaEntidad.getCategoriaProducto().getNombre());
                comando.setBigDecimal(8,nuevaEntidad.getInventario().getPrecio());
                comando.setBigDecimal(9, nuevaEntidad.getInventario().getPrecioCosto());

                comando.executeQuery();
                System.out.printf("Se registró el producto: %s", nuevaEntidad.getNombreProducto());
                JOptionPane.showMessageDialog(null, String.format
                        ("Se registró el producto: %s", nuevaEntidad.getNombreProducto()));

            } catch (SQLException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, String.format
                        ("ERROR al registrar el producto: %s", nuevaEntidad.getNombreProducto()));
            }
        }

        @Override
        public Producto leer(Producto leerEntidad) {
            Producto producto = null;
            String consultaSQL = "{ CALL pa_leerProducto(?) }";

            try (CallableStatement comando =
                         SQLServerBD.instanciaConexcion()
                                 .conectar().prepareCall(consultaSQL)){

                comando.setString(1,
                        leerEntidad.getCodigo().getCodigo());

                ResultSet filas = comando.executeQuery();
                if (filas.next()) {
                    producto = new Producto();
                            producto.setNombreProducto(filas.getString(1));
                            producto.setDescripcion(filas.getString(2));
                            producto.getCategoriaProducto().setNombre(filas.getString(3));
                            producto.getEmpaque().setTipoEmpaque(filas.getString(4));
                            producto.setPrecio(filas.getBigDecimal(5));
                            producto.getInventario().setPrecioCosto(filas.getBigDecimal(6));
                            producto.getInventario().setStock(filas.getInt(7));
                }//else {
                //JOptionPane.showMessageDialog(null, "Erro al leer Credenciales Usuarios");
                //}

                //System.out.println("Se realizó la lectura");
            } catch (SQLException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
                //JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
            }

            return producto;
        }

        /*public static void main(String[] args) {
            Producto producto = new Producto();
            producto.setEmpaque(new Empaque());
            producto.getEmpaque().setTipoEmpaque("gg");

            System.out.println(producto.getEmpaque().getTipoEmpaque());
        }*/

        @Override
        public void eliminar(Producto eliminadoEntidad) {

        }

        @Override
        public void actualizar(Producto actualizadoEntidad) {

        }

        @Override
        public ArrayList<Producto> listar() {
            return null;
        }
    }
