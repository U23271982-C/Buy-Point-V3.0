
package Frontend.PaqueteProductos;

import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;

public class RegistrarPaqueteProductoPanel extends javax.swing.JFrame {

    public RegistrarPaqueteProductoPanel() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(Confirmar, "/img/imagenConfirmar.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Confirmar = new javax.swing.JLabel();
        PanelX = new javax.swing.JPanel();
        XjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo Paquete");

        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenConfirmar.png"))); // NOI18N
        Confirmar.setMaximumSize(new java.awt.Dimension(100, 73));
        Confirmar.setMinimumSize(new java.awt.Dimension(165, 35));
        Confirmar.setPreferredSize(new java.awt.Dimension(100, 80));
        Confirmar.setRequestFocusEnabled(false);
        Confirmar.setVerifyInputWhenFocusTarget(false);

        PanelX.setBackground(new java.awt.Color(255, 255, 255));
        PanelX.setForeground(new java.awt.Color(255, 255, 255));
        PanelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelXMouseExited(evt);
            }
        });
        PanelX.setLayout(new java.awt.GridBagLayout());

        XjLabel.setBackground(new java.awt.Color(255, 255, 255));
        XjLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        XjLabel.setForeground(new java.awt.Color(0, 0, 0));
        XjLabel.setText("X");
        PanelX.add(XjLabel, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addComponent(PanelX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaqueteProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaqueteProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaqueteProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaqueteProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPaqueteProductoPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Confirmar;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel XjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
