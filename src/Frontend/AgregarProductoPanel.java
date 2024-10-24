package Frontend;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class AgregarProductoPanel extends javax.swing.JFrame {
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        PanelX = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        PanelMax = new javax.swing.JPanel();
        Maximizar = new javax.swing.JLabel();
        PanelMini = new javax.swing.JPanel();
        Minimizar = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MenuPrincipal.setName("MenuPrincipal"); // NOI18N
        MenuPrincipal.setPreferredSize(new java.awt.Dimension(1176, 486));

        Encabezado.setBackground(new java.awt.Color(255, 255, 255));
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

        PanelX.setBackground(new java.awt.Color(255, 255, 255));
        PanelX.setPreferredSize(new java.awt.Dimension(36, 36));
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

        X.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");

        javax.swing.GroupLayout PanelXLayout = new javax.swing.GroupLayout(PanelX);
        PanelX.setLayout(PanelXLayout);
        PanelXLayout.setHorizontalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelXLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelXLayout.setVerticalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelMax.setBackground(new java.awt.Color(255, 255, 255));
        PanelMax.setPreferredSize(new java.awt.Dimension(36, 36));
        PanelMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMaxMouseExited(evt);
            }
        });

        Maximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maximizar.setLabelFor(PanelMax);
        Maximizar.setToolTipText("");
        Maximizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Maximizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Maximizar.setPreferredSize(new java.awt.Dimension(12, 12));

        javax.swing.GroupLayout PanelMaxLayout = new javax.swing.GroupLayout(PanelMax);
        PanelMax.setLayout(PanelMaxLayout);
        PanelMaxLayout.setHorizontalGroup(
            PanelMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMaxLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Maximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelMaxLayout.setVerticalGroup(
            PanelMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Maximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelMini.setBackground(new java.awt.Color(255, 255, 255));
        PanelMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMiniMouseExited(evt);
            }
        });

        Minimizar.setForeground(new java.awt.Color(0, 0, 0));
        Minimizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout PanelMiniLayout = new javax.swing.GroupLayout(PanelMini);
        PanelMini.setLayout(PanelMiniLayout);
        PanelMiniLayout.setHorizontalGroup(
            PanelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMiniLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelMiniLayout.setVerticalGroup(
            PanelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMiniLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap(575, Short.MAX_VALUE)
                .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuPrincipalLayout = new javax.swing.GroupLayout(MenuPrincipal);
        MenuPrincipal.setLayout(MenuPrincipalLayout);
        MenuPrincipalLayout.setHorizontalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuPrincipalLayout.setVerticalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //region Movimiento de Windo
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
    
    
    private void PanelXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseEntered
        PanelX.setBackground(Color.red);
    }//GEN-LAST:event_PanelXMouseEntered

    private void PanelXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseExited
        PanelX.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelXMouseExited

    private void PanelXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelXMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelXMouseClicked

    private void PanelMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseEntered
        PanelMax.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_PanelMaxMouseEntered

    private void PanelMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseExited
        PanelMax.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelMaxMouseExited

    private void PanelMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMiniMouseEntered
        PanelMini.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_PanelMiniMouseEntered

    private void PanelMiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMiniMouseExited
        PanelMini.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelMiniMouseExited
    
    public AgregarProductoPanel(){
       initComponents();
       setLocationRelativeTo(null);
    }
    
    public void tamañoimagen(JLabel label, String ruta){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta)). getImage()
        .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH))); 
    }

    
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProductoPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel Maximizar;
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JSeparator Minimizar;
    private javax.swing.JPanel PanelMax;
    private javax.swing.JPanel PanelMini;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel X;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
