
package Frontend;

import Frontend.FormulariosPrincipales.LoginPanel;
import Frontend.FormulariosPrincipales.MenuPrincipalPanel;
import static Frontend.LogoCarga.progressBar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InicioAplicacion {
    public static void main(String[] args) {
       LogoCarga lg = new LogoCarga();
        //LoginPanel lp = new LoginPanel();
        //MenuPrincipalPanel MPP = new MenuPrincipalPanel();
        //lg.setVisible(true);
        
       /* for (int i = 1; i < 100 ; i++) {
            
            try {
                Thread.sleep(50);
                progressBar.setValue(i);
                if(i == 99){
                    lg.setVisible(false);
                    MPP.setVisible(true);
                    MPP.toFront();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(LogoCarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }
}
