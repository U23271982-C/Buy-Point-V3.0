package Frontend.FormulariosPrincipales;

import javax.swing.*;
import java.awt.*;

public interface Animaciones {
    static void Disminuye(JComponent componente, int milisegundos, int saltos, int parar) {
        (new Thread() {
            @Override
            public void run() {
                for (int i = componente.getHeight(); i >= parar; i -= saltos) {
                    try {
                        Thread.sleep(milisegundos);
                        componente.setPreferredSize(new Dimension(componente.getWidth(), i));
                        SwingUtilities.updateComponentTreeUI(componente);
                        componente.getParent().revalidate();
                        componente.getParent().repaint();
                    } catch (InterruptedException e) {
                        System.out.println("Error Thread Interrumpido: " + e);
                    }
                }
            }
        }).start();
    }

    static void Agranda(JComponent componente, int milisegundos, int saltos, int parar) {
        (new Thread() {
            @Override
            public void run() {
                for (int i = componente.getHeight(); i <= parar; i += saltos) {
                    try {
                        Thread.sleep(milisegundos);
                        componente.setPreferredSize(new Dimension(componente.getWidth(), i));
                        SwingUtilities.updateComponentTreeUI(componente);
                        componente.getParent().revalidate();
                        componente.getParent().repaint();
                    } catch (InterruptedException e) {
                        System.out.println("Error Thread Interrumpido: " + e);
                    }
                }
            }
        }).start();
    }
}
