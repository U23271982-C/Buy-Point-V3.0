package Frontend.Producto;

import Backend.Controladores.CtrlPaqueteProducto;
import Backend.Entidades.Codigo;
import Backend.Entidades.Lote;
import Backend.Entidades.Producto;
import static Frontend.FormulariosPrincipales.InventarioPanel.codigoBarras;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class AgregarCantidadyFV_Producto extends javax.swing.JFrame {

    public AgregarCantidadyFV_Producto() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizarProducto = new javax.swing.JPanel();
        CantidadJlabel = new javax.swing.JLabel();
        FechaCaducidad = new javax.swing.JLabel();
        CantiTxt = new javax.swing.JTextField();
        FvText = new javax.swing.JTextField();
        CantSeparador = new javax.swing.JSeparator();
        FvSeparador = new javax.swing.JSeparator();
        PanelX = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        PanelConfirmar = new javax.swing.JPanel();
        JlabelConfirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        actualizarProducto.setBackground(new java.awt.Color(255, 255, 255));
        actualizarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        CantiTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CantiTxtKeyPressed(evt);
            }
        });

        FvText.setBackground(new java.awt.Color(255, 255, 255));
        FvText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FvText.setForeground(new java.awt.Color(153, 153, 153));
        FvText.setText("Insertar");
        FvText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FvTextMouseClicked(evt);
            }
        });
        FvText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FvTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FvTextKeyTyped(evt);
            }
        });

        CantSeparador.setBackground(new java.awt.Color(255, 255, 255));
        CantSeparador.setForeground(new java.awt.Color(102, 102, 102));

        FvSeparador.setBackground(new java.awt.Color(255, 255, 255));
        FvSeparador.setForeground(new java.awt.Color(102, 102, 102));

        PanelX.setBackground(new java.awt.Color(255, 255, 255));
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

        Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(0, 0, 0));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        PanelX.add(Cerrar, new java.awt.GridBagConstraints());

        PanelConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        PanelConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelConfirmarMouseExited(evt);
            }
        });

        JlabelConfirmar.setForeground(new java.awt.Color(51, 51, 51));
        JlabelConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelConfirmar.setText("Confirmar");
        JlabelConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlabelConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JlabelConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JlabelConfirmarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelConfirmarLayout = new javax.swing.GroupLayout(PanelConfirmar);
        PanelConfirmar.setLayout(PanelConfirmarLayout);
        PanelConfirmarLayout.setHorizontalGroup(
            PanelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(PanelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelConfirmarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JlabelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelConfirmarLayout.setVerticalGroup(
            PanelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(PanelConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelConfirmarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JlabelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout actualizarProductoLayout = new javax.swing.GroupLayout(actualizarProducto);
        actualizarProducto.setLayout(actualizarProductoLayout);
        actualizarProductoLayout.setHorizontalGroup(
            actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizarProductoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(actualizarProductoLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(actualizarProductoLayout.createSequentialGroup()
                            .addComponent(CantidadJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CantiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(actualizarProductoLayout.createSequentialGroup()
                            .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FvSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FvText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 170, Short.MAX_VALUE))
        );
        actualizarProductoLayout.setVerticalGroup(
            actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarProductoLayout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(CantSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FvText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FvSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(actualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantiTxtActionPerformed
        
    }//GEN-LAST:event_CantiTxtActionPerformed

    private void CantiTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CantiTxtMouseClicked
        CantiTxt.setText("");
        CantiTxt.setForeground(Color.BLACK);
        /*VistaProducto VP = new VistaProducto();
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
        });*/
    }//GEN-LAST:event_CantiTxtMouseClicked

    private void FvTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FvTextKeyPressed
        FvText.setForeground(Color.BLACK);
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.ConfirmarActualizacion();
        }
    }//GEN-LAST:event_FvTextKeyPressed

    private void PanelConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelConfirmarMouseEntered
        PanelConfirmar.setBackground(Color.LIGHT_GRAY);
        JlabelConfirmar.setForeground(Color.WHITE);
    }//GEN-LAST:event_PanelConfirmarMouseEntered

    private void PanelConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelConfirmarMouseExited
        PanelConfirmar.setBackground(Color.WHITE);
        JlabelConfirmar.setForeground(Color.BLACK);
    }//GEN-LAST:event_PanelConfirmarMouseExited

    private void JlabelConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlabelConfirmarMouseEntered
        PanelConfirmar.setBackground(Color.LIGHT_GRAY);
        JlabelConfirmar.setForeground(Color.WHITE);
    }//GEN-LAST:event_JlabelConfirmarMouseEntered

    private void JlabelConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlabelConfirmarMouseExited
        PanelConfirmar.setBackground(Color.WHITE);
        JlabelConfirmar.setForeground(Color.BLACK);
    }//GEN-LAST:event_JlabelConfirmarMouseExited

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_CerrarMouseExited

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.CancelarActualizacion();
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelConfirmarMouseClicked
        /*VistaProducto VP = new VistaProducto();
        //CantiTxt.setText("");
        //CantiTxt.setForeground(Color.BLACK);
        String Text;
        Text = CantiTxt.getText();
        VP.setDato(Text);
        VP.setVisible(true);
        this.setVisible(false);
        CantiTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (e.isTemporary()) return;
                FvText.setText("");
                FvText.setForeground(Color.BLACK);
            }
        });*/
        this.ConfirmarActualizacion();
    }//GEN-LAST:event_PanelConfirmarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        this.CancelarActualizacion();
    }//GEN-LAST:event_CerrarMouseClicked

    private void JlabelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlabelConfirmarMouseClicked
        this.ConfirmarActualizacion();
    }//GEN-LAST:event_JlabelConfirmarMouseClicked

    private void FvTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FvTextMouseClicked
        FvText.setText("");
        FvText.setForeground(Color.BLACK);
    }//GEN-LAST:event_FvTextMouseClicked

    private void FvTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FvTextKeyTyped
        if(FvText.getText().length() >= 10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_FvTextKeyTyped

    private void CantiTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantiTxtKeyPressed
        CantiTxt.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("TAB"), "tabPressed");
        CantiTxt.getActionMap().put("tabPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar el campo de contraseña cuando se presiona Tab
                FvText.setText("");
                
            }
        });
    }//GEN-LAST:event_CantiTxtKeyPressed
    
    public void ConfirmarActualizacion(){
        try {
//            VistaProducto VP = new VistaProducto();
//            String Text, FV;
//            Text = CantiTxt.getText().trim();
//            
//            DateTimeFormatter textFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            LocalDate FVDate = LocalDate.parse(FvText.getText().trim(),textFormt);
//            
//            FV = FVDate.format(textFormt);
//       
//            VP.setDato(Text,FV);
//            VP.setVisible(true);
//            VP.toFront();
//            this.setVisible(false);

            CtrlPaqueteProducto CPP = new CtrlPaqueteProducto();
            Producto P = new Producto();
            Codigo C = new Codigo();
            Lote PP = new Lote();
            
            C.setCodigo(codigoBarras);
            P.setCodigo(C);
            
            DateTimeFormatter textFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate FVDate = LocalDate.parse(FvText.getText().trim(),textFormt);
            
            int cantidad = Integer.parseInt(CantiTxt.getText().trim());
            
            P.getPaqueteProducto().setCantidad(cantidad);
            P.getPaqueteProducto().setFechaCaducidad(FVDate);
            
            PP.setProducto(P);
            CPP.registrar(PP);
                  
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error \nIngrese nuevamente los datos " + e.getMessage());
            System.out.println(e.getMessage());
        }
        setVisible(false);
    }
    
    public void CancelarActualizacion(){
        this.setVisible(false);
//        VistaProducto VP = new VistaProducto();
//        VP.setVisible(true);
//        VP.toFront();
    }

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
            java.util.logging.Logger.getLogger(AgregarCantidadyFV_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCantidadyFV_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCantidadyFV_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCantidadyFV_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCantidadyFV_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator CantSeparador;
    private javax.swing.JTextField CantiTxt;
    private javax.swing.JLabel CantidadJlabel;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel FechaCaducidad;
    private javax.swing.JSeparator FvSeparador;
    private javax.swing.JTextField FvText;
    private javax.swing.JLabel JlabelConfirmar;
    private javax.swing.JPanel PanelConfirmar;
    private javax.swing.JPanel PanelX;
    private javax.swing.JPanel actualizarProducto;
    // End of variables declaration//GEN-END:variables
}
