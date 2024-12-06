
package Frontend;

import Backend.Controladores.CtrlCliente;
import Backend.Entidades.Cliente;
import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipoCliente extends javax.swing.JFrame {

    public TipoCliente() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(ConfirmarjLabel, "/img/imagenConfirmar.png");
        DefaultTableModel dtm = (DefaultTableModel) TipoClientejTable.getModel();
        /*dtm.addColumn("Cliente");
        dtm.addColumn("Identificacion");
        dtm.addColumn("Torre");
        dtm.addColumn("Departamento");
        dtm.addColumn("Nombre (Cuenta)");
        dtm.addColumn("Apellido (Cuenta)");
        dtm.addColumn("Teléfono (Cuenta)");*/
        CtrlCliente ctrlCliente = new CtrlCliente();
        List<Cliente> clientes = ctrlCliente.listar();
        for (int i = 0; i < clientes.size(); i++) {
            dtm.addRow( new Object[]{
                    clientes.get(i).getCliente(),
                    clientes.get(i).getIdentificacion(),
                    clientes.get(i).getDepartamento().getTorre(),
                    clientes.get(i).getDepartamento().getDepartamento(),
                    clientes.get(i).getCuenta().getNombre(),
                    clientes.get(i).getCuenta().getApellido(),
                    clientes.get(i).getCuenta().getTelefono()
            });
        }
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
        NombrejLabel = new javax.swing.JLabel();
        NombreTxT = new javax.swing.JTextField();
        DepartamentojLabel = new javax.swing.JLabel();
        DepartamentojTextField = new javax.swing.JTextField();
        TorrejLabel = new javax.swing.JLabel();
        TorreTxt = new javax.swing.JTextField();
        ConfirmarjLabel = new javax.swing.JLabel();
        PanelX = new javax.swing.JPanel();
        XJLabel = new javax.swing.JLabel();
        CuentajLabel = new javax.swing.JLabel();
        CuentaTxt = new javax.swing.JTextField();
        IdentificacionjLabel = new javax.swing.JLabel();
        TelefonojLabel = new javax.swing.JLabel();
        TelefonoTxt = new javax.swing.JTextField();
        IdentificacionTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        cliente_y_pago.setBackground(new java.awt.Color(255, 255, 255));
        cliente_y_pago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TipoClientejScrollPane.setForeground(new java.awt.Color(204, 204, 204));
        TipoClientejScrollPane.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TipoClientejTable.setBackground(new java.awt.Color(255, 255, 255));
        TipoClientejTable.setForeground(new java.awt.Color(0, 0, 0));
        TipoClientejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Daniel", "10", "203", "No", "No", "987456123"},
                {"2", "Gustavo", "20", "103", "Si", "No", "123456789"},
                {"3", "Nicolas", "14", "502", "No", "No", "985612473"},
                {"4", "Dylan", "2", "404", "Si", "No", "912748536"},
                {"5", "Ash", "4", null, "Si", "No", "945376128"},
                {"6", "Ford", "17", "801", "No", "No", "936478512"}
            },
            new String [] {
                "Cliente", "Nombre", "Torre", "Departamento", "Cuenta", "Identificación", "Telefono"
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

        ConfirmarjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenConfirmar.png"))); // NOI18N
        ConfirmarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarjLabelMouseClicked(evt);
            }
        });

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

        XJLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        XJLabel.setForeground(new java.awt.Color(0, 0, 0));
        XJLabel.setText("X");
        PanelX.add(XJLabel, new java.awt.GridBagConstraints());

        CuentajLabel.setForeground(new java.awt.Color(0, 0, 0));
        CuentajLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CuentajLabel.setText("Cuenta");

        CuentaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        IdentificacionjLabel.setForeground(new java.awt.Color(0, 0, 0));
        IdentificacionjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdentificacionjLabel.setText("Identificación");

        TelefonojLabel.setForeground(new java.awt.Color(0, 0, 0));
        TelefonojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TelefonojLabel.setText("Télefono");

        IdentificacionTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout cliente_y_pagoLayout = new javax.swing.GroupLayout(cliente_y_pago);
        cliente_y_pago.setLayout(cliente_y_pagoLayout);
        cliente_y_pagoLayout.setHorizontalGroup(
            cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TipoClientejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                        .addComponent(BuscarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)
                        .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                        .addComponent(ConfirmarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(370, 370, 370))))
            .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombrejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(TelefonojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombreTxT)
                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TorrejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(CuentajLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CuentaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(TorreTxt))
                .addGap(57, 57, 57)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DepartamentojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(IdentificacionjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DepartamentojTextField)
                    .addComponent(IdentificacionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cliente_y_pagoLayout.setVerticalGroup(
            cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TipoClientejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartamentojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TorrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TorreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuentajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentificacionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(ConfirmarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
                    CuentaTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 4).toString());
                    IdentificacionTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 5).toString());
                    TelefonoTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 6).toString());
                }
            }
        });
    }//GEN-LAST:event_TipoClientejTableMousePressed

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited
    public static String Nombre,Torre,Departamento,Telefono, Cuenta, Identificacion;
    private void ConfirmarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarjLabelMouseClicked
        Nombre = NombreTxT.getText().trim();
        Torre = TorreTxt.getText().trim();
        Departamento = DepartamentojTextField.getText().trim();
        Telefono = TelefonoTxt.getText().trim();
        Cuenta = CuentaTxt.getText().trim();
        Identificacion = IdentificacionTxt.getText().trim();
        this.setVisible(false);
                
    }//GEN-LAST:event_ConfirmarjLabelMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(TipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TipoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarjLabel;
    private javax.swing.JTextField BuscarjTextField;
    private javax.swing.JLabel ConfirmarjLabel;
    private javax.swing.JTextField CuentaTxt;
    private javax.swing.JLabel CuentajLabel;
    private javax.swing.JLabel DepartamentojLabel;
    private javax.swing.JTextField DepartamentojTextField;
    private javax.swing.JTextField IdentificacionTxt;
    private javax.swing.JLabel IdentificacionjLabel;
    private javax.swing.JTextField NombreTxT;
    private javax.swing.JLabel NombrejLabel;
    private javax.swing.JPanel PanelX;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JLabel TelefonojLabel;
    private javax.swing.JScrollPane TipoClientejScrollPane;
    private javax.swing.JTable TipoClientejTable;
    private javax.swing.JTextField TorreTxt;
    private javax.swing.JLabel TorrejLabel;
    private javax.swing.JLabel XJLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cliente_y_pago;
    // End of variables declaration//GEN-END:variables
}
