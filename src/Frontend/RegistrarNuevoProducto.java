
package Frontend;

import Backend.Controladores.CtrlProducto;
import Backend.Entidades.Codigo;
import Backend.Entidades.Producto;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistrarNuevoProducto extends javax.swing.JFrame {

    public RegistrarNuevoProducto() {
        initComponents();
        setLocationRelativeTo(null);
        EmpaqueCombobox.setOpaque(true);
        EmpaqueCombobox.setBackground(Color.WHITE);
        EmpaqueCombobox.setForeground(Color.BLACK);
        CategoriaCombobox.setOpaque(true);
        CategoriaCombobox.setBackground(Color.WHITE);
        CategoriaCombobox.setForeground(Color.BLACK);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vistaproducto = new javax.swing.JPanel();
        ImagenJLabel = new javax.swing.JLabel();
        NombreJLabel = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        DescriptionJLabel = new javax.swing.JLabel();
        DescriptionTxt = new javax.swing.JTextField();
        FvJLabel = new javax.swing.JLabel();
        FvTxt = new javax.swing.JTextField();
        CantidadJLabel = new javax.swing.JLabel();
        CantidadTxt = new javax.swing.JTextField();
        EmpaqueJLabel = new javax.swing.JLabel();
        EmpaqueCombobox = new javax.swing.JComboBox<>();
        CategoriaJLabel = new javax.swing.JLabel();
        CategoriaCombobox = new javax.swing.JComboBox<>();
        PanelX = new javax.swing.JPanel();
        XjLabel = new javax.swing.JLabel();
        ConfirmarButton = new javax.swing.JButton();
        PrecioVentaJLabel = new javax.swing.JLabel();
        PrecioVentaTxt = new javax.swing.JTextField();
        PrecioProovedorJLabel = new javax.swing.JLabel();
        PrecioProovedorTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        vistaproducto.setBackground(new java.awt.Color(255, 255, 255));
        vistaproducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ImagenJLabel.setForeground(new java.awt.Color(0, 0, 0));
        ImagenJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenJLabel.setText("Imagen");
        ImagenJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NombreJLabel.setForeground(new java.awt.Color(0, 0, 0));
        NombreJLabel.setText(" Nombre");

        NombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTxtActionPerformed(evt);
            }
        });
        NombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreTxtKeyTyped(evt);
            }
        });

        DescriptionJLabel.setForeground(new java.awt.Color(0, 0, 0));
        DescriptionJLabel.setText(" Descripción ");

        DescriptionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionTxtActionPerformed(evt);
            }
        });
        DescriptionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescriptionTxtKeyTyped(evt);
            }
        });

        FvJLabel.setForeground(new java.awt.Color(0, 0, 0));
        FvJLabel.setText(" FV");

        FvTxt.setText("24/12");
        FvTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FvTxtActionPerformed(evt);
            }
        });

        CantidadJLabel.setForeground(new java.awt.Color(0, 0, 0));
        CantidadJLabel.setText(" Cantidad");

        CantidadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadTxtActionPerformed(evt);
            }
        });
        CantidadTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CantidadTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadTxtKeyTyped(evt);
            }
        });

        EmpaqueJLabel.setForeground(new java.awt.Color(0, 0, 0));
        EmpaqueJLabel.setText("     Empaque");

        EmpaqueCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Posicion retur", "Item 2", "Item 3", "Item 4" }));
        EmpaqueCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpaqueComboboxActionPerformed(evt);
            }
        });

        CategoriaJLabel.setForeground(new java.awt.Color(0, 0, 0));
        CategoriaJLabel.setText("Categoria");

        CategoriaCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        XjLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        XjLabel.setForeground(new java.awt.Color(0, 0, 0));
        XjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XjLabel.setText("X");
        XjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XjLabelMouseExited(evt);
            }
        });
        PanelX.add(XjLabel, new java.awt.GridBagConstraints());

        ConfirmarButton.setText("Confirmar");
        ConfirmarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarButtonMouseClicked(evt);
            }
        });

        PrecioVentaJLabel.setForeground(new java.awt.Color(0, 0, 0));
        PrecioVentaJLabel.setText("Precio de Venta");
        PrecioVentaJLabel.setToolTipText("");

        PrecioVentaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioVentaTxtKeyTyped(evt);
            }
        });

        PrecioProovedorJLabel.setForeground(new java.awt.Color(0, 0, 0));
        PrecioProovedorJLabel.setText("Precio de Proovedor");

        PrecioProovedorTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioProovedorTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout vistaproductoLayout = new javax.swing.GroupLayout(vistaproducto);
        vistaproducto.setLayout(vistaproductoLayout);
        vistaproductoLayout.setHorizontalGroup(
            vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vistaproductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagenJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(vistaproductoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FvJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(NombreJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FvTxt)
                    .addComponent(DescriptionTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CantidadJLabel)
                    .addComponent(CantidadTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(PrecioVentaTxt)
                    .addComponent(PrecioProovedorTxt)
                    .addComponent(PrecioVentaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioProovedorJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vistaproductoLayout.createSequentialGroup()
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vistaproductoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(EmpaqueCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vistaproductoLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(ConfirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vistaproductoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(EmpaqueJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoriaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        vistaproductoLayout.setVerticalGroup(
            vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaproductoLayout.createSequentialGroup()
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(vistaproductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ImagenJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreJLabel)
                    .addComponent(CantidadJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionJLabel)
                    .addComponent(PrecioVentaJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioVentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FvJLabel)
                    .addComponent(PrecioProovedorJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FvTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioProovedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpaqueJLabel)
                    .addComponent(CategoriaJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vistaproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpaqueCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(ConfirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescriptionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTxtActionPerformed

    private void NombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTxtActionPerformed

    private void EmpaqueComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpaqueComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpaqueComboboxActionPerformed

    private void FvTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FvTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FvTxtActionPerformed

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    private void XjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XjLabelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_XjLabelMouseClicked

    private void XjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XjLabelMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_XjLabelMouseEntered

    private void XjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XjLabelMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_XjLabelMouseExited

    private void CantidadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadTxtActionPerformed

    private void ConfirmarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarButtonMouseClicked
        
    }//GEN-LAST:event_ConfirmarButtonMouseClicked

    private void NombreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTxtKeyTyped
        if(NombreTxt.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       } 
    }//GEN-LAST:event_NombreTxtKeyTyped

    private void DescriptionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescriptionTxtKeyTyped
        if(DescriptionTxt.getText().length() >= 150){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_DescriptionTxtKeyTyped
    
    //parte
    private void CantidadTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadTxtKeyPressed
    //inutil
    
    private void CantidadTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadTxtKeyTyped
        char caracter = evt.getKeyChar();
        
        this.BloquearCaracteres(CantidadTxt, caracter, evt);
        /*if (!Character.isDigit(c)) {// Bloquear caracteres no numéricos
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }*/
           
    }//GEN-LAST:event_CantidadTxtKeyTyped

    private void PrecioVentaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioVentaTxtKeyTyped
        char c = evt.getKeyChar();
        
        this.BloquearCaracteres(PrecioVentaTxt, c, evt);
        /*if (!Character.isDigit(c)) {// Bloquear caracteres no numéricos
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }*/
    }//GEN-LAST:event_PrecioVentaTxtKeyTyped

    public void BloquearCaracteres(JTextField text, char c, KeyEvent event){
        /*if (!Character.isDigit(c)) {// Bloquear caracteres no numéricos
                event.consume();
                Toolkit.getDefaultToolkit().beep();
            }*/
        if (Character.isDigit(c)) {
             return;
        } if (c == '.' && !text.getText().contains(".")) {
             return;
        }if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            return;
        }
        
        event.consume();
        Toolkit.getDefaultToolkit().beep();
    }
   
    private void PrecioProovedorTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioProovedorTxtKeyTyped
        char character = evt.getKeyChar();
        
        this.BloquearCaracteres(PrecioProovedorTxt, character, evt);
    }//GEN-LAST:event_PrecioProovedorTxtKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarNuevoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadJLabel;
    private javax.swing.JTextField CantidadTxt;
    private javax.swing.JComboBox<String> CategoriaCombobox;
    private javax.swing.JLabel CategoriaJLabel;
    private javax.swing.JButton ConfirmarButton;
    private javax.swing.JLabel DescriptionJLabel;
    private javax.swing.JTextField DescriptionTxt;
    private javax.swing.JComboBox<String> EmpaqueCombobox;
    private javax.swing.JLabel EmpaqueJLabel;
    private javax.swing.JLabel FvJLabel;
    private javax.swing.JTextField FvTxt;
    private javax.swing.JLabel ImagenJLabel;
    private javax.swing.JLabel NombreJLabel;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel PrecioProovedorJLabel;
    private javax.swing.JTextField PrecioProovedorTxt;
    private javax.swing.JLabel PrecioVentaJLabel;
    private javax.swing.JTextField PrecioVentaTxt;
    private javax.swing.JLabel XjLabel;
    private javax.swing.JPanel vistaproducto;
    // End of variables declaration//GEN-END:variables
}
