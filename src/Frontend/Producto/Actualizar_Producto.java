package Frontend.Producto;

import Backend.Controladores.CtrlProducto;
import Backend.Entidades.Codigo;
import Backend.Entidades.Producto;
import Frontend.FormulariosPrincipales.InventarioPanel;
import static Frontend.FormulariosPrincipales.InventarioPanel.codigoBarras;

import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Actualizar_Producto extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        agregarProducto = new javax.swing.JPanel();
        FotoProducto = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JLabel();
        NuevaDescipcion = new javax.swing.JLabel();
        NuevoPrecioVenta = new javax.swing.JLabel();
        SeparadorCantidad = new javax.swing.JSeparator();
        SeparadorDescripcion = new javax.swing.JSeparator();
        SepardorPrecioVenta = new javax.swing.JSeparator();
        PanelX = new javax.swing.JPanel();
        JLabelX = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        DescripcionTxt = new javax.swing.JTextField();
        PrecioVentaTxt = new javax.swing.JTextField();
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
        NombreProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreProducto.setText("Nombre:");

        NuevaDescipcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NuevaDescipcion.setForeground(new java.awt.Color(0, 0, 0));
        NuevaDescipcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevaDescipcion.setText("Descipción:");

        NuevoPrecioVenta.setForeground(new java.awt.Color(0, 0, 0));
        NuevoPrecioVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevoPrecioVenta.setText("Precio venta:");

        SeparadorCantidad.setForeground(new java.awt.Color(0, 0, 0));

        SeparadorDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        SeparadorDescripcion.setForeground(new java.awt.Color(0, 0, 0));

        SepardorPrecioVenta.setBackground(new java.awt.Color(255, 255, 255));
        SepardorPrecioVenta.setForeground(new java.awt.Color(0, 0, 0));

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

        DescripcionTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DescripcionTxt.setBorder(null);
        DescripcionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionTxtActionPerformed(evt);
            }
        });
        DescripcionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionTxtKeyTyped(evt);
            }
        });

        PrecioVentaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PrecioVentaTxt.setBorder(null);
        PrecioVentaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioVentaTxtActionPerformed(evt);
            }
        });
        PrecioVentaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PrecioVentaTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioVentaTxtKeyTyped(evt);
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
                .addGap(218, 218, 218)
                .addComponent(ConfirmarJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                        .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NuevoPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NuevaDescipcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SepardorPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DescripcionTxt)
                                .addComponent(PrecioVentaTxt)
                                .addComponent(SeparadorCantidad)
                                .addComponent(SeparadorDescripcion)
                                .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))))
        );
        agregarProductoLayout.setVerticalGroup(
            agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(agregarProductoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaDescipcion))
                .addGap(3, 3, 3)
                .addComponent(SeparadorDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioVentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SepardorPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void DescripcionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionTxtActionPerformed

    private void PrecioVentaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioVentaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioVentaTxtActionPerformed

    private void NombreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTxtKeyTyped
        if(NombreTxt.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       } 
    }//GEN-LAST:event_NombreTxtKeyTyped

    private void DescripcionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionTxtKeyTyped
        if(DescripcionTxt.getText().length() >= 150){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       }
    }//GEN-LAST:event_DescripcionTxtKeyTyped

    private void PrecioVentaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioVentaTxtKeyTyped
        char c = evt.getKeyChar();
        
        RegistrarNuevoProducto.BloquearCaracteres(PrecioVentaTxt, c, evt);
    }//GEN-LAST:event_PrecioVentaTxtKeyTyped

    private void ConfirmarJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarJLabelMouseClicked
        try{
            CtrlProducto CP = new CtrlProducto(); 
            //PaqueteProducto nuevoPaqueteProducto = new PaqueteProducto();
            Producto producto = new Producto();
            Codigo codigo = new Codigo();
            
            codigo.setCodigo(codigoBarras);
            producto.setCodigo(codigo);
            
            String nombre = NombreTxt.getText().trim();
            String descripcion = DescripcionTxt.getText().trim();
            String precioventa = PrecioVentaTxt.getText().trim();
            
            boolean existe = false;
            ArrayList<Producto> opciones = CP.listar();
            for (Producto listar : opciones) {
                if(listar.getNombreProducto().trim().equals(nombre)){
                   existe = true;
                   break;
                }
            }
            
            System.out.println(existe);
            if(!existe){
                producto.setNombreProducto(nombre);
                producto.setDescripcion(descripcion);
                producto.setPrecio(new BigDecimal(precioventa));
                
                CP.actualizar(producto);
                this.setVisible(false);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }//GEN-LAST:event_ConfirmarJLabelMouseClicked

    private void PrecioVentaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioVentaTxtKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
                
        }
    }//GEN-LAST:event_PrecioVentaTxtKeyPressed

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
    private javax.swing.JTextField DescripcionTxt;
    private javax.swing.JLabel FotoProducto;
    private javax.swing.JLabel JLabelX;
    private javax.swing.JLabel NombreProducto;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel NuevaDescipcion;
    private javax.swing.JLabel NuevoPrecioVenta;
    private javax.swing.JPanel PanelX;
    private javax.swing.JTextField PrecioVentaTxt;
    private javax.swing.JSeparator SeparadorCantidad;
    private javax.swing.JSeparator SeparadorDescripcion;
    private javax.swing.JSeparator SepardorPrecioVenta;
    private javax.swing.JPanel agregarProducto;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
