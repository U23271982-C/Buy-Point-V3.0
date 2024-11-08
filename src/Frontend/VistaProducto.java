package Frontend;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class VistaProducto extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarProducto = new javax.swing.JPanel();
        FotoProducto = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JLabel();
        DescripcionProducto = new javax.swing.JLabel();
        StockProducto = new javax.swing.JLabel();
        CantidadStock = new javax.swing.JLabel();
        FechaCaducidad = new javax.swing.JLabel();
        FV = new javax.swing.JLabel();
        FotoAgregarProducto = new javax.swing.JLabel();
        SeparadorCantidad = new javax.swing.JSeparator();
        SeparadorStock = new javax.swing.JSeparator();
        SepardorFV = new javax.swing.JSeparator();
        PanelX = new javax.swing.JPanel();
        JLabelX = new javax.swing.JLabel();

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

        DescripcionProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionProducto.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescripcionProducto.setText("AAAA AAAAAA AA A AAAAAAA AAA A AAAA A");

        StockProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StockProducto.setForeground(new java.awt.Color(0, 0, 0));
        StockProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StockProducto.setText("Stock:");

        CantidadStock.setForeground(new java.awt.Color(0, 0, 0));
        CantidadStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CantidadStock.setText("54");

        FechaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        FechaCaducidad.setText("FV:");

        FV.setForeground(new java.awt.Color(0, 0, 0));
        FV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FV.setText("99/99/9999");

        FotoAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregarProducto.png"))); // NOI18N
        FotoAgregarProducto.setToolTipText("");
        FotoAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FotoAgregarProductoMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout agregarProductoLayout = new javax.swing.GroupLayout(agregarProducto);
        agregarProducto.setLayout(agregarProductoLayout);
        agregarProductoLayout.setHorizontalGroup(
            agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarProductoLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeparadorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SeparadorStock, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CantidadStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(agregarProductoLayout.createSequentialGroup()
                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FotoAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(agregarProductoLayout.createSequentialGroup()
                                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(agregarProductoLayout.createSequentialGroup()
                                        .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SepardorFV)
                                            .addComponent(FV, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)))
                        .addGap(247, 267, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                        .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))))
        );
        agregarProductoLayout.setVerticalGroup(
            agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorStock, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SepardorFV, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(FotoAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(agregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FotoAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoAgregarProductoMouseClicked
        ActualizarProducto AP = new ActualizarProducto();
        AP.setVisible(true);
        this.setVisible(false);
        AP.toFront();
    }//GEN-LAST:event_FotoAgregarProductoMouseClicked

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
    
    private String dato;
    public void setDato(String dato){
        this.dato = dato;
        int text1, text2;
        String textofinal;
        text1 = Integer.parseInt(dato);
        text2 = Integer.parseInt(CantidadStock.getText());
        textofinal = String.valueOf(text1 + text2);
        CantidadStock.setText(textofinal);
    }
    
    public VistaProducto() {
        initComponents();
        setLocationRelativeTo(null);
        this.tamañoimagen(FotoAgregarProducto, "/img/AgregarProducto.png");
        //agregar metodo para buscar la foto en la BD
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
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadStock;
    private javax.swing.JLabel DescripcionProducto;
    private javax.swing.JLabel FV;
    private javax.swing.JLabel FechaCaducidad;
    private javax.swing.JLabel FotoAgregarProducto;
    private javax.swing.JLabel FotoProducto;
    private javax.swing.JLabel JLabelX;
    private javax.swing.JLabel NombreProducto;
    private javax.swing.JPanel PanelX;
    private javax.swing.JSeparator SeparadorCantidad;
    private javax.swing.JSeparator SeparadorStock;
    private javax.swing.JSeparator SepardorFV;
    private javax.swing.JLabel StockProducto;
    private javax.swing.JPanel agregarProducto;
    // End of variables declaration//GEN-END:variables
}
