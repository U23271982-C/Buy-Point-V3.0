package Frontend.FormulariosPrincipales;

import Backend.Controladores.CtrlPaqueteProducto;
import Backend.Controladores.CtrlProducto;
import Backend.Controladores.CtrlVenta;
import Backend.Entidades.PaqueteProducto;
import Backend.Entidades.Producto;
import Backend.Gestores.GestorDeFiltro;
import Frontend.Categoria.RegistrarNuevaCategoria;
import Frontend.Cliente.RegistrarNuevoCliente;
import Frontend.EliminarVenta;
import Frontend.visualFramework.Animaciones;
import Frontend.visualFramework.Formato_Imagen;
import Frontend.FormulariosPrincipales.InventarioPanel;
import Frontend.PaqueteProductos.RegistrarEmpaques;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileView;
import javax.swing.table.DefaultTableModel;


public final class MenuPrincipalPanel extends javax.swing.JFrame implements Animaciones{
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MenuPrincipal = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        PanelX = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        PanelMax = new javax.swing.JPanel();
        Maximizar = new javax.swing.JLabel();
        PanelMini = new javax.swing.JPanel();
        Minimizar = new javax.swing.JSeparator();
        iconoUsuario = new javax.swing.JLabel();
        PanelOp = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        Inventario = new javax.swing.JLabel();
        Venta = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        RegistroVentas = new javax.swing.JLabel();
        EmpaqueButton = new javax.swing.JLabel();
        CategoriaButton = new javax.swing.JLabel();
        ClienteButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabladeProductosaCaducar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MenuPrincipal.setName("MenuPrincipal"); // NOI18N
        MenuPrincipal.setPreferredSize(new java.awt.Dimension(1212, 700));
        MenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuPrincipalMouseEntered(evt);
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

        Maximizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 11, 13);
        PanelMax.add(Maximizar, gridBagConstraints);

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
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PanelMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        EmpaqueButton.setBackground(new java.awt.Color(255, 255, 255));
        EmpaqueButton.setForeground(new java.awt.Color(0, 0, 0));
        EmpaqueButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmpaqueButton.setText("Gestor Empaques");
        EmpaqueButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmpaqueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpaqueButtonMouseClicked(evt);
            }
        });

        CategoriaButton.setBackground(new java.awt.Color(255, 255, 255));
        CategoriaButton.setForeground(new java.awt.Color(0, 0, 0));
        CategoriaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CategoriaButton.setText("Gestor Categorias");
        CategoriaButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CategoriaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriaButtonMouseClicked(evt);
            }
        });

        ClienteButton.setBackground(new java.awt.Color(255, 255, 255));
        ClienteButton.setForeground(new java.awt.Color(0, 0, 0));
        ClienteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClienteButton.setText("Gestor Clientes");
        ClienteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClienteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClienteButtonMouseClicked(evt);
            }
        });

        TextArea.setEditable(false);
        TextArea.setBackground(new java.awt.Color(255, 255, 255));
        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        TabladeProductosaCaducar.setForeground(new java.awt.Color(0, 0, 0));
        TabladeProductosaCaducar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Fecha de Caducidad"
            }
        ));
        jScrollPane2.setViewportView(TabladeProductosaCaducar);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor Ventas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuPrincipalLayout = new javax.swing.GroupLayout(MenuPrincipal);
        MenuPrincipal.setLayout(MenuPrincipalLayout);
        MenuPrincipalLayout.setHorizontalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelOp, javax.swing.GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE))
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ClienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(EmpaqueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)))
                .addContainerGap())
        );
        MenuPrincipalLayout.setVerticalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(EmpaqueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(CategoriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPrincipalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(MenuPrincipalLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(ClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addComponent(PanelOp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
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
        //agregar el scaner de barra
    }//GEN-LAST:event_InventarioMouseClicked

    private void VentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentaMouseClicked
        VentaPanel V = new VentaPanel();
        V.setVisible(true);
        this.setVisible(false);
        V.toFront();
    }//GEN-LAST:event_VentaMouseClicked

    private void RegistroVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroVentasMouseClicked
        RegistroVentasPanel RV = new RegistroVentasPanel();
        RV.setVisible(true);
        this.setVisible(false);
        RV.toFront();
    }//GEN-LAST:event_RegistroVentasMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        MenuPrincipalPanel MP = new MenuPrincipalPanel();
        MP.setVisible(true);
        this.setVisible(false);
        MP.toFront();
    }//GEN-LAST:event_MenuMouseClicked

    private void PanelMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMiniMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_PanelMiniMouseClicked

    private void PanelMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseClicked
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_PanelMaxMouseClicked

    private void PanelMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseEntered
        PanelMax.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_PanelMaxMouseEntered

    private void PanelMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseExited
        PanelMax.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelMaxMouseExited

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

    private void MenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPrincipalMouseEntered
        Animaciones.Disminuye(panelOpciones, 1, 2, 0);
    }//GEN-LAST:event_MenuPrincipalMouseEntered

    private void EmpaqueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpaqueButtonMouseClicked
        RegistrarEmpaques RE = new RegistrarEmpaques();
        RE.setVisible(true);
        RE.toFront();
    }//GEN-LAST:event_EmpaqueButtonMouseClicked

    private void CategoriaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaButtonMouseClicked
        RegistrarNuevaCategoria RNC = new RegistrarNuevaCategoria();
        RNC.setVisible(true);
        RNC.toFront();
    }//GEN-LAST:event_CategoriaButtonMouseClicked

    private void ClienteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienteButtonMouseClicked
        RegistrarNuevoCliente RNC = new RegistrarNuevoCliente();
        RNC.setVisible(true);
        RNC.toFront();
    }//GEN-LAST:event_ClienteButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        EliminarVenta EV = new EliminarVenta();
        EV.setVisible(true);
        EV.toFront();
    }//GEN-LAST:event_jLabel1MouseClicked
    
    private void CargarDatosProductosCaducar(JTable jTable){
        //GestorDeFiltro GSF = new GestorDeFiltro();
        CtrlPaqueteProducto CP = new CtrlPaqueteProducto();
        
        List<PaqueteProducto> lista = CP.listar();

        List<PaqueteProducto> listaFiltrado =
                GestorDeFiltro.filtrarPorCaducar(lista, 7);
        //lista.forEach(System.out::println);
        
        DefaultTableModel dtm = (DefaultTableModel) TabladeProductosaCaducar.getModel();
        
        for (int i = 0; i < listaFiltrado.size(); i++) {
            Object producto = listaFiltrado.get(i).getProducto().getNombreProducto();
            Object fv = listaFiltrado.get(i).getFechaCaducidad();
            
            dtm.addRow(new Object[]{producto,fv} );
        }
        
    }
    
    private void LlenadoTextArea(JTextArea jTextArea){
        //CtrlVenta CV = new CtrlVenta();

        String formatoAviso = """
                ¡Gran trabajo, equipo!
                Queremos compartir con ustedes una gran noticia:
                el día con mayor ganancia fue el pasado %s,
                alcanzando un total de S/ %.2f.
                
                ¡Sigamos así y hagamos que cada día sea aún mejor!
                """;
        Object[] vector = CtrlVenta.fechaMasVenta();
        LocalDate fecha = LocalDate.parse(vector[0].toString());
        double monto = Double.parseDouble(vector[1].toString());
        
        jTextArea.setText(String.format(formatoAviso, fecha, monto));
    }
    
    public MenuPrincipalPanel(){
       initComponents();
       setLocationRelativeTo(null);
       Formato_Imagen FI = new Formato_Imagen();
       FI.tamañoimagen(iconoUsuario, "/img/usermenu.png");
       FI.tamañoimagen(Inventario, "/img/inventario.png");
       FI.tamañoimagen(Menu, "/img/menu.png");
       FI.tamañoimagen(Venta, "/img/venta.png");
       FI.tamañoimagen(RegistroVentas, "/img/registroventas.png");
//       EmpaqueButton.setBackground(Color.WHITE);
//       CategoriaButton.setBackground(Color.WHITE);
//       ClienteButton.setBackground(Color.WHITE);
        TextArea.setLineWrap(true);
        CargarDatosProductosCaducar(TabladeProductosaCaducar);
        LlenadoTextArea(TextArea);
        
    }
    
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CategoriaButton;
    private javax.swing.JLabel ClienteButton;
    private javax.swing.JLabel EmpaqueButton;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel Inventario;
    private javax.swing.JLabel Maximizar;
    private javax.swing.JLabel Menu;
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JSeparator Minimizar;
    private javax.swing.JPanel PanelMax;
    private javax.swing.JPanel PanelMini;
    private javax.swing.JPanel PanelOp;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel RegistroVentas;
    private javax.swing.JTable TabladeProductosaCaducar;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel Venta;
    private javax.swing.JLabel X;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables

}
