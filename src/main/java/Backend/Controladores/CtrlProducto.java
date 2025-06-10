
package Backend.Controladores;

    import Backend.Gestores.DAO;
    import Backend.ConexionBD.SQLServerConexion;
    import Backend.Entidades.*;

    import javax.swing.*;
    import java.sql.*;
    import java.util.ArrayList;

public class CtrlProducto implements DAO<Producto> {

    public CtrlProducto() {
    }

    @Override
        public void registrar(Producto nuevaEntidad) {
            String consultaSQL =
                    "{ CALL paT_registrarProductoCompuesto(?, ?, ?, ?, ?, ?, ?, ?, ?) }";

            try (CallableStatement comando = SQLServerConexion.instanciaConexcion()
                    .getConnection().prepareCall(consultaSQL)){

                comando.setString
                        (1,
                                nuevaEntidad.getCodigo().getCodigo());
                comando.setInt
                        (2,
                                nuevaEntidad.getLote()
                                        .getCantidad());
                comando.setDate
                        (3,java.sql.Date.valueOf
                                (nuevaEntidad.getLote()
                                .getFechaCaducidad()));
                comando.setString
                        (4,nuevaEntidad
                                .
                                getNombreProducto());
                comando.setString
                        (5,nuevaEntidad.getDescripcion());
                comando.setString
                        (6,nuevaEntidad.getEmpaque()
                                .getTipoEmpaque());
                comando.setString
                        (7,nuevaEntidad
                                .getCategoriaProducto().getNombre());
                comando.setBigDecimal
                        (8,nuevaEntidad.getPrecio());
                comando.setBigDecimal
                        (9, nuevaEntidad.getPrecioCosto());

                comando.executeUpdate();
                String aviso = String.format
                        ("Se registró el Producto: %s",
                                nuevaEntidad.getNombreProducto());
                JOptionPane.showMessageDialog(null,
                        String.format
                        ("Se registró el producto: %s",
                                nuevaEntidad.getNombreProducto()));
                System.out.println(aviso);

            } catch (SQLException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
                JOptionPane.showMessageDialog
                        (null, String.format
                        ("ERROR al registrar el producto: %s",
                                nuevaEntidad.getNombreProducto()));
            }
        }

        @Override
        public Producto leer(Producto leerEntidad) {
            Producto producto = null;
            String consultaSQL = "{ CALL pa_leerProducto(?) }";

            try (CallableStatement comando =
                         SQLServerConexion.instanciaConexcion()
                                 .getConnection().prepareCall(consultaSQL)){

                comando.setString(1,
                        leerEntidad.getCodigo().getCodigo());

                ResultSet filas = comando.executeQuery();
                if (filas.next()) {
                    producto = new Producto();
                            producto.setNombreProducto
                                    (filas.getString(1));
                            producto.setDescripcion(filas.getString(2));
                            producto.getCategoriaProducto().
                                    setNombre(filas.getString(3));
                            producto.getEmpaque()
                                    .setTipoEmpaque(filas
                                            .getString(4));
                            producto.setPrecio
                                    (filas.getBigDecimal(5));
                            producto.setPrecioCosto(filas
                                            .getBigDecimal
                                                    (6));
                            producto.getInventario()
                                    .setStock(filas
                                            .getInt(7));
                            producto.getCodigo().
                                    setCodigo(filas.getString(8));
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

        @Override
        public void eliminar(Producto eliminadoEntidad) {
            String consultaSQL = "{ CALL pa_eliminarProducto(?) }";
            
             try(CallableStatement comando =
                    SQLServerConexion.instanciaConexcion().getConnection()
                            .prepareCall(consultaSQL)) {

            comando.setString(1, eliminadoEntidad.getCodigo().getCodigo());


            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto eliminado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }        
        
        }

        @Override
        public void actualizar(Producto actualizarEntidad) {
            String consultaInsert =
                    "{ CALL pa_actualizarProducto( ?,?,?,?) }";

            try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                    .getConnection().prepareCall(consultaInsert)) {

                comando.setString(1,
                        actualizarEntidad.getCodigo().getCodigo());
                comando.setString(2,
                        actualizarEntidad.getNombreProducto());
                comando.setString(3,
                        actualizarEntidad.getDescripcion());
                comando.setBigDecimal(4,
                        actualizarEntidad.getPrecio());


                comando.executeUpdate();
                System.out.println("Se realizó la lectura");
                JOptionPane.showMessageDialog
                        (null, "Se actulizo las Credenciales");


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public ArrayList<Producto> listar() {

            ArrayList<Producto> productos = new ArrayList<>();
            String consulta = "{ CALL pa_listarProducto() }";

            try(CallableStatement comando = SQLServerConexion.instanciaConexcion()
                    .getConnection().prepareCall(consulta)) {

                ResultSet filas = comando.executeQuery();
                Producto p = null;
                while (filas.next()) {
                    p = new Producto();
                    p.setNombreProducto(filas.getString(1));
                    p.setDescripcion(filas.getString(2));
                    p.setPrecio(filas.getBigDecimal(3));
                    p.setPrecioCosto(filas.getBigDecimal(4));
                    p.getInventario().setStock(filas.getInt(5));
                    p.getCategoriaProducto().setNombre(filas.getString(6));
                    p.getInventario().setSalida(filas.getInt(7));

                    productos.add(p);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            return productos;
        }
    }
