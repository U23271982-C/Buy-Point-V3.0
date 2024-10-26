/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author glen
 */
public class AgregarProductoPanel extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarProducto = new javax.swing.JPanel();
        FotoProducto = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JLabel();
        DescripcionProducto = new javax.swing.JLabel();
        StockProducto = new javax.swing.JLabel();
        CantidadStock = new javax.swing.JLabel();
        FechaProduccion = new javax.swing.JLabel();
        FC_Date = new javax.swing.JLabel();
        FechaCaducidad = new javax.swing.JLabel();
        FV = new javax.swing.JLabel();
        FotoAgregarProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregarProducto.setBackground(new java.awt.Color(255, 255, 255));

        FotoProducto.setForeground(new java.awt.Color(0, 0, 0));
        FotoProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FotoProducto.setText("FOTO DE PRODUCTO ");
        FotoProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        NombreProducto.setText("Nombre:");

        DescripcionProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripcionProducto.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DescripcionProducto.setText("AAAA AAAAAA AA A AAAAAAA AAA A AAAA A");

        StockProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StockProducto.setForeground(new java.awt.Color(0, 0, 0));
        StockProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StockProducto.setText("Stock:");

        CantidadStock.setForeground(new java.awt.Color(0, 0, 0));
        CantidadStock.setText("54");

        FechaProduccion.setForeground(new java.awt.Color(0, 0, 0));
        FechaProduccion.setText("FC:");

        FC_Date.setForeground(new java.awt.Color(0, 0, 0));
        FC_Date.setText("99/99/9999");

        FechaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        FechaCaducidad.setText("FV:");

        FV.setForeground(new java.awt.Color(0, 0, 0));
        FV.setText("99/99/9999");

        FotoAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregarProducto.png"))); // NOI18N
        FotoAgregarProducto.setToolTipText("");

        javax.swing.GroupLayout agregarProductoLayout = new javax.swing.GroupLayout(agregarProducto);
        agregarProducto.setLayout(agregarProductoLayout);
        agregarProductoLayout.setHorizontalGroup(
            agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                        .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregarProductoLayout.createSequentialGroup()
                                .addComponent(FechaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FC_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarProductoLayout.createSequentialGroup()
                                .addComponent(StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarProductoLayout.createSequentialGroup()
                                .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarProductoLayout.createSequentialGroup()
                                .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductoLayout.createSequentialGroup()
                        .addComponent(FotoAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))))
        );
        agregarProductoLayout.setVerticalGroup(
            agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(FotoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FC_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(FotoAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
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
                .addComponent(agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public AgregarProductoPanel() {
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
            java.util.logging.Logger.getLogger(AgregarProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProductoPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadStock;
    private javax.swing.JLabel DescripcionProducto;
    private javax.swing.JLabel FC_Date;
    private javax.swing.JLabel FV;
    private javax.swing.JLabel FechaCaducidad;
    private javax.swing.JLabel FechaProduccion;
    private javax.swing.JLabel FotoAgregarProducto;
    private javax.swing.JLabel FotoProducto;
    private javax.swing.JLabel NombreProducto;
    private javax.swing.JLabel StockProducto;
    private javax.swing.JPanel agregarProducto;
    // End of variables declaration//GEN-END:variables
}
