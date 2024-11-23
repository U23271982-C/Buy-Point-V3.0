package Backend;

import Backend.Controladores.CtrlCliente;
import Backend.Entidades.CredencialesTienda;
import Backend.Entidades.DetalleVenta;

import java.math.BigDecimal;

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
        DetalleVenta detalleVenta = new DetalleVenta();

        detalleVenta.setPrecioUnitario(new BigDecimal("1.2"));

        System.out.println(detalleVenta.getPrecioUnitario().add(new BigDecimal("1.2")));
    }
}
