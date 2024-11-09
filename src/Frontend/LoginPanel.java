
package Frontend;

import Backend.Entidades.Controlador;
import Backend.Entidades.CredencialesUsuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public final class LoginPanel extends javax.swing.JFrame {
    //Formato_Imagen escalas = new Formato_Imagen();
    
    public LoginPanel() {
       initComponents();
       setLocationRelativeTo(null);
       //escalas.escalarLaber(user, "/img/login.png");
       this.tamañoimagen(user, "/img/login.png");
    }
    
    public void tamañoimagen(JLabel label, String ruta){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta)). getImage()
        .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH))); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JPasswordField();
        UserBarra = new javax.swing.JSeparator();
        PasswordBarra = new javax.swing.JSeparator();
        Encabezado = new javax.swing.JPanel();
        PanelX = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        EntrarPanel = new javax.swing.JPanel();
        EntrarJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(126, 123, 123));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("Login"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(844, 500));
        setResizable(false);

        Login.setBackground(new java.awt.Color(126, 123, 123));

        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        UserTxt.setBackground(new java.awt.Color(126, 123, 123));
        UserTxt.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        UserTxt.setForeground(new java.awt.Color(255, 255, 255));
        UserTxt.setText("USERNAME");
        UserTxt.setBorder(null);
        UserTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserTxtMousePressed(evt);
            }
        });
        UserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTxtActionPerformed(evt);
            }
        });
        UserTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserTxtKeyPressed(evt);
            }
        });

        PasswordTxt.setBackground(new java.awt.Color(126, 123, 123));
        PasswordTxt.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        PasswordTxt.setForeground(new java.awt.Color(255, 255, 255));
        PasswordTxt.setText("********");
        PasswordTxt.setBorder(null);
        PasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordTxtMousePressed(evt);
            }
        });
        PasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTxtActionPerformed(evt);
            }
        });
        PasswordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTxtKeyPressed(evt);
            }
        });

        UserBarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserBarraKeyPressed(evt);
            }
        });

        Encabezado.setBackground(new java.awt.Color(126, 123, 123));
        Encabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EncabezadoMouseDragged(evt);
            }
        });
        Encabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EncabezadoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        PanelX.setBackground(new java.awt.Color(126, 123, 123));
        PanelX.setPreferredSize(new java.awt.Dimension(36, 36));

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setPreferredSize(new java.awt.Dimension(35, 35));
        Exit.setRequestFocusEnabled(false);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelXLayout = new javax.swing.GroupLayout(PanelX);
        PanelX.setLayout(PanelXLayout);
        PanelXLayout.setHorizontalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelXLayout.setVerticalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EntrarPanel.setBackground(new java.awt.Color(126, 123, 123));
        EntrarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarPanelMouseExited(evt);
            }
        });

        EntrarJLabel.setBackground(new java.awt.Color(153, 153, 153));
        EntrarJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EntrarJLabel.setForeground(new java.awt.Color(255, 255, 255));
        EntrarJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntrarJLabel.setText("Iniciar sesión");

        javax.swing.GroupLayout EntrarPanelLayout = new javax.swing.GroupLayout(EntrarPanel);
        EntrarPanel.setLayout(EntrarPanelLayout);
        EntrarPanelLayout.setHorizontalGroup(
            EntrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EntrarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EntrarJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        EntrarPanelLayout.setVerticalGroup(
            EntrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EntrarPanelLayout.createSequentialGroup()
                .addComponent(EntrarJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EntrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LoginLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UserBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PasswordBarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 287, Short.MAX_VALUE))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EntrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTxtActionPerformed

    private void PasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTxtActionPerformed
    
    
    //region Movimiento de Window
    int xMouse, yMouse;
    private void EncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_EncabezadoMousePressed

    private void EncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y -yMouse);
    }//GEN-LAST:event_EncabezadoMouseDragged
    //endregion
    
//parte    
    private void ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMousePressed
    
    }//GEN-LAST:event_ExitMousePressed
//inutil
    
   //cierre del software
    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked
    //end
    
    //color Window X
    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        PanelX.setBackground(Color.red);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        PanelX.setBackground(new Color(126, 123, 123));
    }//GEN-LAST:event_ExitMouseExited
    //end
    
    private void UserTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxtMousePressed
        if(UserTxt.getText().equals("USERNAME")){
        UserTxt.setText("");
        UserTxt.setForeground(Color.WHITE);
        }
        if(String.valueOf(PasswordTxt.getPassword()).isEmpty()){
            PasswordTxt.setText("********");
            PasswordTxt.setForeground(Color.WHITE);
        }
        
    }//GEN-LAST:event_UserTxtMousePressed
    
    private void PasswordTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTxtMousePressed
        if(String.valueOf(PasswordTxt.getPassword()).equals("********")){
        PasswordTxt.setText("");
        PasswordTxt.setForeground(Color.WHITE);
        }
        if(UserTxt.getText().isEmpty()){
        UserTxt.setText("USERNAME");
        UserTxt.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_PasswordTxtMousePressed
    
    private void EntrarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarPanelMouseClicked
        //MenuPrincipalPanel mn = new MenuPrincipalPanel();
        //mn.setVisible(true); //entra al menu principal
        //this.setVisible(false); //desaparece la ventana login
        //mn.toFront();
        
        this.inicionLogin();
    }//GEN-LAST:event_EntrarPanelMouseClicked

    private void EntrarPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarPanelMouseEntered
        EntrarPanel.setBackground(Color.WHITE);
        EntrarJLabel.setForeground(Color.GRAY);
        
    }//GEN-LAST:event_EntrarPanelMouseEntered

    private void EntrarPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarPanelMouseExited
        EntrarPanel.setBackground(new Color(126, 123, 123));
        EntrarJLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_EntrarPanelMouseExited
    
    //parte inutil
    private void UserBarraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserBarraKeyPressed
                    
    }//GEN-LAST:event_UserBarraKeyPressed
    //end
    
    private void UserTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserTxtKeyPressed
        UserTxt.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("TAB"), "tabPressed");
        UserTxt.getActionMap().put("tabPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar el campo de contraseña cuando se presiona Tab
                PasswordTxt.setText("");
                
            }
        });
    }//GEN-LAST:event_UserTxtKeyPressed

    private void PasswordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTxtKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.inicionLogin();
        }
    }//GEN-LAST:event_PasswordTxtKeyPressed
   
    public void inicionLogin(){
        if(!UserTxt.getText().isEmpty() && !PasswordTxt.getText().isEmpty()){
            Controlador cs = new Controlador();
            CredencialesUsuario CU =  new CredencialesUsuario();
            CU.setUsuario(UserTxt.getText().trim());
            CU.setContrasenna(PasswordTxt.getText().trim());
          if(cs.iniciarSesion(CU)){
            MenuPrincipalPanel mn = new MenuPrincipalPanel();
            mn.setVisible(true); //entra al menu principal
            this.setVisible(false); //desaparece la ventana login
            mn.toFront();
          } else {
              JOptionPane.showConfirmDialog(null, "Usuario o contraseña incorrectos");
            }
        } 
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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel EntrarJLabel;
    private javax.swing.JPanel EntrarPanel;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel PanelX;
    private javax.swing.JSeparator PasswordBarra;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JSeparator UserBarra;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables


}
