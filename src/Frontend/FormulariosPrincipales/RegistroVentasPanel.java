package Frontend.FormulariosPrincipales;

import Frontend.visualFramework.Animaciones;
import Backend.Controladores.CtrlProducto;
import Backend.Gestores.GestorGraficadorEstadisticas;
import Frontend.visualFramework.Formato_Imagen;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;

import org.jfree.chart.ChartPanel;

public final class RegistroVentasPanel extends javax.swing.JFrame implements Animaciones{
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        registro_ventas = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        PanelX = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        PanelMax = new javax.swing.JPanel();
        Maximizar = new javax.swing.JLabel();
        PanelMini = new javax.swing.JPanel();
        Minimizar = new javax.swing.JSeparator();
        iconoUsuario = new javax.swing.JLabel();
        jComboBoxGaficos = new javax.swing.JComboBox<>();
        PanelOp = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        Inventario = new javax.swing.JLabel();
        Venta = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        RegistroVentas = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        registro_ventas.setBackground(new java.awt.Color(255, 255, 255));
        registro_ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registro_ventas.setName("registro_ventas"); // NOI18N
        registro_ventas.setPreferredSize(new java.awt.Dimension(1176, 486));
        registro_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registro_ventasMouseEntered(evt);
            }
        });

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
        PanelX.setLayout(new java.awt.GridBagLayout());

        X.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        X.setForeground(new java.awt.Color(0, 0, 0));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        PanelX.add(X, new java.awt.GridBagConstraints());

        PanelMax.setBackground(new java.awt.Color(255, 255, 255));
        PanelMax.setPreferredSize(new java.awt.Dimension(36, 36));
        PanelMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMaxMouseExited(evt);
            }
        });
        PanelMax.setLayout(new java.awt.GridBagLayout());

        Maximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maximizar.setLabelFor(PanelMax);
        Maximizar.setToolTipText("");
        Maximizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Maximizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Maximizar.setPreferredSize(new java.awt.Dimension(12, 12));
        Maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaximizarMouseExited(evt);
            }
        });
        PanelMax.add(Maximizar, new java.awt.GridBagConstraints());

        PanelMini.setBackground(new java.awt.Color(255, 255, 255));
        PanelMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelMiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMiniMouseExited(evt);
            }
        });
        PanelMini.setLayout(new java.awt.GridBagLayout());

        Minimizar.setForeground(new java.awt.Color(0, 0, 0));
        Minimizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 6);
        PanelMini.add(Minimizar, gridBagConstraints);

        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usermenu.png"))); // NOI18N
        iconoUsuario.setPreferredSize(new java.awt.Dimension(100, 158));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                        .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                        .addComponent(jComboBoxGaficos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(470, 470, 470)
                        .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxGaficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(PanelMini, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOp.setBackground(new java.awt.Color(255, 255, 255));
        PanelOp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelOpMouseEntered(evt);
            }
        });
        PanelOp.setLayout(new java.awt.GridBagLayout());

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelOpciones.setPreferredSize(new java.awt.Dimension(1000, 1));

        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.png"))); // NOI18N
        Inventario.setText("jLabel1");
        Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioMouseClicked(evt);
            }
        });

        Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        Venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentaMouseClicked(evt);
            }
        });

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        Menu.setText("jLabel2");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });

        RegistroVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registroventas.png"))); // NOI18N
        RegistroVentas.setText("jLabel3");
        RegistroVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroVentasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(RegistroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RegistroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelOp.add(panelOpciones, new java.awt.GridBagConstraints());

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(621, 420));
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout registro_ventasLayout = new javax.swing.GroupLayout(registro_ventas);
        registro_ventas.setLayout(registro_ventasLayout);
        registro_ventasLayout.setHorizontalGroup(
            registro_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelOp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registro_ventasLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        registro_ventasLayout.setVerticalGroup(
            registro_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro_ventasLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(PanelOp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registro_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registro_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
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
        System.exit(0);
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

    private void InventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioMouseClicked
        InventarioPanel IV = new InventarioPanel();
        IV.setVisible(true);
        this.setVisible(false);
        IV.toFront();
    }//GEN-LAST:event_InventarioMouseClicked

    private void VentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentaMouseClicked
        VentaPanel V = new VentaPanel();
        V.setVisible(true);
        this.setVisible(false);
        V.toFront();
    }//GEN-LAST:event_VentaMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        MenuPrincipalPanel MP = new MenuPrincipalPanel();
        MP.setVisible(true);
        this.setVisible(false);
        MP.toFront();
    }//GEN-LAST:event_MenuMouseClicked

    private void RegistroVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroVentasMouseClicked
        RegistroVentasPanel RV = new RegistroVentasPanel();
        RV.setVisible(true);
        this.setVisible(false);
        RV.toFront();
    }//GEN-LAST:event_RegistroVentasMouseClicked

    private void PanelMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseClicked
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_PanelMaxMouseClicked

    private void PanelMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMiniMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_PanelMiniMouseClicked

    private void MaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseClicked
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_MaximizarMouseClicked

    private void MaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseEntered
        PanelMax.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_MaximizarMouseEntered

    private void MaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseExited
        PanelMax.setBackground(Color.WHITE);
    }//GEN-LAST:event_MaximizarMouseExited

    private void PanelOpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelOpMouseEntered
        Animaciones.Agranda(panelOpciones, 1, 2, 62);
    }//GEN-LAST:event_PanelOpMouseEntered

    private void registro_ventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registro_ventasMouseEntered
        Animaciones.Disminuye(panelOpciones, 1, 2, 0);
    }//GEN-LAST:event_registro_ventasMouseEntered
    
    public RegistroVentasPanel(){
       initComponents();
       setLocationRelativeTo(null);
       Formato_Imagen FI = new Formato_Imagen();
       FI.tamañoimagen(iconoUsuario, "/img/usermenu.png");
       FI.tamañoimagen(Inventario, "/img/inventario.png");
       FI.tamañoimagen(Menu, "/img/menu.png");
       FI.tamañoimagen(Venta, "/img/venta.png");
       FI.tamañoimagen(RegistroVentas, "/img/registroventas.png");
       
       JPanel panel = new JPanel();
        panel.setSize(750,600);
       
       CtrlProducto ctrlProducto = new CtrlProducto();
        List<String> listaNombre = ctrlProducto.listar()
                .stream().map(p -> p.getNombreProducto()).toList();

        /*HashMap<Integer, List<Integer>> tiposGraficos = new HashMap<>(

        );
        List<Integer> stockProducto = ctrlProducto.listar()
                .stream().map(p -> p.getInventario().getStock()).toList();
        List<Integer> salidaProducto = ctrlProducto.listar()
                .stream().map(p -> p.getInventario().getSalida()).toList();

        tiposGraficos.put(0, stockProducto);
        tiposGraficos.put(1, salidaProducto);*/

        GestorGraficadorEstadisticas gestor = new GestorGraficadorEstadisticas();

        cargarComboBoxEstadistica();

        /*if (jComboBoxGaficos.getSelectedIndex() == 0) {
            panel.add(new ChartPanel(gestor.graficar
                    ("CantidaProducto", "ejeX", "ejeY",
                            listaNombre, 0)));
            jInternalFrame1.add(panel);
            jInternalFrame1.setVisible(true);*/
        //} else if (jComboBoxGaficos.getSelectedIndex() == 1) {
            panel.add(new ChartPanel(gestor.graficar
                    ("Cantidalñplducto", "ejeX", "ejeY",
                            listaNombre, 1)));
            jInternalFrame1.add(panel);
            jInternalFrame1.setVisible(true);
        //}
    }

    private void cargarComboBoxEstadistica(){
        GestorGraficadorEstadisticas gg = new GestorGraficadorEstadisticas();
        var a = gg.listaTiposCondiciones;
        for (String s : a) {
            jComboBoxGaficos.addItem(s);
        }
    }
    
    
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVentasPanel().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel Inventario;
    private javax.swing.JLabel Maximizar;
    private javax.swing.JLabel Menu;
    private javax.swing.JSeparator Minimizar;
    private javax.swing.JPanel PanelMax;
    private javax.swing.JPanel PanelMini;
    private javax.swing.JPanel PanelOp;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel RegistroVentas;
    private javax.swing.JLabel Venta;
    private javax.swing.JLabel X;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JComboBox<String> jComboBoxGaficos;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel registro_ventas;
    // End of variables declaration//GEN-END:variables

}
