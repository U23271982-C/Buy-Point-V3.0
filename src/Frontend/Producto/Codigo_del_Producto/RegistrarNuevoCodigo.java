
package Frontend.Producto.Codigo_del_Producto;

import Backend.Controladores.CtrlCodigo;
import Backend.Controladores.CtrlProducto;
import Backend.Entidades.Codigo;
import Backend.Entidades.Empaque;
import Backend.Entidades.Producto;
import static Frontend.FormulariosPrincipales.InventarioPanel.codigoBarras;
import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class RegistrarNuevoCodigo extends javax.swing.JFrame {
    public RegistrarNuevoCodigo() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(Confirmar, "/img/imagenConfirmar.png");
        this.cargadeProductosRegistrados(Productosregistrados);
    }
    
    private void cargadeProductosRegistrados(JComboBox jComboBox){
        CtrlProducto CP = new CtrlProducto();
        
        ArrayList<Producto> opciones = CP.listar();
        for(Producto lista: opciones){
            jComboBox.addItem(lista.getNombreProducto());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevoCodePanel = new javax.swing.JPanel();
        NomProJLabel = new javax.swing.JLabel();
        CodeBarrJLabel = new javax.swing.JLabel();
        NuevoCodeBarr = new javax.swing.JTextField();
        PanelX = new javax.swing.JPanel();
        XTxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Productosregistrados = new javax.swing.JComboBox<>();
        Confirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        NuevoCodePanel.setBackground(new java.awt.Color(255, 255, 255));
        NuevoCodePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NomProJLabel.setForeground(new java.awt.Color(0, 0, 0));
        NomProJLabel.setText("Nombre de producto");

        CodeBarrJLabel.setForeground(new java.awt.Color(0, 0, 0));
        CodeBarrJLabel.setText("Nuevo codigo de barras");

        NuevoCodeBarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoCodeBarrActionPerformed(evt);
            }
        });

        PanelX.setBackground(new java.awt.Color(255, 255, 255));
        PanelX.setPreferredSize(new java.awt.Dimension(40, 40));
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

        XTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        XTxt.setForeground(new java.awt.Color(0, 0, 0));
        XTxt.setText("X");
        PanelX.add(XTxt, new java.awt.GridBagConstraints());

        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenConfirmar.png"))); // NOI18N
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NuevoCodePanelLayout = new javax.swing.GroupLayout(NuevoCodePanel);
        NuevoCodePanel.setLayout(NuevoCodePanelLayout);
        NuevoCodePanelLayout.setHorizontalGroup(
            NuevoCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevoCodePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(NuevoCodePanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(NuevoCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodeBarrJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomProJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(NuevoCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(NuevoCodeBarr, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(Productosregistrados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NuevoCodePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        NuevoCodePanelLayout.setVerticalGroup(
            NuevoCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevoCodePanelLayout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(NuevoCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomProJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Productosregistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(NuevoCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodeBarrJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoCodeBarr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevoCodePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevoCodePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoCodeBarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoCodeBarrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoCodeBarrActionPerformed

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        CtrlCodigo CC = new CtrlCodigo();
        Codigo C = new Codigo();
        Producto P = new Producto();
        
        P.setNombreProducto(Productosregistrados.getSelectedItem().toString());
        C.setProducto(P);
        C.setCodigo(NuevoCodeBarr.getText().trim());
        
        CC.registrar(C);
        this.setVisible(false);
    }//GEN-LAST:event_ConfirmarMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(RegistrarNuevoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarNuevoCodigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodeBarrJLabel;
    private javax.swing.JLabel Confirmar;
    private javax.swing.JLabel NomProJLabel;
    private javax.swing.JTextField NuevoCodeBarr;
    private javax.swing.JPanel NuevoCodePanel;
    private javax.swing.JPanel PanelX;
    private javax.swing.JComboBox<String> Productosregistrados;
    private javax.swing.JLabel XTxt;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
