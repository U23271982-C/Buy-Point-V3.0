
package Backend.Controladores;

    import Backend.ConexionBD.GestorSQLServer;
    import Backend.ConexionBD.SQLServerBD;
    import Backend.Entidades.*;

    import javax.swing.*;
    import java.io.InputStream;
    import java.io.Reader;
    import java.math.BigDecimal;
    import java.net.URL;
    import java.sql.*;
    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.Calendar;
    import java.util.Date;
    import java.util.Map;

    import static Backend.ConexionBD.SQLServerBD.instanciaConexcion;
    public class CtrlProducto  {



        /*public CallableStatement devolviendoComando () {
            Producto nuevaEntidad = new Producto();
            Codigo codigo = new Codigo();
            PaqueteProducto paqueteProducto = new PaqueteProducto();
            Empaque empaque = new Empaque();
            CategoriaProducto categoriaProducto = new CategoriaProducto();
            Inventario inventario = new Inventario();


            codigo.setCodigo("zzzzzZ");
            paqueteProducto.setCantidad(8);
            paqueteProducto.setFechaCaducidad
                    (LocalDate.of(2025,9,11));
            nuevaEntidad.setNombreProducto("Rellenitas");

            nuevaEntidad.setDescripcion("Galletas con relleno de chocolate");
            empaque.setTipoEmpaque("Ternopol");
            categoriaProducto.setNombre("Cosas");
            inventario.setPrecio(new BigDecimal(8));
            inventario.setPrecioCosto(new BigDecimal(5));

            CallableStatement comando = null;

            try {
                if(comando == null) JOptionPane.showMessageDialog(null, "nose");
                comando.setString(1, codigo.getCodigo());
                comando.setInt(2, paqueteProducto.getCantidad());
                //Date date = co
                comando.setDate(3, java.sql.Date.valueOf(paqueteProducto.getFechaCaducidad()));
                comando.setString(4, nuevaEntidad.getNombreProducto());
                comando.setString(5, nuevaEntidad.getNombreProducto());
                comando.setString(6, empaque.getTipoEmpaque());
                comando.setString(7, categoriaProducto.getNombre());
                comando.setBigDecimal(8, inventario.getPrecio());
                comando.setBigDecimal(9, inventario.getPrecioCosto());
                if(comando == null) JOptionPane.showMessageDialog(null, "nose");
                return comando;
            }catch (SQLException e){
                e.printStackTrace();
            }
            return comando;
        }*/

        /*public void introdciendoSql(CallableStatement df){

            String consultaSQL = "{ CALL paT_registrarProductoCompuesto(?, ?, ?, ?, ?, ?, ?, ?, ?) }";
            try {
                df = SQLServerBD.instanciaConexcion().conectar().prepareCall(consultaSQL);
                df.executeQuery();
                System.out.println("Se registró las nuevas Credenciales");
                JOptionPane.showMessageDialog(null, "Se registró las nuevas Credenciales");
            } catch (SQLException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al leer las Credenciales");
            }
        }*/

    }
