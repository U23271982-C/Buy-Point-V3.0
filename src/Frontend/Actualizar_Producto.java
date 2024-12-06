package Frontend;

import Backend.Controladores.CtrlProducto;
import Backend.Entidades.Codigo;
import Backend.Entidades.Producto;
import Frontend.FormulariosPrincipales.InventarioPanel;
import static Frontend.FormulariosPrincipales.InventarioPanel.codigoBarras;
import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Actualizar_Producto extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        agregarProducto = new javax.swing.JPanel();
        FotoProducto = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JLabel();
        StockProducto = new javax.swing.JLabel();
        FechaCaducidad = new javax.swing.JLabel();
        SeparadorCantidad = new javax.swing.JSeparator();
        SeparadorStock = new javax.swing.JSeparator();
        SepardorFV = new javax.swing.JSeparator();
        PanelX = new javax.swing.JPanel();
        JLabelX = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        StockTxt = new javax.swing.JTextField();
        FVTxt = new javax.swing.JTextField();
        ConfirmarJLabel = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        agregarProducto.setBackground(new java.awt.Color(255, 255, 255));
        agregarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FotoProducto.setForeground(new java.awt.Color(0, 0, 0));
        FotoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FotoProducto.setText("FOTO DE PRODUCTO ");
        FotoProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        NombreProducto.setText("Nombre:");

        StockProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StockProducto.setForeground(new java.awt.Color(0, 0, 0));
        StockProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StockProducto.setText("Stock:");

        FechaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        FechaCaducidad.setText("FV:");

        SeparadorCantidad.setForeground(new java.awt.Color(0, 0, 0));

        SeparadorStock.setBackground(new java.awt.Color(255, 255, 255));
        SeparadorStock.setForeground(new java.awt.Color(0, 0, 0));

        SepardorFV.setBackground(new java.awt.Color(255, 255, 255));
        SepardorFV.setForeground(new java.awt.Color(0, 0, 0));

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

        JLabelX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JLabelX.setForeground(new java.awt.Color(0, 0, 0));
        JLabelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelX.setText("X");
        JLabelX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLabelXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLabelXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelXLayout = new javax.swing.GroupLayout(PanelX);
        PanelX.setLayout(PanelXLayout);
        PanelXLayout.setHorizontalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelXLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelXLayout.setVerticalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelXLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        NombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreTxt.setToolTipText("");
        NombreTxt.setBorder(null);
        NombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreTxtKeyTyped(evt);
            }
        });

        StockTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StockTxt.setBorder(null);
        StockTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockTxtActionPerformed(evt);
            }
        });
        StockTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StockTxtKeyTyped(evt);
            }
        });

        FVTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FVTxt.setText("dd/mm/yy");
        FVTxt.setBorder(null);
        FVTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FVTxtActionPerformed(evt);
            }
        });
        FVTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FVTxtKeyTyped(evt);
            }
        });

        ConfirmarJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenConfirmar.png"))); // NOI18N
        ConfirmarJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarJLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout agregarProductoLayout = new javax.swing.GroupLayout(agregarProducto);
        agregarProducto.setLayout(agregarProductoLayout);
        agregarProductoLayout.setHorizontalGroup(
            agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SepardorFV, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(StockTxt)
                                .addComponent(FVTxt)
                                .addComponent(SeparadorCantidad)
                                .addComponent(SeparadorStock)
                                .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                        .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))))
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(ConfirmarJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        agregarProductoLayout.setVerticalGroup(
            agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StockProducto))
                .addGap(3, 3, 3)
                .addComponent(SeparadorStock, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SepardorFV, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ConfirmarJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void JLabelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_JLabelXMouseClicked

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    private void JLabelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_JLabelXMouseEntered

    private void JLabelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_JLabelXMouseExited

    private void StockTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockTxtActionPerformed

    private void FVTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FVTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FVTxtActionPerformed

    private void NombreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTxtKeyTyped
        if(NombreTxt.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       } 
    }//GEN-LAST:event_NombreTxtKeyTyped

    private void StockTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StockTxtKeyTyped
        char c = evt.getKeyChar();
        RegistrarNuevoProducto.BloquearCaracteres(StockTxt, c, evt);
    }//GEN-LAST:event_StockTxtKeyTyped

    private void FVTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FVTxtKeyTyped
        if(FVTxt.getText().length() >= 10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char c = evt.getKeyChar();
        //RegistrarNuevoProducto.BloquearCaracteres(FVTxt, c, evt);
    }//GEN-LAST:event_FVTxtKeyTyped

    private void ConfirmarJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarJLabelMouseClicked
        try{
            
            DateTimeFormatter textFormt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechLocalDate = LocalDate.parse(FVTxt.getText().trim(),textFormt);
            
            
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ConfirmarJLabelMouseClicked

    public Actualizar_Producto() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(ConfirmarJLabel, "/img/imagenConfirmar.png");
        this.toFront();
    }
    
    
    public void NombreProducto(JLabel NombreProducto, JLabel CantidadStock, JLabel FechaCaducidad){
        CtrlProducto CP = new CtrlProducto();
        
        InventarioPanel IP = new InventarioPanel();
        
        Producto producto = new Producto();
        Codigo codigo = new Codigo();
        codigo.setCodigo(codigoBarras);
        producto.setCodigo(codigo);

        producto = CP.leer(producto);
        NombreProducto.setText(producto.getNombreProducto());
        CantidadStock.setText(String.valueOf(producto.getInventario().getStock()));
        FechaCaducidad.setText(String.valueOf(producto.getPaqueteProducto().getFechaCaducidad()));
    }
    
    public void CantidadStock(JLabel jLabel){
        
    }
    
    public void FechaCaducidad(JLabel jLabel){
        
    }
    
    public void tamañoimagen(JLabel label, String ruta){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta)). getImage()
        .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH))); 
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
            java.util.logging.Logger.getLogger(Actualizar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmarJLabel;
    private javax.swing.JTextField FVTxt;
    private javax.swing.JLabel FechaCaducidad;
    private javax.swing.JLabel FotoProducto;
    private javax.swing.JLabel JLabelX;
    private javax.swing.JLabel NombreProducto;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JPanel PanelX;
    private javax.swing.JSeparator SeparadorCantidad;
    private javax.swing.JSeparator SeparadorStock;
    private javax.swing.JSeparator SepardorFV;
    private javax.swing.JLabel StockProducto;
    private javax.swing.JTextField StockTxt;
    private javax.swing.JPanel agregarProducto;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
