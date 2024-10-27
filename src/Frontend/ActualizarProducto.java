package Frontend;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ActualizarProducto extends javax.swing.JFrame {

    public ActualizarProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizarProducto = new javax.swing.JPanel();
        CantidadJlabel = new javax.swing.JLabel();
        FechaCaducidad = new javax.swing.JLabel();
        CantiTxt = new javax.swing.JTextField();
        FvText = new javax.swing.JTextField();
        ConfirmacionProducto = new javax.swing.JPanel();
        TextConfirmar = new javax.swing.JLabel();
        CantSeparador = new javax.swing.JSeparator();
        FvSeparador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actualizarProducto.setBackground(new java.awt.Color(255, 255, 255));

        CantidadJlabel.setBackground(new java.awt.Color(255, 255, 255));
        CantidadJlabel.setForeground(new java.awt.Color(0, 0, 0));
        CantidadJlabel.setText("Cantidad");

        FechaCaducidad.setBackground(new java.awt.Color(255, 255, 255));
        FechaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        FechaCaducidad.setText("FV");

        CantiTxt.setBackground(new java.awt.Color(255, 255, 255));
        CantiTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CantiTxt.setForeground(new java.awt.Color(153, 153, 153));
        CantiTxt.setText("Insertar");
        CantiTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CantiTxtMouseClicked(evt);
            }
        });
        CantiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantiTxtActionPerformed(evt);
            }
        });

        FvText.setBackground(new java.awt.Color(255, 255, 255));
        FvText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FvText.setForeground(new java.awt.Color(153, 153, 153));
        FvText.setText("Insertar");
        FvText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FvTextKeyPressed(evt);
            }
        });

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
        TextConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextConfirmarMouseClicked(evt);
            }
        });

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

        CantSeparador.setBackground(new java.awt.Color(255, 255, 255));
        CantSeparador.setForeground(new java.awt.Color(0, 0, 0));

        FvSeparador.setBackground(new java.awt.Color(255, 255, 255));
        FvSeparador.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout actualizarProductoLayout = new javax.swing.GroupLayout(actualizarProducto);
        actualizarProducto.setLayout(actualizarProductoLayout);
        actualizarProductoLayout.setHorizontalGroup(
            actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarProductoLayout.createSequentialGroup()
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actualizarProductoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(actualizarProductoLayout.createSequentialGroup()
                                .addComponent(CantidadJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CantSeparador)
                                    .addComponent(CantiTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizarProductoLayout.createSequentialGroup()
                                .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FvSeparador)
                                    .addComponent(FvText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))))
                    .addGroup(actualizarProductoLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(ConfirmacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        actualizarProductoLayout.setVerticalGroup(
            actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarProductoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CantidadJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(CantSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FvText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(FvSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void TextConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextConfirmarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextConfirmarMouseClicked

    private void CantiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantiTxtActionPerformed

    private void CantiTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CantiTxtMouseClicked
        VistaProducto VP = new VistaProducto();
        CantiTxt.setText("");
        CantiTxt.setForeground(Color.BLACK);
        String Text;
        Text = CantiTxt.getText();
        VP.setDato(Text);
        CantiTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (e.isTemporary()) return;
                FvText.setText("");
                FvText.setForeground(Color.BLACK);
            }
        });
    }//GEN-LAST:event_CantiTxtMouseClicked

    private void FvTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FvTextKeyPressed
        
    }//GEN-LAST:event_FvTextKeyPressed


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
    private javax.swing.JSeparator CantSeparador;
    private javax.swing.JTextField CantiTxt;
    private javax.swing.JLabel CantidadJlabel;
    private javax.swing.JPanel ConfirmacionProducto;
    private javax.swing.JLabel FechaCaducidad;
    private javax.swing.JSeparator FvSeparador;
    private javax.swing.JTextField FvText;
    private javax.swing.JLabel TextConfirmar;
    private javax.swing.JPanel actualizarProducto;
    // End of variables declaration//GEN-END:variables
}
