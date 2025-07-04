package Frontend.FormulariosPrincipales;

import Backend.Controladores.CtrlDetalleVenta;
import Backend.Controladores.CtrlVenta;
import Backend.Entidades.*;
import Backend.Ticket.Ticket;
import Frontend.visualFramework.Animaciones;
import Backend.Controladores.CtrlProducto;
import Backend.Controladores.CtrlTipoPago;
import Frontend.visualFramework.Formato_Imagen;
import Frontend.Cliente.TipoCliente;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public final class VentaPanel extends javax.swing.JFrame implements Animaciones {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        venta = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        PanelX = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        PanelMax = new javax.swing.JPanel();
        Maximizar = new javax.swing.JLabel();
        PanelMini = new javax.swing.JPanel();
        Minimizar = new javax.swing.JSeparator();
        iconoUsuario = new javax.swing.JLabel();
        Lupa = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        PanelOp = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        Inventario = new javax.swing.JLabel();
        Venta = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        RegistroVentas = new javax.swing.JLabel();
        ListadoProducto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVender = new javax.swing.JTable();
        MontoTotalPanel = new javax.swing.JPanel();
        MontoTotalJLabel = new javax.swing.JLabel();
        IGVJLabel = new javax.swing.JLabel();
        PrecioJLabel = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabel_IGV = new javax.swing.JLabel();
        jLabelSubTotal = new javax.swing.JLabel();
        ConfirmarButtom = new javax.swing.JButton();
        SeparatorSubTotal = new javax.swing.JSeparator();
        SeparatorIGV = new javax.swing.JSeparator();
        SeparatorTotal = new javax.swing.JSeparator();
        TipodePagoComboBox = new javax.swing.JComboBox<>();
        CheckBoxCliente = new javax.swing.JCheckBox();
        ClienteJLabel = new javax.swing.JLabel();
        OtrodJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        venta.setBackground(new java.awt.Color(255, 255, 255));
        venta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        venta.setName("venta"); // NOI18N
        venta.setPreferredSize(new java.awt.Dimension(1176, 486));
        venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ventaMouseEntered(evt);
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
        PanelX.setForeground(new java.awt.Color(0, 0, 0));
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
        gridBagConstraints.insets = new java.awt.Insets(13, 10, 0, 6);
        PanelMini.add(Minimizar, gridBagConstraints);

        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usermenu.png"))); // NOI18N
        iconoUsuario.setPreferredSize(new java.awt.Dimension(100, 158));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelMax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        Lupa.setText("jLabel3");

        Buscador.setBackground(new java.awt.Color(255, 255, 255));
        Buscador.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Buscador.setForeground(new java.awt.Color(102, 102, 102));
        Buscador.setText("   Buscar");
        Buscador.setBorder(null);
        Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscadorMousePressed(evt);
            }
        });
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscadorKeyPressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

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

        ListadoProducto.setBackground(new java.awt.Color(255, 255, 255));
        ListadoProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListadoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ListadoProductoKeyPressed(evt);
            }
        });

        jTableVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Producto", "Precio Unidad", "Cantidad", "SubTotal", "Total"
            }
        ));
        jTableVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVenderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVender);

        javax.swing.GroupLayout ListadoProductoLayout = new javax.swing.GroupLayout(ListadoProducto);
        ListadoProducto.setLayout(ListadoProductoLayout);
        ListadoProductoLayout.setHorizontalGroup(
            ListadoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        ListadoProductoLayout.setVerticalGroup(
            ListadoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        MontoTotalPanel.setBackground(new java.awt.Color(255, 255, 255));
        MontoTotalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MontoTotalJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MontoTotalJLabel.setForeground(new java.awt.Color(0, 0, 0));
        MontoTotalJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MontoTotalJLabel.setText("Total");

        IGVJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IGVJLabel.setForeground(new java.awt.Color(0, 0, 0));
        IGVJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IGVJLabel.setText("IGV (18%)");

        PrecioJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrecioJLabel.setForeground(new java.awt.Color(0, 0, 0));
        PrecioJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrecioJLabel.setText("SubTotal");

        jLabelTotal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTotalMouseClicked(evt);
            }
        });

        jLabel_IGV.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_IGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ConfirmarButtom.setText("Confirmar");
        ConfirmarButtom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfirmarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarButtomMouseClicked(evt);
            }
        });
        ConfirmarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarButtomActionPerformed(evt);
            }
        });

        SeparatorSubTotal.setForeground(new java.awt.Color(0, 0, 0));

        SeparatorIGV.setForeground(new java.awt.Color(0, 0, 0));

        SeparatorTotal.setForeground(new java.awt.Color(0, 0, 0));

        CheckBoxCliente.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CheckBoxCliente.setForeground(new java.awt.Color(0, 0, 0));
        CheckBoxCliente.setSelected(true);
        CheckBoxCliente.setText("Directo");
        CheckBoxCliente.setBorder(null);
        CheckBoxCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBoxClienteMouseClicked(evt);
            }
        });
        CheckBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxClienteActionPerformed(evt);
            }
        });

        ClienteJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ClienteJLabel.setForeground(new java.awt.Color(0, 0, 0));
        ClienteJLabel.setText("Cliente:");

        OtrodJButton.setBackground(new java.awt.Color(255, 255, 255));
        OtrodJButton.setForeground(new java.awt.Color(0, 0, 0));
        OtrodJButton.setText("Otros");
        OtrodJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OtrodJButton.setEnabled(false);
        OtrodJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OtrodJButtonMouseClicked(evt);
            }
        });
        OtrodJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtrodJButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo de Pago:");

        javax.swing.GroupLayout MontoTotalPanelLayout = new javax.swing.GroupLayout(MontoTotalPanel);
        MontoTotalPanel.setLayout(MontoTotalPanelLayout);
        MontoTotalPanelLayout.setHorizontalGroup(
            MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(CheckBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClienteJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MontoTotalPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(OtrodJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MontoTotalPanelLayout.createSequentialGroup()
                                .addComponent(ConfirmarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MontoTotalPanelLayout.createSequentialGroup()
                                .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                                        .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MontoTotalJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(IGVJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PrecioJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51)
                                        .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_IGV, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SeparatorSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SeparatorIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(SeparatorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TipodePagoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))))))
        );
        MontoTotalPanelLayout.setVerticalGroup(
            MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(SeparatorSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IGVJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_IGV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MontoTotalJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClienteJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OtrodJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(ConfirmarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(MontoTotalPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(MontoTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipodePagoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout ventaLayout = new javax.swing.GroupLayout(venta);
        venta.setLayout(ventaLayout);
        ventaLayout.setHorizontalGroup(
            ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ventaLayout.createSequentialGroup()
                .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelOp, javax.swing.GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE))
                    .addGroup(ventaLayout.createSequentialGroup()
                        .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventaLayout.createSequentialGroup()
                                .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ventaLayout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ventaLayout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ventaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ListadoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addComponent(MontoTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ventaLayout.setVerticalGroup(
            ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventaLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventaLayout.createSequentialGroup()
                        .addGroup(ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListadoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MontoTotalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelOp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(venta, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(venta, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //region Movimiento de Windo
    int xMouse, yMouse;
    private void EncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
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
        PanelMax.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_PanelMaxMouseEntered

    private void PanelMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseExited
        PanelMax.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelMaxMouseExited

    private void PanelMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMiniMouseEntered
        PanelMini.setBackground(new Color(242, 242, 242));
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

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        //Buscador.setText("");
    }//GEN-LAST:event_BuscadorActionPerformed

    private void PanelMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMaxMouseClicked
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_PanelMaxMouseClicked

    private void PanelMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMiniMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_PanelMiniMouseClicked

    
    
    
    private void BuscadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMousePressed
        Buscador.setText("");
    }//GEN-LAST:event_BuscadorMousePressed

    private void MaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseClicked
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_MaximizarMouseClicked

    private void MaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseEntered
        PanelMax.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_MaximizarMouseEntered

    private void MaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizarMouseExited
        PanelMax.setBackground(Color.WHITE);
    }//GEN-LAST:event_MaximizarMouseExited

    StringBuilder codigoescaneado = new StringBuilder();
    String codigoBarra;
    public Venta venta1 = new Venta();
    //public DetalleVenta detalleVenta = new DetalleVenta();

    private void BuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyPressed

        char lecturaCodigo = evt.getKeyChar();

        try {
            if (lecturaCodigo == KeyEvent.VK_ENTER) {
                codigoBarra = codigoescaneado.toString();
                Buscador.setText("");
                CtrlProducto CP = new CtrlProducto();

                Producto P = new Producto();
                Codigo C = new Codigo();
                C.setCodigo(codigoBarra);
                P.setCodigo(C);

                Producto p1 = CP.leer(P);
                if (p1 != null) {
                    int stockProducto = p1.getInventario().getStock();
                    DetalleVenta detalleVenta = new DetalleVenta();
                    detalleVenta.setProducto(p1);

                    // Agregamos el porducto leido a la venta

                    if (!venta1.getDetallesVenta().isEmpty()) {// Si hay detalles de venta en la venta
                        for (int i = 0; i < venta1.getDetallesVenta().size(); i++) {
                            int cantidadVender = venta1.getDetallesVenta().get(i).getCantidad();
                            if (stockProducto > cantidadVender) {
                                if (codigoescaneado.toString().equals(venta1.getDetallesVenta().get(i)
                                        .getProducto().getCodigo().getCodigo())) {
                                    venta1.getDetallesVenta().get(i).setCantidad
                                            (cantidadVender + 1);
                                    break;
                                }else if(i + 1 == venta1.getDetallesVenta().size()) {
                                venta1.getDetallesVenta().add(detalleVenta);
                                    break;
                                }
                            }else {
                                JOptionPane.showMessageDialog
                                        (null, "Cantidad insufinciente de Stock",
                                                "Error", 0);
                            }
                        }
                        actualizarTotales();
                        actualizarTabla();
                    }else {
                        if (stockProducto > detalleVenta.getCantidad()) {
                            venta1.getDetallesVenta().add(detalleVenta);
                            actualizarTotales();
                            actualizarTabla();
                        } else {
                            JOptionPane.showMessageDialog
                                    (null, "Cantidad insufinciente de Stock",
                                            "Error", 0);
                        }
                        /*for (DetalleVenta dv : venta1.getDetallesVenta()) {
                            if (codigoescaneado.toString().equals(dv.getProducto().getCodigo().getCodigo())) {
                                dv.setCantidad(dv.getCantidad() + 1);
                            }else if() {
                                venta1.getDetallesVenta().add(detalleVenta);
                            }
                        }*/
                    }

                    venta1.getDetallesVenta().forEach(System.out::println);
                }
                codigoescaneado.setLength(0);
            } else {
                codigoescaneado.append(lecturaCodigo);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                


    }//GEN-LAST:event_BuscadorKeyPressed

    private void actualizarTabla() {
        DefaultTableModel tm = (DefaultTableModel) jTableVender.getModel();
        tm.setRowCount(0); // Limpiar la tabla antes de volver a llenarla
        for (DetalleVenta dv : venta1.getDetallesVenta()) {
            tm.addRow(new Object[]{
                    dv.getProducto().getNombreProducto(),
                    dv.getPrecioUnitario(),
                    dv.getCantidad(),
                    dv.getSubTotal(),
                    dv.getTotal()
            });
        }
    }

    private void actualizarTotales() {
        jLabelSubTotal.setText(String.valueOf(venta1.calcularSubTotal()));
        BigDecimal igv = venta1.calcularTotal()
                .multiply(BigDecimal.valueOf(0.18))
                .setScale(2, RoundingMode.HALF_UP);
        jLabel_IGV.setText(String.valueOf(igv));
        jLabelTotal.setText(String.valueOf(venta1.calcularTotal()));
    }


    private void EncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_EncabezadoMousePressed

    private void PanelOpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelOpMouseEntered
        Animaciones.Agranda(panelOpciones, 1, 2, 62);
    }//GEN-LAST:event_PanelOpMouseEntered

    private void ventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventaMouseEntered
        Animaciones.Disminuye(panelOpciones, 1, 2, 0);
    }//GEN-LAST:event_ventaMouseEntered

    private void ListadoProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ListadoProductoKeyPressed

    }//GEN-LAST:event_ListadoProductoKeyPressed

    private void ConfirmarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarButtomMouseClicked
        try {
            /*JOptionPane.showMessageDialog(null, String.format("%s %s %s %s %s %s", TipoCliente.Nombre,
                    TipoCliente.Torre, TipoCliente.Departamento, TipoCliente.Cuenta, TipoCliente.Identificacion, 
                    TipoCliente.Telefono));*/
         
            
            CtrlVenta ctrlVenta = new CtrlVenta();
            CtrlDetalleVenta ctrlDetalleVenta = new CtrlDetalleVenta();
            Cliente cliente = new Cliente();
            Comprobante comprobante = new Comprobante();
            TipoPago tipoPago = new TipoPago();
            Departamento depa = null;
            Cuenta cuenta = null;

            Ticket ticket = new Ticket();


            venta1.setFecha(LocalDate.now());
            venta1.setHora(LocalTime.now());
            // SubTotal calculado
                //jLabelSubTotal.getText();
            //System.out.println(jLabelSubTotal.getText());
            // Total calculado
                //jLabelTotal.getText();
            //System.out.println(jLabelTotal.getText());
            // Indece de la lista para que devuelva un tipo der Titeck
            int indice = 0;
            // Tipo Pago
            String tipoPagoE =
                    Objects.requireNonNull(TipodePagoComboBox.getSelectedItem()).toString();
            System.out.println(tipoPagoE);
            // Venta Directa
            if (CheckBoxCliente.isSelected()){
                try {
                    ticket.getTipoEncabezadosTickets()
                            .set(indice,
                                    String.format(ticket.getEncabezadoTicketDirecto(),
                                            LocalDate.now().format(ticket.getFttFecha()),
                                            LocalTime.now().format(ticket.getFttHora()),
                                            tipoPagoE));//Falta poner el nombre del tipo de pago
                    cliente.setCliente("Directo");
                    cliente.setIdentificacion(null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }else {
                // Cliente Delivery
                if (!TipoCliente.Torre.equals("0")
                        & !TipoCliente.Departamento.equals("0")){
                    try {
                        depa = new Departamento();
                        depa.setTorre(Short.parseShort(TipoCliente.Torre));
                        depa.setDepartamento(Short.parseShort(TipoCliente.Departamento));

                        if (TipoCliente.Nombre.equals("0")
                                & TipoCliente.Apellido.equals("0")) {
                            System.out.println("ENTRE A DEPARTAMENTO");
                            //System.out.println("entre");
                            indice = 1;
                            // Modificamos la cabecera de la venta
                            ticket.getTipoEncabezadosTickets().set(indice, String.format(
                                    ticket.getEncabezadoTicketDelivery(),

                                    LocalDate.now().format(ticket.getFttFecha()),
                                    LocalTime.now().format(ticket.getFttHora()),
                                    (int) depa.getTorre(),
                                    (int) depa.getDepartamento(),
                                    tipoPagoE
                            ));
                        }else {
                            System.out.println("ENTRE A DEPARTAMENTO Y CUENTA");
                            // Cliente con Cuenta y Departamento
                            indice = 4;
                            cuenta = new Cuenta();
                            cuenta.setNombre(TipoCliente.Nombre);
                            cuenta.setApellido(TipoCliente.Apellido);
                            cuenta.setTelefono(Integer.parseInt(TipoCliente.Telefono));
                            // Modificamos la cabecera de la venta
                            ticket.getTipoEncabezadosTickets().set(indice, String.format(
                                    ticket.getEncabezadoTicketCuentaDepartamento(),

                                    LocalDate.now().format(ticket.getFttFecha()),
                                    LocalTime.now().format(ticket.getFttHora()),
                                    tipoPagoE,

                                    cuenta.getNombre(),
                                    cuenta.getApellido(),
                                    (int) cuenta.getTelefono(),
                                    (int) depa.getTorre(),
                                    (int) depa.getDepartamento()
                            ));
                            cliente.setCuenta(cuenta);
                        }
                        cliente.setDepartamento(depa);
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                } else if (!TipoCliente.Cliente.equals("0")) {
                    System.out.println("ENTRE A CLIENTE SOLO");
                    try {
                        // Cliente solo
                        indice = 2;
                        // Modificamos la cabecera de la venta
                        cliente.setCliente(TipoCliente.Cliente);
                        cliente.setIdentificacion(TipoCliente.Identificacion);

                        ticket.getTipoEncabezadosTickets().set(indice, String.format(
                                ticket.getEncabezadoTicketCliente(),

                                LocalDate.now().format(ticket.getFttFecha()),
                                LocalTime.now().format(ticket.getFttHora()),
                                tipoPagoE,

                                cliente.getCliente(),
                                cliente.getIdentificacion()
                        ));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } else if (!TipoCliente.Nombre.equals("0")
                        & !TipoCliente.Apellido.equals("0")) {
                    try {
                        System.out.println("ENTRE A CUENTA");
                        // Cliente con cuenta
                        indice = 3;
                        // Modificamos la cabecera de la venta
                        cuenta = new Cuenta();
                        cuenta.setNombre(TipoCliente.Nombre);
                        cuenta.setApellido(TipoCliente.Apellido);
                        cuenta.setTelefono(Integer.parseInt(TipoCliente.Telefono));
                        // Modificamos la cabecera de la venta
                        ticket.getTipoEncabezadosTickets().set(indice, String.format(
                                ticket.getEncabezadoTicketCuenta(),

                                LocalDate.now().format(ticket.getFttFecha()),
                                LocalTime.now().format(ticket.getFttHora()),
                                tipoPagoE,

                                cuenta.getNombre(),
                                cuenta.getApellido(),
                                cuenta.getTelefono()
                        ));
                        cliente.setCuenta(cuenta);
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            //venta1
            tipoPago.setNombreTipoPago(tipoPagoE);
            comprobante.setComprobante("Boleta");
            comprobante.setTipoPago(tipoPago);
            venta1.setCliente(cliente);
            venta1.setComprobante(comprobante);
            if (!venta1.getDetallesVenta().isEmpty()) {
                // Registramos la venta
                ctrlVenta.registrar(venta1);
                // Concatenamos el cuerpo del titeck
                StringBuilder sb = new StringBuilder();
                // Registramos los Detalles de Venta
                for (int i = 0; i < venta1.getDetallesVenta().size(); i++) {
                    sb.append(String.format(ticket.getLineaTicket(),
                            venta1.getDetallesVenta().get(i).getProducto().getNombreProducto(),
                            venta1.getDetallesVenta().get(i).getCantidad(),
                            venta1.getDetallesVenta().get(i).getSubTotal(),
                            venta1.getDetallesVenta().get(i).getTotal()
                    ));
                    ctrlDetalleVenta.registrar(venta1.getDetallesVenta().get(i));
                }

                // Cuerpo titeck
                ticket.setCuerpoTicket(sb.toString());
                // Final titeck
                ticket.setFinalTicket(
                        String.format(ticket.getFinalTicket(),
                                venta1.calcularSubTotal(),
                                venta1.calcularSubTotal().multiply(new BigDecimal("0.18")),
                                venta1.calcularTotal()
                        )
                );

                // Exportamos .txt
                ticket.exportarTiteck(indice, CtrlVenta.ultimoID());
            }else {
                JOptionPane.showMessageDialog
                        (null, "No se puede registrar la venta sin productos",
                                "Error", 0);
            }
            venta1.getDetallesVenta().clear();
            actualizarTabla();
            actualizarTotales();

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }//GEN-LAST:event_ConfirmarButtomMouseClicked

    private void TablaVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaVentaKeyPressed

    }//GEN-LAST:event_TablaVentaKeyPressed

    //String codigoBarra;
    private void BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyTyped


    }//GEN-LAST:event_BuscadorKeyTyped

    private void CheckBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxClienteActionPerformed
        
    }//GEN-LAST:event_CheckBoxClienteActionPerformed

    private void CheckBoxClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBoxClienteMouseClicked
        boolean marcado = !CheckBoxCliente.isSelected();
        OtrodJButton.setEnabled(marcado);
        
    }//GEN-LAST:event_CheckBoxClienteMouseClicked

    private void OtrodJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OtrodJButtonMouseClicked
        /*TipoCliente TP = new TipoCliente();
        TP.setVisible(true);*/
    }//GEN-LAST:event_OtrodJButtonMouseClicked

    private void OtrodJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtrodJButtonActionPerformed
        TipoCliente TP = new TipoCliente();
        TP.setVisible(true);
    }//GEN-LAST:event_OtrodJButtonActionPerformed

    private void ConfirmarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarButtomActionPerformed

        boolean estanLlenos = jLabelSubTotal.getText() != null
                    && jLabel_IGV.getText() != null
                && jLabelTotal.getText() != null;    
        
        ConfirmarButtom.setEnabled(estanLlenos);
        
        if(!estanLlenos){
            try {
            JOptionPane.showMessageDialog(null,
                    String.format("%s %s %s", TipoCliente.Nombre,
                    TipoCliente.Torre, TipoCliente.Departamento));

            CtrlVenta ctrlVenta = new CtrlVenta();
            CtrlDetalleVenta ctrlDetalleVenta = new CtrlDetalleVenta();
            Cliente cliente = new Cliente();
            Comprobante comprobante = new Comprobante();
            TipoPago tipoPago = new TipoPago();
            Departamento depa = null;
            Cuenta cuenta = null;

            Ticket ticket = new Ticket();


            venta1.setFecha(LocalDate.now());
            venta1.setHora(LocalTime.now());
            // SubTotal calculado
            // Total calculado
                int idx = 0;
            // Venta Directa
            if (CheckBoxCliente.isSelected()){
                try {
                    // Encabezado del Ticket
                    ticket.setEncabezadoTicketDirecto(String.format
                            (ticket.getEncabezadoTicketDirecto(), LocalDate.now().format
                                    (ticket.getFttFecha()), LocalTime.now().format
                                    (ticket.getFttHora()), Objects.requireNonNull
                                    (TipodePagoComboBox.getSelectedItem())));
                    cliente.setCliente("Directo");
                    cliente.setIdentificacion(null);
                    //idx = 0;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }else {
                // Cliente delivery
                if (!TipoCliente.Torre.isEmpty() && !TipoCliente.Departamento.isEmpty()){
                    try {
                        depa = new Departamento();
                        depa.setTorre(Short.parseShort(TipoCliente.Torre));
                        depa.setDepartamento(Short.parseShort(TipoCliente.Departamento));

                        cliente.setDepartamento(depa);
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            // FALTA REGISTRAR LA VENTA
            //venta1

            venta1.setCliente(cliente);
            venta1.setComprobante(comprobante);
            // Registramos la venta
            ctrlVenta.registrar(venta1);
            // Registramos los Detalles de Venta
                StringBuilder sb = new StringBuilder();
            for (int i = 0; i < venta1.getDetallesVenta().size(); i++) {
                sb.append(String.format(ticket.getLineaTicket(),
                        venta1.getDetallesVenta().get(i).getProducto().getNombreProducto(),
                        venta1.getDetallesVenta().get(i).getCantidad(),
                        venta1.getDetallesVenta().get(i).getSubTotal(),
                        venta1.getDetallesVenta().get(i).getTotal()
                ));
                ctrlDetalleVenta.registrar(venta1.getDetallesVenta().get(i));
            }
                try {
                    // Cuerpo titeck
                    ticket.setCuerpoTicket(sb.toString());
                    // Fianl titeck
                    ticket.setFinalTicket(
                            String.format(ticket.getFinalTicket(),
                                    venta1.calcularSubTotal(),
                                    venta1.calcularSubTotal().multiply(new BigDecimal("0.18")),
                                    venta1.calcularTotal()
                            )
                    );
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                // Exportamos el ticket
                //ticket.exportarTiteck(, idx);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
            jTableVender.clearSelection();
        }
    }//GEN-LAST:event_ConfirmarButtomActionPerformed

    private void jLabelTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTotalMouseClicked
        System.out.println(jLabelTotal.getText());
    }//GEN-LAST:event_jLabelTotalMouseClicked
    
    //eliminar un producto
    private void jTableVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVenderMouseClicked
        jTableVender.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
            // Detectar si es un clic derecho
            if (e.isPopupTrigger()) {
                int row = jTableVender.rowAtPoint(e.getPoint()); // Obtener fila seleccionada
                if (row >= 0 && row < jTableVender.getRowCount()) {
                    jTableVender.setRowSelectionInterval(row, row); // Seleccionar fila visualmente

                    // Mostrar menú contextual
                    JPopupMenu popupMenu = new JPopupMenu();
                    JMenuItem deleteItem = new JMenuItem("Eliminar");
                    //JMenuItem actualizarItem = new JMenuItem("Actualizar");
                    
                    // Acción para eliminar la fila seleccionada
                    deleteItem.addActionListener(event -> {
                    DefaultTableModel model = (DefaultTableModel) jTableVender.getModel();
                    model.removeRow(venta1.eliminarDetalleVenta(jTableVender.rowAtPoint(e.getPoint())));
    
                    jTableVender.rowAtPoint(e.getPoint()); // Eliminar fila del modelo
                    
                    actualizarTotales();
                }
                );
                    

                popupMenu.add(deleteItem);
                //popupMenu.add(actualizarItem);
                popupMenu.show(jTableVender, e.getX(), e.getY());
            }
        }
    }
    });
    }//GEN-LAST:event_jTableVenderMouseClicked

private void cargarDatosEnComboBoxTipodePago(JComboBox jComboBox) {
        CtrlTipoPago CTP = new CtrlTipoPago();

        ArrayList<TipoPago> opciones = CTP.listar();
        for(TipoPago lista: opciones){
            jComboBox.addItem(lista.getNombreTipoPago());
        }
    }

    public VentaPanel() {
        initComponents();
        setLocationRelativeTo(null);
        Formato_Imagen FI = new Formato_Imagen();
        FI.tamañoimagen(iconoUsuario, "/img/usermenu.png");
        FI.tamañoimagen(Inventario, "/img/inventario.png");
        FI.tamañoimagen(Menu, "/img/menu.png");
        FI.tamañoimagen(Venta, "/img/venta.png");
        FI.tamañoimagen(RegistroVentas, "/img/registroventas.png");
        FI.tamañoimagen(Lupa, "/img/lupa.png");
        this.Buscador.requestFocus();

        
        Venta venta = new Venta();
        DetalleVenta detalleVenta = new DetalleVenta();
       
        cargarDatosEnComboBoxTipodePago(TipodePagoComboBox);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscador;
    private javax.swing.JCheckBox CheckBoxCliente;
    private javax.swing.JLabel ClienteJLabel;
    private javax.swing.JButton ConfirmarButtom;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel IGVJLabel;
    private javax.swing.JLabel Inventario;
    private javax.swing.JPanel ListadoProducto;
    private javax.swing.JLabel Lupa;
    private javax.swing.JLabel Maximizar;
    private javax.swing.JLabel Menu;
    private javax.swing.JSeparator Minimizar;
    private javax.swing.JLabel MontoTotalJLabel;
    private javax.swing.JPanel MontoTotalPanel;
    private javax.swing.JButton OtrodJButton;
    private javax.swing.JPanel PanelMax;
    private javax.swing.JPanel PanelMini;
    private javax.swing.JPanel PanelOp;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel PrecioJLabel;
    private javax.swing.JLabel RegistroVentas;
    private javax.swing.JSeparator SeparatorIGV;
    private javax.swing.JSeparator SeparatorSubTotal;
    private javax.swing.JSeparator SeparatorTotal;
    private javax.swing.JComboBox<String> TipodePagoComboBox;
    private javax.swing.JLabel Venta;
    private javax.swing.JLabel X;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSubTotal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabel_IGV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableVender;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel venta;
    // End of variables declaration//GEN-END:variables

}
