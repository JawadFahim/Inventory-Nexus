/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventory;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nova
 */
public class WorkerHome extends javax.swing.JFrame {

    private static String workername;
    private static String worker;
    public WorkerHome(String workername,String worker) {
        initComponents();
        this.workername = workername;
        this.worker = worker;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGMain = new javax.swing.JPanel();
        UpperPanel = new javax.swing.JPanel();
        UserProfile = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Inventory_Nexus = new javax.swing.JLabel();
        ViewProducts = new javax.swing.JLabel();
        CheckInProducts = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ActivityHistoryLabel = new javax.swing.JLabel();
        CheckOutProductsLabel = new javax.swing.JLabel();
        DesktopPanel = new javax.swing.JDesktopPane();
        panel_inventory_nexus2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TotalProd2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TotalIN = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TotalOUT = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TotalQtyOrdered = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TopSellingItem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Title1 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to your homepage!");

        BGMain.setBackground(new java.awt.Color(51, 51, 51));
        BGMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpperPanel.setBackground(new java.awt.Color(210, 210, 210));

        UserProfile.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        UserProfile.setText("My Profile");
        UserProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserProfileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserProfileMousePressed(evt);
            }
        });

        Menu.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        Menu.setText("Check in Products");

        javax.swing.GroupLayout UpperPanelLayout = new javax.swing.GroupLayout(UpperPanel);
        UpperPanel.setLayout(UpperPanelLayout);
        UpperPanelLayout.setHorizontalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpperPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 664, Short.MAX_VALUE)
                .addComponent(UserProfile)
                .addGap(48, 48, 48))
        );
        UpperPanelLayout.setVerticalGroup(
            UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(UpperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserProfile)
                    .addComponent(Menu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BGMain.add(UpperPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 940, 50));

        SidePanel.setBackground(new java.awt.Color(51, 51, 51));
        SidePanel.setPreferredSize(new java.awt.Dimension(202, 631));

        Panel1.setBackground(new java.awt.Color(60, 60, 60));
        Panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        Inventory_Nexus.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        Inventory_Nexus.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Nexus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Nexus.setText("Inventory Nexus");
        Inventory_Nexus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inventory_Nexus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventory_NexusMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Inventory_NexusMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(Inventory_Nexus)
                .addGap(55, 55, 55))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Inventory_Nexus)
                .addContainerGap())
        );

        ViewProducts.setForeground(new java.awt.Color(255, 255, 255));
        ViewProducts.setText("View Products");
        ViewProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewProductsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewProductsMousePressed(evt);
            }
        });

        CheckInProducts.setForeground(new java.awt.Color(255, 255, 255));
        CheckInProducts.setText("Check in Products");
        CheckInProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckInProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckInProductsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckInProductsMousePressed(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setLabelFor(SidePanel);
        Logout.setText("Logout");
        Logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        ActivityHistoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        ActivityHistoryLabel.setText("Activity History");
        ActivityHistoryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActivityHistoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActivityHistoryLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ActivityHistoryLabelMousePressed(evt);
            }
        });

        CheckOutProductsLabel.setForeground(new java.awt.Color(255, 255, 255));
        CheckOutProductsLabel.setText("Check out Products");
        CheckOutProductsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckOutProductsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckOutProductsLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckOutProductsLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(46, 46, 46))
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActivityHistoryLabel)
                    .addComponent(CheckOutProductsLabel)
                    .addComponent(CheckInProducts)
                    .addComponent(ViewProducts))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(ViewProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckInProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckOutProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ActivityHistoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(24, 24, 24))
        );

        BGMain.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 200, 630));

        DesktopPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        DesktopPanel.setLayout(null);

        panel_inventory_nexus2.setBackground(new java.awt.Color(51, 51, 51));
        panel_inventory_nexus2.setForeground(new java.awt.Color(51, 51, 51));

        jPanel7.setBackground(new java.awt.Color(204, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("PT Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Products");

        TotalProd2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        TotalProd2.setForeground(new java.awt.Color(255, 255, 255));
        TotalProd2.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TotalProd2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("PT Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Check IN");

        TotalIN.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        TotalIN.setForeground(new java.awt.Color(255, 255, 255));
        TotalIN.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TotalIN)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalIN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel9.setBackground(new java.awt.Color(204, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("PT Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Check OUT");

        TotalOUT.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        TotalOUT.setForeground(new java.awt.Color(255, 255, 255));
        TotalOUT.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TotalOUT)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel7.setFont(new java.awt.Font("Sama Devanagari", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Activity");

        jLabel8.setFont(new java.awt.Font("Sama Devanagari", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 238, 238));
        jLabel8.setText("Inevntory Summary");

        jPanel10.setBackground(new java.awt.Color(106, 106, 106));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("PT Sans", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Price : ");

        TotalQtyOrdered.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalQtyOrdered)
                .addGap(56, 56, 56))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TotalQtyOrdered))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(106, 106, 106));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("PT Sans", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Top Ordered Items :");

        TopSellingItem.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TopSellingItem)
                .addGap(58, 58, 58))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TopSellingItem))
                .addContainerGap())
        );

        Title1.setBackground(new java.awt.Color(255, 255, 255));
        Title1.setFont(new java.awt.Font("PT Sans", 1, 36)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Inventory Nexus!");
        Title1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Title2.setBackground(new java.awt.Color(255, 255, 255));
        Title2.setFont(new java.awt.Font("Symbol", 0, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Welcome to");
        Title2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/inventory/abstract-blur-supermarket-department-store.jpg"))); // NOI18N

        javax.swing.GroupLayout panel_inventory_nexus2Layout = new javax.swing.GroupLayout(panel_inventory_nexus2);
        panel_inventory_nexus2.setLayout(panel_inventory_nexus2Layout);
        panel_inventory_nexus2Layout.setHorizontalGroup(
            panel_inventory_nexus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inventory_nexus2Layout.createSequentialGroup()
                .addGroup(panel_inventory_nexus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inventory_nexus2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panel_inventory_nexus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_inventory_nexus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_inventory_nexus2Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inventory_nexus2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_inventory_nexus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Title1)
                            .addComponent(Title2))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_inventory_nexus2Layout.setVerticalGroup(
            panel_inventory_nexus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inventory_nexus2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_inventory_nexus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(Title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DesktopPanel.add(panel_inventory_nexus2);
        panel_inventory_nexus2.setBounds(0, 0, 950, 590);

        BGMain.add(DesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 940, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
         // Create an instance of the WorkerLogin window
    WorkerLogin workerLoginWindow = new WorkerLogin();
    
    // Make the WorkerLogin window visible
    workerLoginWindow.setVisible(true);
    
    // Close the current WorkerHome window
    this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void UserProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMouseClicked
        WorkerProfile wp = new WorkerProfile(workername,worker);
        DesktopPanel.removeAll();
        DesktopPanel.add(wp).setVisible(true);
    }//GEN-LAST:event_UserProfileMouseClicked

    private void ViewProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewProductsMousePressed
        Menu.setText("View Products");
    }//GEN-LAST:event_ViewProductsMousePressed

    private void CheckInProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInProductsMousePressed
      Menu.setText("Check In Products");
    }//GEN-LAST:event_CheckInProductsMousePressed

    private void ViewProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewProductsMouseClicked
     ViewProducts vp = new ViewProducts();
     DesktopPanel.removeAll();
     DesktopPanel.add(vp).setVisible(true);
    }//GEN-LAST:event_ViewProductsMouseClicked

    private void CheckInProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInProductsMouseClicked
      CheckInProducts cip = new CheckInProducts();
      DesktopPanel.removeAll();
      DesktopPanel.add(cip).setVisible(true);
    }//GEN-LAST:event_CheckInProductsMouseClicked

    private void UserProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserProfileMousePressed
         Menu.setText("Worker Profile");
         
    }//GEN-LAST:event_UserProfileMousePressed

    private void ActivityHistoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivityHistoryLabelMouseClicked
    ActivityHistoryWorker ah = null;
        try {
            ah = new ActivityHistoryWorker(workername);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WorkerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
      DesktopPanel.removeAll();
      DesktopPanel.add(ah).setVisible(true);
    }//GEN-LAST:event_ActivityHistoryLabelMouseClicked

    private void ActivityHistoryLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivityHistoryLabelMousePressed
       Menu.setText("Activity History");
    }//GEN-LAST:event_ActivityHistoryLabelMousePressed

    private void CheckOutProductsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutProductsLabelMouseClicked
      CheckOutProducts cop = new CheckOutProducts();
      DesktopPanel.removeAll();
      DesktopPanel.add(cop).setVisible(true);
    }//GEN-LAST:event_CheckOutProductsLabelMouseClicked

    private void CheckOutProductsLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutProductsLabelMousePressed
        Menu.setText("Check Out Products");
    }//GEN-LAST:event_CheckOutProductsLabelMousePressed

    private void Inventory_NexusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventory_NexusMouseClicked
 WorkerHomePage whp = new WorkerHomePage();
      DesktopPanel.removeAll();
      DesktopPanel.add(whp).setVisible(true);
    }//GEN-LAST:event_Inventory_NexusMouseClicked

    private void Inventory_NexusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventory_NexusMousePressed
         Menu.setText("Home");
    }//GEN-LAST:event_Inventory_NexusMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(WorkerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new WorkerHome(workername,worker).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActivityHistoryLabel;
    private javax.swing.JPanel BGMain;
    private javax.swing.JLabel CheckInProducts;
    private javax.swing.JLabel CheckOutProductsLabel;
    private javax.swing.JDesktopPane DesktopPanel;
    private javax.swing.JLabel Inventory_Nexus;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Menu;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel TopSellingItem;
    private javax.swing.JLabel TotalIN;
    private javax.swing.JLabel TotalOUT;
    private javax.swing.JLabel TotalProd2;
    private javax.swing.JLabel TotalQtyOrdered;
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JLabel UserProfile;
    private javax.swing.JLabel ViewProducts;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel_inventory_nexus2;
    // End of variables declaration//GEN-END:variables
}
