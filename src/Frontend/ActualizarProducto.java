/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import java.awt.Color;

/**
 *
 * @author glen
 */
public class ActualizarProducto extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarProducto
     */
    public ActualizarProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizarProducto = new javax.swing.JPanel();
        CantidadJlabel = new javax.swing.JLabel();
        FechaCaducidad = new javax.swing.JLabel();
        CantidadIngresada = new javax.swing.JLabel();
        FechaIngresada = new javax.swing.JLabel();
        ConfirmacionProducto = new javax.swing.JPanel();
        TextConfirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actualizarProducto.setBackground(new java.awt.Color(255, 255, 255));

        CantidadJlabel.setBackground(new java.awt.Color(255, 255, 255));
        CantidadJlabel.setForeground(new java.awt.Color(0, 0, 0));
        CantidadJlabel.setText("Cantidad");

        FechaCaducidad.setBackground(new java.awt.Color(255, 255, 255));
        FechaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        FechaCaducidad.setText("FV");

        CantidadIngresada.setBackground(new java.awt.Color(255, 255, 255));
        CantidadIngresada.setForeground(new java.awt.Color(0, 0, 0));
        CantidadIngresada.setText("50");

        FechaIngresada.setBackground(new java.awt.Color(255, 255, 255));
        FechaIngresada.setForeground(new java.awt.Color(0, 0, 0));
        FechaIngresada.setText("99/99/9999");

        ConfirmacionProducto.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmacionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmacionProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmacionProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmacionProductoMouseExited(evt);
            }
        });

        TextConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        TextConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        TextConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextConfirmar.setText("Confirmar");

        javax.swing.GroupLayout ConfirmacionProductoLayout = new javax.swing.GroupLayout(ConfirmacionProducto);
        ConfirmacionProducto.setLayout(ConfirmacionProductoLayout);
        ConfirmacionProductoLayout.setHorizontalGroup(
            ConfirmacionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
            .addGroup(ConfirmacionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ConfirmacionProductoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TextConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ConfirmacionProductoLayout.setVerticalGroup(
            ConfirmacionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(ConfirmacionProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ConfirmacionProductoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TextConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout actualizarProductoLayout = new javax.swing.GroupLayout(actualizarProducto);
        actualizarProducto.setLayout(actualizarProductoLayout);
        actualizarProductoLayout.setHorizontalGroup(
            actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarProductoLayout.createSequentialGroup()
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actualizarProductoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantidadJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(actualizarProductoLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(ConfirmacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        actualizarProductoLayout.setVerticalGroup(
            actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarProductoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(ConfirmacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmacionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmacionProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmacionProductoMouseClicked

    private void ConfirmacionProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmacionProductoMouseEntered
        ConfirmacionProducto.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ConfirmacionProductoMouseEntered

    private void ConfirmacionProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmacionProductoMouseExited
        ConfirmacionProducto.setBackground(Color.WHITE);
    }//GEN-LAST:event_ConfirmacionProductoMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadIngresada;
    private javax.swing.JLabel CantidadJlabel;
    private javax.swing.JPanel ConfirmacionProducto;
    private javax.swing.JLabel FechaCaducidad;
    private javax.swing.JLabel FechaIngresada;
    private javax.swing.JLabel TextConfirmar;
    private javax.swing.JPanel actualizarProducto;
    // End of variables declaration//GEN-END:variables
}
