
package Frontend;

import Frontend.FormulariosPrincipales.MenuPrincipalPanel;
import Frontend.visualFramework.Formato_Imagen;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LogoCarga extends javax.swing.JFrame {

    public LogoCarga() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(Logo, "/img/logo.png");
        InicioSesion();
    }

    private void InicioSesion (){
        MenuPrincipalPanel MPP = new MenuPrincipalPanel();
        
        for (int i = 1; i < 100 ; i+=2) {
            
            try {
                Thread.sleep(80);
                progressBar.setValue(i);
                if(i == 99){
                    this.setVisible(false);
                    MPP.setVisible(true);
                    MPP.toFront();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(LogoCarga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCarga = new javax.swing.JPanel();
        PanelLogo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        PanelNombre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelProgressBar = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panelCarga.setBackground(new java.awt.Color(126, 123, 123));

        PanelLogo.setBackground(new java.awt.Color(126, 123, 123));
        PanelLogo.setLayout(new java.awt.GridBagLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        Logo.setToolTipText("");
        PanelLogo.add(Logo, new java.awt.GridBagConstraints());

        PanelNombre.setBackground(new java.awt.Color(126, 123, 123));
        PanelNombre.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUY POINT");
        PanelNombre.add(jLabel1, new java.awt.GridBagConstraints());

        PanelProgressBar.setBackground(new java.awt.Color(126, 123, 123));
        PanelProgressBar.setLayout(new java.awt.GridBagLayout());

        progressBar.setBackground(new java.awt.Color(204, 204, 204));
        progressBar.setPreferredSize(new java.awt.Dimension(500, 8));
        PanelProgressBar.add(progressBar, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout panelCargaLayout = new javax.swing.GroupLayout(panelCarga);
        panelCarga.setLayout(panelCargaLayout);
        panelCargaLayout.setHorizontalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(PanelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
        panelCargaLayout.setVerticalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCargaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(PanelProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
               
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogoCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelNombre;
    private javax.swing.JPanel PanelProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelCarga;
    public static javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
