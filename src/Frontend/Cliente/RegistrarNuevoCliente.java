
package Frontend.Cliente;

import Frontend.Cliente.TipoCliente;
import Backend.Controladores.CtrlCliente;
import Backend.Entidades.Cliente;
import Backend.Entidades.Cuenta;
import Backend.Entidades.Departamento;
import static Frontend.Producto.RegistrarNuevoProducto.BloquearCaracteres;
import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;
import java.awt.Toolkit;

public class RegistrarNuevoCliente extends javax.swing.JFrame {

    public RegistrarNuevoCliente() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(Confirmar, "/img/imagenConfirmar.png");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel1 = new javax.swing.JPanel();
        ClientejLabel = new javax.swing.JLabel();
        IdentificacionjLabel = new javax.swing.JLabel();
        TorrejLabel = new javax.swing.JLabel();
        DepartamentojLabel = new javax.swing.JLabel();
        NombrejLabel = new javax.swing.JLabel();
        ApellidojLabel = new javax.swing.JLabel();
        TelefonojLabel = new javax.swing.JLabel();
        ClienteTxt = new javax.swing.JTextField();
        tienecuenta = new javax.swing.JLabel();
        SIbutton = new javax.swing.JRadioButton();
        NObutton = new javax.swing.JRadioButton();
        NombreTxt = new javax.swing.JTextField();
        DepartamentoTxt = new javax.swing.JTextField();
        TorreTxt = new javax.swing.JTextField();
        IdentificacionTxt = new javax.swing.JTextField();
        TelefonoTxt = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JTextField();
        PanelX = new javax.swing.JPanel();
        XjLabel1 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ClientejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ClientejLabel.setForeground(new java.awt.Color(0, 0, 0));
        ClientejLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ClientejLabel.setText("Cliente:");

        IdentificacionjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IdentificacionjLabel.setForeground(new java.awt.Color(0, 0, 0));
        IdentificacionjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IdentificacionjLabel.setText("Identtificación");

        TorrejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TorrejLabel.setForeground(new java.awt.Color(0, 0, 0));
        TorrejLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TorrejLabel.setText("Torre");

        DepartamentojLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DepartamentojLabel.setForeground(new java.awt.Color(0, 0, 0));
        DepartamentojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DepartamentojLabel.setText("Departamento");

        NombrejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombrejLabel.setForeground(new java.awt.Color(0, 0, 0));
        NombrejLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NombrejLabel.setText("Nombre");

        ApellidojLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ApellidojLabel.setForeground(new java.awt.Color(0, 0, 0));
        ApellidojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ApellidojLabel.setText("Apellido");

        TelefonojLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TelefonojLabel.setForeground(new java.awt.Color(0, 0, 0));
        TelefonojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TelefonojLabel.setText("Teléfono");

        ClienteTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ClienteTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ClienteTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClienteTxtKeyTyped(evt);
            }
        });

        tienecuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tienecuenta.setForeground(new java.awt.Color(0, 0, 0));
        tienecuenta.setText("Tiene cuenta");

        SIbutton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(SIbutton);
        SIbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SIbutton.setForeground(new java.awt.Color(0, 0, 0));
        SIbutton.setText("Si");
        SIbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIbuttonMouseClicked(evt);
            }
        });
        SIbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIbuttonActionPerformed(evt);
            }
        });

        NObutton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(NObutton);
        NObutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NObutton.setForeground(new java.awt.Color(0, 0, 0));
        NObutton.setSelected(true);
        NObutton.setText("No");
        NObutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NObuttonMouseClicked(evt);
            }
        });

        NombreTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreTxt.setEnabled(false);
        NombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreTxtKeyTyped(evt);
            }
        });

        DepartamentoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DepartamentoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DepartamentoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DepartamentoTxtKeyTyped(evt);
            }
        });

        TorreTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TorreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TorreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TorreTxtKeyTyped(evt);
            }
        });

        IdentificacionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IdentificacionTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IdentificacionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdentificacionTxtKeyTyped(evt);
            }
        });

        TelefonoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TelefonoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TelefonoTxt.setEnabled(false);
        TelefonoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoTxtKeyTyped(evt);
            }
        });

        ApellidoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ApellidoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ApellidoTxt.setEnabled(false);
        ApellidoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoTxtKeyTyped(evt);
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

        XjLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        XjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        XjLabel1.setText("X");
        PanelX.add(XjLabel1, new java.awt.GridBagConstraints());

        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenConfirmar.png"))); // NOI18N
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(ClientejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(IdentificacionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                                .addComponent(TorrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TorreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                                .addComponent(DepartamentojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(DepartamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(tienecuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(SIbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(NObutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelefonojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApellidojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentificacionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TorrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TorreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartamentojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tienecuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIbutton)
                    .addComponent(NObutton))
                .addGap(32, 32, 32)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SIbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIbuttonActionPerformed

    private void ClienteTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClienteTxtKeyTyped
        if(ClienteTxt.getText().length() >= 50){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       } 
    }//GEN-LAST:event_ClienteTxtKeyTyped

    private void IdentificacionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdentificacionTxtKeyTyped
        if(IdentificacionTxt.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       }
    }//GEN-LAST:event_IdentificacionTxtKeyTyped

    private void TorreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TorreTxtKeyTyped
        char caracter = evt.getKeyChar();
        
        if (!Character.isDigit(caracter) || TorreTxt.getText().length() >= 9) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        
    }//GEN-LAST:event_TorreTxtKeyTyped

    private void DepartamentoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepartamentoTxtKeyTyped
        char caracter = evt.getKeyChar();
        
        if (!Character.isDigit(caracter) || DepartamentoTxt.getText().length() >= 9) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_DepartamentoTxtKeyTyped

    private void NombreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTxtKeyTyped
        if(NombreTxt.getText().length() >= 20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       }
    }//GEN-LAST:event_NombreTxtKeyTyped

    private void ApellidoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoTxtKeyTyped
        if(ApellidoTxt.getText().length() >= 20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       }
    }//GEN-LAST:event_ApellidoTxtKeyTyped

    private void TelefonoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoTxtKeyTyped
       char caracter = evt.getKeyChar();
        
        if (!Character.isDigit(caracter) || TelefonoTxt.getText().length() >= 9) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_TelefonoTxtKeyTyped

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    private void SIbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIbuttonMouseClicked
        
            NombreTxt.setEnabled(true);
            ApellidoTxt.setEnabled(true);
            TelefonoTxt.setEnabled(true);
        
    }//GEN-LAST:event_SIbuttonMouseClicked

    private void NObuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NObuttonMouseClicked
        
            NombreTxt.setEnabled(false);
            ApellidoTxt.setEnabled(false);
            TelefonoTxt.setEnabled(false);
            NombreTxt.setText(null);
            ApellidoTxt.setText(null);
            TelefonoTxt.setText(null);
    }//GEN-LAST:event_NObuttonMouseClicked

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        try{
            
            CtrlCliente CC = new CtrlCliente();
        
        Cliente CL = new Cliente();
        Departamento D = new Departamento();
        Cuenta CU = new Cuenta();
        
        String cliente = ClienteTxt.getText().trim();
        String identificacion = IdentificacionTxt.getText().trim();
        String torre = TorreTxt.getText().trim();
        String departamento = DepartamentoTxt.getText().trim();
        String nombre = NombreTxt.getText().trim();
        String apellido = ApellidoTxt.getText().trim();
        String telefono = TelefonoTxt.getText().trim();

        /*cliente = (cliente == null)? null : cliente;
        identificacion = (identificacion == null)? null : identificacion;
        torre = (torre == null)? null : torre;
        departamento = (departamento == null)? null : departamento;        
        nombre = (nombre == null)? null : nombre;        
        apellido = (apellido == null)? null : apellido;        
        telefono = (telefono == null)? null : telefono;*/
            if (!cliente.isEmpty() & !identificacion.isEmpty()){
                CL.setCliente(cliente);
                CL.setIdentificacion(identificacion);
                System.out.println(cliente);
            }if (!torre.isEmpty() & !departamento.isEmpty()){
                D.setTorre(Short.parseShort(torre));
                D.setDepartamento(Short.parseShort(departamento));

                CL.setDepartamento(D);
                System.out.println(torre);
            }if(!nombre.isEmpty() & !apellido.isEmpty()){
                CU.setNombre(nombre);
                CU.setApellido(apellido);
                CU.setTelefono(Integer.parseInt(telefono));

                CL.setCuenta(CU);
                System.out.println(nombre);
            }
            System.out.println(CL);
            CC.registrar(CL);
        
        TipoCliente TC = new TipoCliente();
        TC.setVisible(true);
        this.setVisible(false);
        TC.toFront();
            
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ConfirmarMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarNuevoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTxt;
    private javax.swing.JLabel ApellidojLabel;
    private javax.swing.JTextField ClienteTxt;
    private javax.swing.JLabel ClientejLabel;
    private javax.swing.JLabel Confirmar;
    private javax.swing.JTextField DepartamentoTxt;
    private javax.swing.JLabel DepartamentojLabel;
    private javax.swing.JTextField IdentificacionTxt;
    private javax.swing.JLabel IdentificacionjLabel;
    private javax.swing.JRadioButton NObutton;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel NombrejLabel;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel PanelX;
    private javax.swing.JRadioButton SIbutton;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JLabel TelefonojLabel;
    private javax.swing.JTextField TorreTxt;
    private javax.swing.JLabel TorrejLabel;
    private javax.swing.JLabel XjLabel1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel tienecuenta;
    // End of variables declaration//GEN-END:variables
}
