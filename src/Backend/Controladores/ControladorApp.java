package Backend.Controladores;

import Backend.Entidades.CredencialesTienda;
import Backend.Entidades.Entidad;

/*
* Contralador, se encarga de controlar todos los botones de la App
* */
public class ControladorApp {
    static String consultaSQL;

    //Inicar sesion de  BuyPoint
    public static boolean iniciarSesion
        (CtrlCredencialesUsuario ctrlCredencialesUsuario, CredencialesTienda credencialesUsuario){
        return ctrlCredencialesUsuario.leer(credencialesUsuario) != null;
    }

    public static void funPanelInventario(){

    }
}
