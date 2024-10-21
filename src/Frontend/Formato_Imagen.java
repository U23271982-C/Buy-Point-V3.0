
package Frontend;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Formato_Imagen {
    public void escalarLaber(JLabel label, String ruta){
       label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta)). getImage()
      .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH))); 
    }
    
}
