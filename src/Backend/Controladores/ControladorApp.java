package Backend.Controladores;

import Backend.Entidades.CredencialesTienda;

/*
* Contralador, se encarga de controlar todos los botones de la App
* */
public class ControladorApp {
    static String consultaSQL;
    public ControladorApp() {
    }
    //Inicar sesion de  BuyPoint

    public static boolean iniciarSesion
        (CtrlCredencialesTienda ctrlCredencialesUsuario, CredencialesTienda credencialesUsuario){
        return ctrlCredencialesUsuario.leer(credencialesUsuario) != null;
    }

}
