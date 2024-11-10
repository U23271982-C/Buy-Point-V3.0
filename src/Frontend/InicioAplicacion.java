
package Frontend;

import static Frontend.LogoCarga.progressBar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InicioAplicacion {
    public static void main(String[] args) {
        LogoCarga lg = new LogoCarga();
        LoginPanel lp = new LoginPanel();
        lg.setVisible(true);
        
        for (int i = 1; i < 31 ; i++) {
            
            try {
                Thread.sleep(80);
                progressBar.setValue(i);
                if(i == 30){
                    lg.setVisible(false);
                    lp.setVisible(true);
                    lp.toFront();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(LogoCarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
