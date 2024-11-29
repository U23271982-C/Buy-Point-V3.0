package Backend;

import Backend.Controladores.CtrlCliente;
import Backend.Controladores.CtrlEmpaque;
import Backend.Controladores.CtrlProducto;
import Backend.Entidades.*;
import Backend.Gestores.GestorSQLServer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaApp {
    public static void main(String[] args) {
        /*CredencialesTienda credencialesUsuario = new CredencialesTienda();
        credencialesUsuario.setUsuario("user_Israel");
        credencialesUsuario.setContrasenna("123456");
        credencialesUsuario.setNombre("Israel");
        credencialesUsuario.setDireccion("dsf");
        credencialesUsuario.setCorreoElectronico("665");

        //credencialesUsuario.<CredencialesUsuario > eliminar();

        System.out.println("SELECT Usuario, Constrasenna\n" +
                "FROM CredencialesTienda\n" +
                "WHERE Usuario = 'USER1' AND Constrasenna = '123'");
*/
        /*DetalleVenta detalleVenta = new DetalleVenta();

        detalleVenta.setPrecioUnitario(new BigDecimal("1.2"));

        System.out.println(detalleVenta.getPrecioUnitario().add(new BigDecimal("1.2")));*/
        // Prueba registrar producto
        /*Logger logger = Logger.getLogger(GestorSQLServer.class.getName());
        String codigoBarras;
        Scanner sc = new Scanner(System.in);
        codigoBarras = sc.nextLine();
        try {
            Producto nuevProducto = new Producto();
            PaqueteProducto nuevoPaqueteProducto = new PaqueteProducto();
            Inventario nuevoInventario = new Inventario();
            CategoriaProducto nuevCategoriaProductoca = new CategoriaProducto();
            Empaque nuevoEmpaque = new Empaque();
            Codigo codigo = new Codigo();

            codigo.setCodigo(codigoBarras); // 1
            nuevProducto.setNombreProducto("NombreTxt.getText()"); // 2
            nuevProducto.setDescripcion("DescriptionTxt.getText()"); // 3
            nuevoPaqueteProducto.setCantidad(Integer.parseInt("1"));

            DateTimeFormatter textFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechLocalDate = LocalDate.parse("11/02/2024", textFormt);


            nuevoPaqueteProducto.setFechaCaducidad(fechLocalDate);
            nuevoInventario.setPrecio(new BigDecimal("11"));
            nuevoInventario.setPrecioCosto(new BigDecimal("12"));
            nuevoEmpaque.setTipoEmpaque("EmpaqueCombobox.getSelectedItem().toString()");
            nuevCategoriaProductoca.setNombre("CategoriaCombobox.getSelectedItem().toString()");

            nuevProducto.setCodigo(codigo);
            nuevProducto.setEmpaque(nuevoEmpaque);
            nuevProducto.setCategoriaProducto(nuevCategoriaProductoca);
            nuevProducto.setInventario(nuevoInventario);
            nuevProducto.setPaqueteProducto(nuevoPaqueteProducto);


            CtrlProducto CP = new CtrlProducto();

            CP.registrar(nuevProducto);
            System.out.println("se registro en la base de datos");

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error de CAPA 8","Advertencia", 2);
            System.out.println(e.getMessage());
            //System.out.println(e.getLocalizedMessage());
            System.out.println(logger.getName().toUpperCase());
            logger.log(Level.SEVERE, "Error de conexión de Baase de Datos", e);
        }

        /*CtrlEmpaque ctrlEmpaque = new CtrlEmpaque();
        Empaque empaque = new Empaque();
        empaque.setTipoEmpaque("prueba888empaque");
        ctrlEmpaque.registrar(empaque);
*/      
        //try {
            CtrlProducto producto = new CtrlProducto();
        Producto p = new Producto();
        Codigo co  = new Codigo();
        String code = "renz04ii2";
        co.setCodigo(code);
        p.setCodigo(co);
        
        if (producto.leer(p) != null) {
            System.out.println("Se encontro el producto");
        }else{
            System.out.println("No se econtro el producto");
       }
        //} catch (Exception e) {
           // e.getMessage();
        //}
    }
}
