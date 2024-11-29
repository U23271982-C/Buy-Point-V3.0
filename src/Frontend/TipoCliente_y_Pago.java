
package Frontend;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class TipoCliente_y_Pago extends javax.swing.JFrame {

    public TipoCliente_y_Pago() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cliente_y_pago = new javax.swing.JPanel();
        TipoClientejScrollPane = new javax.swing.JScrollPane();
        TipoClientejTable = new javax.swing.JTable();
        BuscarjLabel = new javax.swing.JLabel();
        BuscarjTextField = new javax.swing.JTextField();
        TipoPagoPanel = new javax.swing.JPanel();
        TipoPagojLabel = new javax.swing.JLabel();
        TarjetaRadioButton4 = new javax.swing.JRadioButton();
        PlinRadioButton3 = new javax.swing.JRadioButton();
        EfectivoRadioButton = new javax.swing.JRadioButton();
        YapeRadioButton2 = new javax.swing.JRadioButton();
        NombrejLabel = new javax.swing.JLabel();
        NombreTxT = new javax.swing.JTextField();
        DepartamentojLabel = new javax.swing.JLabel();
        DepartamentojTextField = new javax.swing.JTextField();
        TorrejLabel = new javax.swing.JLabel();
        TorreTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cliente_y_pago.setBackground(new java.awt.Color(255, 255, 255));

        TipoClientejTable.setBackground(new java.awt.Color(102, 102, 102));
        TipoClientejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "10", "203", "No", "No", "987456123"},
                {"2", "20", "103", "SI", "No", "123456789"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Torre", "Departamento", "Cuenta", "Identificación", "Telefono"
            }
        ));
        TipoClientejTable.setToolTipText("");
        TipoClientejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TipoClientejTableMousePressed(evt);
            }
        });
        TipoClientejScrollPane.setViewportView(TipoClientejTable);

        BuscarjLabel.setForeground(new java.awt.Color(0, 0, 0));
        BuscarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuscarjLabel.setText("Buscar");

        TipoPagoPanel.setBackground(new java.awt.Color(255, 255, 255));
        TipoPagoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TipoPagojLabel.setForeground(new java.awt.Color(0, 0, 0));
        TipoPagojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TipoPagojLabel.setText("Tipo de Pago");

        buttonGroup1.add(TarjetaRadioButton4);
        TarjetaRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        TarjetaRadioButton4.setText("Tarjeta");

        buttonGroup1.add(PlinRadioButton3);
        PlinRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        PlinRadioButton3.setText("Plin");

        buttonGroup1.add(EfectivoRadioButton);
        EfectivoRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        EfectivoRadioButton.setText("Efectivo");

        buttonGroup1.add(YapeRadioButton2);
        YapeRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        YapeRadioButton2.setText("Yape");
        YapeRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YapeRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TipoPagoPanelLayout = new javax.swing.GroupLayout(TipoPagoPanel);
        TipoPagoPanel.setLayout(TipoPagoPanelLayout);
        TipoPagoPanelLayout.setHorizontalGroup(
            TipoPagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoPagoPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TipoPagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TipoPagojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TipoPagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TarjetaRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlinRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EfectivoRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(YapeRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        TipoPagoPanelLayout.setVerticalGroup(
            TipoPagoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoPagoPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TipoPagojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(TarjetaRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(PlinRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(EfectivoRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(YapeRadioButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        NombrejLabel.setForeground(new java.awt.Color(0, 0, 0));
        NombrejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombrejLabel.setText("Nombre");

        NombreTxT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DepartamentojLabel.setForeground(new java.awt.Color(0, 0, 0));
        DepartamentojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DepartamentojLabel.setText("Departamento");

        TorrejLabel.setForeground(new java.awt.Color(0, 0, 0));
        TorrejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TorrejLabel.setText("Torre");

        TorreTxt.setForeground(new java.awt.Color(0, 0, 0));
        TorreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout cliente_y_pagoLayout = new javax.swing.GroupLayout(cliente_y_pago);
        cliente_y_pago.setLayout(cliente_y_pagoLayout);
        cliente_y_pagoLayout.setHorizontalGroup(
            cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(TipoClientejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(BuscarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(NombrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TorrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(TorreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DepartamentojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DepartamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoPagoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        cliente_y_pagoLayout.setVerticalGroup(
            cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TipoClientejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(TipoPagoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TorrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NombrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DepartamentojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DepartamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TorreTxt))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cliente_y_pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cliente_y_pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YapeRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YapeRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YapeRadioButton2ActionPerformed

    private void TipoClientejTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoClientejTableMousePressed
        TipoClientejTable.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt){
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if(Mouse_evt.getClickCount() == 1){
                    NombreTxT.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 1).toString());
                    TorreTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 2).toString());
                    DepartamentojTextField.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 3).toString());
                                    }
            }
        });
    }//GEN-LAST:event_TipoClientejTableMousePressed

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
            java.util.logging.Logger.getLogger(TipoCliente_y_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoCliente_y_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoCliente_y_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoCliente_y_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoCliente_y_Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarjLabel;
    private javax.swing.JTextField BuscarjTextField;
    private javax.swing.JLabel DepartamentojLabel;
    private javax.swing.JTextField DepartamentojTextField;
    private javax.swing.JRadioButton EfectivoRadioButton;
    private javax.swing.JTextField NombreTxT;
    private javax.swing.JLabel NombrejLabel;
    private javax.swing.JRadioButton PlinRadioButton3;
    private javax.swing.JRadioButton TarjetaRadioButton4;
    private javax.swing.JScrollPane TipoClientejScrollPane;
    private javax.swing.JTable TipoClientejTable;
    private javax.swing.JPanel TipoPagoPanel;
    private javax.swing.JLabel TipoPagojLabel;
    private javax.swing.JTextField TorreTxt;
    private javax.swing.JLabel TorrejLabel;
    private javax.swing.JRadioButton YapeRadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cliente_y_pago;
    // End of variables declaration//GEN-END:variables
}
