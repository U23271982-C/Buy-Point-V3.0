
package Frontend.Categoria;

import Backend.Controladores.CtrlCategoriaProducto;
import Backend.Entidades.CategoriaProducto;
import Frontend.visualFramework.Formato_Imagen;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegistrarNuevaCategoria extends javax.swing.JFrame {

    public RegistrarNuevaCategoria() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(Confirmar, "/img/imagenConfirmar.png");
        FI.tamañoimagen(Actualizar, "/img/iconoActualizacion.jpg");
        FI.tamañoimagen(Eliminar, "/img/imagenbasura.png");
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        NuevaCategoriajLabel = new javax.swing.JLabel();
        NuevaCategoriaTxt = new javax.swing.JTextField();
        PanelX = new javax.swing.JPanel();
        XjLabel = new javax.swing.JLabel();
        Confirmar = new javax.swing.JLabel();
        Actualizar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NuevaCategoriajLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NuevaCategoriajLabel.setForeground(new java.awt.Color(0, 0, 0));
        NuevaCategoriajLabel.setText("Nombre Categoria");

        NuevaCategoriaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NuevaCategoriaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NuevaCategoriaTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NuevaCategoriaTxtKeyTyped(evt);
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

        XjLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        XjLabel.setForeground(new java.awt.Color(30, 30, 30));
        XjLabel.setText("X");
        PanelX.add(XjLabel, new java.awt.GridBagConstraints());

        Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenConfirmar.png"))); // NOI18N
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });

        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoActualizacion.jpg"))); // NOI18N
        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMouseClicked(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenbasura.png"))); // NOI18N
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(NuevaCategoriajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(NuevaCategoriaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaCategoriajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaCategoriaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaCategoriaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NuevaCategoriaTxtKeyTyped
        if(NuevaCategoriaTxt.getText().length() >= 20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();    
       }
    }//GEN-LAST:event_NuevaCategoriaTxtKeyTyped

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.RED);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        ConfirmacionCategoria();
        
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void ConfirmacionCategoria(){
        try {
            CtrlCategoriaProducto CCP = new CtrlCategoriaProducto();
            CategoriaProducto CP = null;
        
            String nombreCategoria = NuevaCategoriaTxt.getText().trim();
          
            //Conversion del primer caracte a mayúscula y el resto en minpuscula
            nombreCategoria = nombreCategoria.substring(0, 1).toUpperCase() 
                        + nombreCategoria.substring(1).toLowerCase();

            CP = CategoriaProducto.builder()
                    .nombre(nombreCategoria)
                    .build();
            
            //System.out.println(nombreCategoria);
            boolean existe = false;
            ArrayList<CategoriaProducto> opciones = CCP.listar();
            for (CategoriaProducto listar : opciones) {
                if(listar.getNombre().trim().equals(nombreCategoria)){
                   existe = true;
                   break;
                }
            }
            System.out.println(existe);
            if(!existe){
                CCP.registrar(CP);
                JOptionPane.showMessageDialog(null, "Se registro correctamente");
                NuevaCategoriaTxt.setText("");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Categoria ya existente");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    private void ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseClicked
        ActualizarCaategoria AC = new ActualizarCaategoria();
        AC.setVisible(true);
        this.setVisible(false);
        AC.toFront();
        

        
    }//GEN-LAST:event_ActualizarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        EliminarCategoria EC = new EliminarCategoria();
        EC.setVisible(true);
        this.setVisible(false);
        EC.toFront();
        

    }//GEN-LAST:event_EliminarMouseClicked

    private void NuevaCategoriaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NuevaCategoriaTxtKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            ConfirmacionCategoria();
        }
    }//GEN-LAST:event_NuevaCategoriaTxtKeyPressed

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
            java.util.logging.Logger.getLogger(RegistrarNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarNuevaCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualizar;
    private javax.swing.JLabel Confirmar;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JTextField NuevaCategoriaTxt;
    private javax.swing.JLabel NuevaCategoriajLabel;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel XjLabel;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
