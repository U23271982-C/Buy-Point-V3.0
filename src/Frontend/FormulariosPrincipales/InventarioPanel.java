package Frontend.FormulariosPrincipales;

import Backend.Controladores.CtrlCategoriaProducto;
import Frontend.ActualizarProducto;
import Frontend.VistaProducto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import Backend.Controladores.CtrlProducto;
import Backend.Entidades.CategoriaProducto;
import Backend.Entidades.Producto;
import Backend.Entidades.Codigo;
import Frontend.RegistrarProductoOCodigo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class InventarioPanel extends javax.swing.JFrame implements Animaciones{
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        inventario = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        PanelX = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        PanelMax = new javax.swing.JPanel();
        Maximizar = new javax.swing.JLabel();
        PanelMini = new javax.swing.JPanel();
        Minimizar = new javax.swing.JSeparator();
        iconoUsuario = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        Categoria = new javax.swing.JLabel();
        AgregarProducto = new javax.swing.JLabel();
        PanelOp = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        Inventario = new javax.swing.JLabel();
        Venta = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        RegistroVentas = new javax.swing.JLabel();
        FiiltradoComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        inventario.setBackground(new java.awt.Color(255, 255, 255));
        inventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inventario.setName("inventario"); // NOI18N
        inventario.setPreferredSize(new java.awt.Dimension(1176, 486));
        inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventarioMouseEntered(evt);
            }
        });
        inventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inventarioKeyPressed(evt);
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
        PanelMax.setForeground(new java.awt.Color(0, 0, 0));
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
        gridBagConstraints.insets = new java.awt.Insets(13, 10, 0, 6);
        PanelMini.add(Minimizar, gridBagConstraints);

        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usermenu.png"))); // NOI18N
        iconoUsuario.setPreferredSize(new java.awt.Dimension(100, 158));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap(1076, Short.MAX_VALUE)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                        .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                        .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelX, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(PanelMax, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(PanelMini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Producto.setForeground(new java.awt.Color(0, 0, 0));
        Producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Producto.setText("Producto");
        Producto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Categoria.setForeground(new java.awt.Color(0, 0, 0));
        Categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Categoria.setText("Categoria");
        Categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AgregarProducto.setForeground(new java.awt.Color(0, 0, 0));
        AgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgregarProducto.setText("Agregar Producto");
        AgregarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarProductoMouseClicked(evt);
            }
        });

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

        FiiltradoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio ascendentemente", "Precio descendentemente", "Nombre ascendentemente", "Nombre desendente" }));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Precio", "Precio Costo", "Stock", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jTable10);

        javax.swing.GroupLayout inventarioLayout = new javax.swing.GroupLayout(inventario);
        inventario.setLayout(inventarioLayout);
        inventarioLayout.setHorizontalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(inventarioLayout.createSequentialGroup()
                .addGroup(inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(inventarioLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(FiiltradoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(inventarioLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        inventarioLayout.setVerticalGroup(
            inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventarioLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FiiltradoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PanelOp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_MaximizarMouseClicked

    private void MaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseEntered
        PanelMax.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_MaximizarMouseEntered

    private void MaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseExited
        PanelMax.setBackground(Color.WHITE);
    }//GEN-LAST:event_MaximizarMouseExited

    //PARTE INUTIL  
    private void inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMouseClicked
        /*VistaProducto VP = new VistaProducto();
        VP.setVisible(true);*/
        this.codigoLeido.setLength(0);
        this.codigoBarras = "";
    }//GEN-LAST:event_inventarioMouseClicked

    private void AgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarProductoMouseClicked
        /*ActualizarProducto ap = new ActualizarProducto();
        ap.setVisible(true);
        ap.toFront();*/
    }//GEN-LAST:event_AgregarProductoMouseClicked

    private void PanelOpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelOpMouseEntered
        Animaciones.Agranda(panelOpciones, 1, 2, 62);
    }//GEN-LAST:event_PanelOpMouseEntered

    private void inventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMouseEntered
        Animaciones.Disminuye(panelOpciones, 1, 2, 0);
    }//GEN-LAST:event_inventarioMouseEntered
    
    
    public static String codigoBarras ;
    /*
    Codigo codigo = new Codigo();
    
    protected Codigo getCodigo() {
        this.codigo.setCodigo(codigoBarras);
        return codigo;
    }
    
    public String getCodigoBarras(){
        return codigoBarras;
    }*/
    
    StringBuilder codigoLeido = new StringBuilder();
    
    private void inventarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventarioKeyPressed
    //codigoLeido.setLength(0);
        char lecturaCodigo = evt.getKeyChar();
        
        if (lecturaCodigo == KeyEvent.VK_ENTER) {
            CtrlProducto CP = new CtrlProducto();
            
            this.codigoBarras = codigoLeido.toString();
            
            Producto P = new Producto();
            Codigo C = new Codigo();
            C.setCodigo(codigoBarras);
            P.setCodigo(C);
            
                      
            if (CP.leer(P) != null) {
                VistaProducto VP = new VistaProducto();
                VP.setVisible(true);
                
            } else{
                JOptionPane.showConfirmDialog(null, "Producto no encontrado");
                RegistrarProductoOCodigo RPOC = new RegistrarProductoOCodigo();
                RPOC.setVisible(true);
            }
            System.out.println("sdfsd");            
        }
        else{
            codigoLeido.append(lecturaCodigo); 
        }
    }//GEN-LAST:event_inventarioKeyPressed
    
    //DefaultTableModel mode = new DefaultTableModel();
    private void listaProductos(){
//        ArrayList<String> Columna = new ArrayList<>();
//        
//            Columna.add("Nombre");
//            Columna.add("Descripción");
//            Columna.add("Precio");
//            Columna.add("Precio Costo");
//            Columna.add("Stock");
//            Columna.add("Categoria");
//        
//            for (String columna : Columna) {
//                    mode.addColumn(columna);
//            }
            String[] columnas = {
                "Nombre",
                "Descripcion",
                "Precio",
                "Precio Costo",
                "Stock",
                "Categoria"
            };
            DefaultTableModel tm = (DefaultTableModel) jTable10.getModel();
            JTable tableO = new JTable(tm);
            
            CtrlProducto CP = new CtrlProducto();
        
        ArrayList<Producto> listado = CP.listar();
        //Object[] o = null;
        for (int i = 0; i < listado.size(); i++) {
            tm.addRow( new Object[]{
                listado.get(i).getNombreProducto(),
                listado.get(i).getDescripcion(),
                listado.get(i).getCategoriaProducto().getNombre(),
                
                listado.get(i).getPrecio(),
                listado.get(i).getInventario().getPrecioCosto(),
                listado.get(i).getInventario().getStock()
            });
        }
         
    }
    
    public InventarioPanel(){
       initComponents();
       setLocationRelativeTo(null);
       this.tamañoimagen(iconoUsuario, "/img/usermenu.png");
       this.tamañoimagen(Inventario, "/img/inventario.png");
       this.tamañoimagen(Menu, "/img/menu.png");
       this.tamañoimagen(Venta, "/img/venta.png");
       this.tamañoimagen(RegistroVentas, "/img/registroventas.png");
       //this.tamañoimagen(agregarJLabel, "/img/agregar_producto1.png");
       inventario.setFocusable(true);
       this.listaProductos();
      
    }
    
    public void tamañoimagen(JLabel label, String ruta){
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta)). getImage()
        .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH))); 
    }


    
    public static void main(String args[]) {
        
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgregarProducto;
    private javax.swing.JLabel Categoria;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JComboBox<String> FiiltradoComboBox;
    private javax.swing.JLabel Inventario;
    private javax.swing.JLabel Maximizar;
    private javax.swing.JLabel Menu;
    private javax.swing.JSeparator Minimizar;
    private javax.swing.JPanel PanelMax;
    private javax.swing.JPanel PanelMini;
    private javax.swing.JPanel PanelOp;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel Producto;
    private javax.swing.JLabel RegistroVentas;
    private javax.swing.JLabel Venta;
    private javax.swing.JLabel X;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JPanel inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable10;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables

}
