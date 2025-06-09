
package Frontend.Cliente;

import Backend.Controladores.CtrlCliente;
import Backend.Entidades.Cliente;
import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TipoCliente extends javax.swing.JFrame {

    public TipoCliente() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(ConfirmarjLabel, "/img/imagenConfirmar.png");
        /*
        DefaultTableModel dtm = (DefaultTableModel) TipoClientejTable.getModel();

        CtrlCliente ctrlCliente = new CtrlCliente();
        List<Cliente> clientes = ctrlCliente.listar();
        for (int i = 0, j=1; i < clientes.size(); i++,j++) {
            dtm.addRow( new Object[]{
                    j   ,
                    clientes.get(i).getCliente(),
                    clientes.get(i).getIdentificacion(),
                    clientes.get(i).getDepartamento().getTorre(),
                    clientes.get(i).getDepartamento().getDepartamento(),
                    clientes.get(i).getCuenta().getNombre(),
                    clientes.get(i).getCuenta().getApellido(),
                    clientes.get(i).getCuenta().getTelefono()
                    
                    

            });
        }*/
        CasteodeDatosNull();
    }
    
    private void CasteodeDatosNull(){
         DefaultTableModel dtm = (DefaultTableModel) TipoClientejTable.getModel();
        
        CtrlCliente ctrlCliente = new CtrlCliente();
        List<Cliente> clientes = ctrlCliente.listar();
        
        for (int i = 0, j=1; i < clientes.size(); i++,j++) {
                Object cliente = clientes.get(i).getCliente();
                Object identificacion = clientes.get(i).getIdentificacion();
                Object torre = clientes.get(i).getDepartamento().getTorre();
                Object departamento = clientes.get(i).getDepartamento().getDepartamento();
                Object nombre = clientes.get(i).getCuenta().getNombre();
                Object apellido = clientes.get(i).getCuenta().getApellido();
                Object telefono = clientes.get(i).getCuenta().getTelefono();

                cliente = (cliente == null) ? "0" : cliente;
                identificacion = (identificacion == null) ? "0" : identificacion;
                torre = (torre == null) ? "0" : torre;
                departamento = (departamento == null) ? "0" : departamento;
                nombre = (nombre == null) ? "0" : nombre;
                apellido = (apellido == null) ? "0" : apellido;
                telefono = (telefono == null) ? "0" : telefono;

                dtm.addRow( new Object[]{j,cliente, identificacion, torre, departamento, nombre, apellido, telefono});
                
            }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cliente_y_pago = new javax.swing.JPanel();
        TipoClientejScrollPane = new javax.swing.JScrollPane();
        TipoClientejTable = new javax.swing.JTable();
        ClientejLabel = new javax.swing.JLabel();
        ClienteTxT = new javax.swing.JTextField();
        TorrejLabel = new javax.swing.JLabel();
        TorreTxt = new javax.swing.JTextField();
        IdentificacionjLabel = new javax.swing.JLabel();
        IdentificacionTxt = new javax.swing.JTextField();
        ConfirmarjLabel = new javax.swing.JLabel();
        PanelX = new javax.swing.JPanel();
        XJLabel = new javax.swing.JLabel();
        NombrejLabel = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        ApellidojLabel = new javax.swing.JLabel();
        DepartamentojLabel = new javax.swing.JLabel();
        DepartamentoTxt = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JTextField();
        TelefonojLabel = new javax.swing.JLabel();
        TelefonoTxt = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();

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

            },
            new String [] {
                "ID Cliente", "Cliente", "Identificación", "Torre", "Departamento", "Nombre", "Apellido", "Telefono"
            }
        ));
        TipoClientejTable.setToolTipText("");
        TipoClientejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipoClientejTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TipoClientejTableMousePressed(evt);
            }
        });
        TipoClientejScrollPane.setViewportView(TipoClientejTable);

        ClientejLabel.setForeground(new java.awt.Color(0, 0, 0));
        ClientejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientejLabel.setText("Cliente");

        ClienteTxT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TorrejLabel.setForeground(new java.awt.Color(0, 0, 0));
        TorrejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TorrejLabel.setText("Torre");

        TorreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TorreTxt.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TorreTxtComponentAdded(evt);
            }
        });

        IdentificacionjLabel.setForeground(new java.awt.Color(0, 0, 0));
        IdentificacionjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdentificacionjLabel.setText("Identificación");

        IdentificacionTxt.setForeground(new java.awt.Color(0, 0, 0));
        IdentificacionTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        NombrejLabel.setForeground(new java.awt.Color(0, 0, 0));
        NombrejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombrejLabel.setText("Nombre");

        NombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ApellidojLabel.setForeground(new java.awt.Color(0, 0, 0));
        ApellidojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApellidojLabel.setText("Apellido");

        DepartamentojLabel.setForeground(new java.awt.Color(0, 0, 0));
        DepartamentojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DepartamentojLabel.setText("Departamento");

        DepartamentoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DepartamentoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartamentoTxtActionPerformed(evt);
            }
        });

        ApellidoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TelefonojLabel.setForeground(new java.awt.Color(0, 0, 0));
        TelefonojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TelefonojLabel.setText("Télefono");

        TelefonoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Registrar.setText("Registrar");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cliente_y_pagoLayout = new javax.swing.GroupLayout(cliente_y_pago);
        cliente_y_pago.setLayout(cliente_y_pagoLayout);
        cliente_y_pagoLayout.setHorizontalGroup(
            cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                            .addComponent(TipoClientejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(123, 123, 123))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                            .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ConfirmarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                                    .addComponent(ApellidojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(29, 29, 29)
                            .addComponent(TelefonojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(ClienteTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(IdentificacionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(TorrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TorreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DepartamentojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DepartamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cliente_y_pagoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(ClientejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(801, Short.MAX_VALUE))
            .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(NombrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cliente_y_pagoLayout.setVerticalGroup(
            cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cliente_y_pagoLayout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(TipoClientejScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClienteTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TorrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TorreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentificacionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartamentojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(cliente_y_pagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        try {
            TipoClientejTable.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt){
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if(Mouse_evt.getClickCount() == 1){
                    ClienteTxT.setText
                            (TipoClientejTable.getValueAt
                                    (TipoClientejTable.getSelectedRow(),1 ).toString());
                    IdentificacionTxt.setText
                            (TipoClientejTable.getValueAt
                                    (TipoClientejTable.getSelectedRow(), 2).toString());
                    TorreTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 3).toString());
                    DepartamentoTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 4).toString());
                    NombreTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 5).toString());
                    ApellidoTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 6).toString());
                    TelefonoTxt.setText(TipoClientejTable.getValueAt(TipoClientejTable.getSelectedRow(), 7).toString());
                }
            }
        });
        } catch (Exception e) {
            
        }
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
    public static String Cliente, Identificacion, Torre, Departamento, Nombre, Apellido,Telefono;
    private void ConfirmarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarjLabelMouseClicked
        Cliente = ClienteTxT.getText().trim();
        Identificacion = IdentificacionTxt.getText().trim();
        Torre = TorreTxt.getText().trim();
        Departamento = DepartamentoTxt.getText().trim();
        Nombre = NombreTxt.getText().trim();
        Apellido= ApellidoTxt.getText().trim();
        Telefono = TelefonoTxt.getText().trim();


        this.setVisible(false);
                
    }//GEN-LAST:event_ConfirmarjLabelMouseClicked

    private void DepartamentoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartamentoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartamentoTxtActionPerformed

    private void TorreTxtComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TorreTxtComponentAdded
        /*if(TorreTxt.getText() == null){
            TorreTxt.setText("0");
        }*/
    }//GEN-LAST:event_TorreTxtComponentAdded

    private void TipoClientejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoClientejTableMouseClicked
    /*TipoClientejTable.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
            // Detectar si es un clic derecho
            if (e.isPopupTrigger()) {
                int row = TipoClientejTable.rowAtPoint(e.getPoint()); // Obtener fila seleccionada
                if (row >= 0 && row < TipoClientejTable.getRowCount()) {
                    TipoClientejTable.setRowSelectionInterval(row, row); // Seleccionar fila visualmente

                    // Mostrar menú contextual
                    JPopupMenu popupMenu = new JPopupMenu();
                    JMenuItem registrarNuevoCliente = new JMenuItem("Registrar");
                    JMenuItem actualizarItem = new JMenuItem("Actualizar");
                                      
                    registrarNuevoCliente.addActionListener( event -> {
                        Cliente C = new Cliente();
                        Departamento D = new Departamento();
                        Cuenta CU = new Cuenta();
                        
                        RegistrarNuevoCliente RNC = new RegistrarNuevoCliente();
                        RNC.setVisible(true);
                        
                        
                    });
                    
                    popupMenu.add(registrarNuevoCliente);
                    popupMenu.add(actualizarItem);
            }
        }
    }
    });*/
    }//GEN-LAST:event_TipoClientejTableMouseClicked

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        RegistrarNuevoCliente RNC = new RegistrarNuevoCliente();
        RNC.setVisible(true);
        this.setVisible(false);
        RNC.toFront();
    }//GEN-LAST:event_RegistrarMouseClicked

    TableRowSorter TRS;    
    
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
    private javax.swing.JTextField ApellidoTxt;
    private javax.swing.JLabel ApellidojLabel;
    private javax.swing.JTextField ClienteTxT;
    private javax.swing.JLabel ClientejLabel;
    private javax.swing.JLabel ConfirmarjLabel;
    private javax.swing.JTextField DepartamentoTxt;
    private javax.swing.JLabel DepartamentojLabel;
    private javax.swing.JTextField IdentificacionTxt;
    private javax.swing.JLabel IdentificacionjLabel;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel NombrejLabel;
    private javax.swing.JPanel PanelX;
    private javax.swing.JButton Registrar;
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
