/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nova
 */
public class ViewProductsAdmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewProductsAdmin
     */
    public ViewProductsAdmin() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
         displayProducts();
    }
    
    
    private void displayProducts() {
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement("SELECT * FROM Products");
         ResultSet resultSet = statement.executeQuery()) {

        // Populate the table with data from the database
        DefaultTableModel model = (DefaultTableModel) ViewProductsTable.getModel();
        model.setRowCount(0); // Clear existing rows

        while (resultSet.next()) {
            int itemId = resultSet.getInt("item_id");
            String itemName = resultSet.getString("item_name");
            int quantity = resultSet.getInt("quantity");
            double price = resultSet.getDouble("price");
            String expDate = resultSet.getString("exp_date");
            String companyName = resultSet.getString("Company_Name");

            // Add the data to the table
            model.addRow(new Object[]{itemId, itemName, quantity, price, expDate, companyName});
        }

        // Center-align the content in the cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for (int i = 0; i < ViewProductsTable.getColumnCount(); i++) {
            ViewProductsTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

    } catch (SQLException ex) {
        // Handle any errors
        ex.printStackTrace();
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_BG = new javax.swing.JPanel();
        ViewProductsScrollPane = new javax.swing.JScrollPane();
        ViewProductsTable = new javax.swing.JTable();
        RedPanel = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();

        Main_BG.setBackground(new java.awt.Color(51, 51, 51));
        Main_BG.setPreferredSize(new java.awt.Dimension(614, 480));
        Main_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewProductsTable.setBackground(new java.awt.Color(106, 175, 243));
        ViewProductsTable.setForeground(new java.awt.Color(255, 255, 255));
        ViewProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID ", "Product Name", "Quantity", "Price", "Exp Date", "Company Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ViewProductsScrollPane.setViewportView(ViewProductsTable);

        Main_BG.add(ViewProductsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 920, 510));

        RedPanel.setBackground(new java.awt.Color(106, 175, 243));

        label1.setFont(new java.awt.Font("PT Sans", 1, 13)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("View the groceries!");

        javax.swing.GroupLayout RedPanelLayout = new javax.swing.GroupLayout(RedPanel);
        RedPanel.setLayout(RedPanelLayout);
        RedPanelLayout.setHorizontalGroup(
            RedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedPanelLayout.createSequentialGroup()
                .addContainerGap(731, Short.MAX_VALUE)
                .addComponent(label1)
                .addGap(231, 231, 231))
        );
        RedPanelLayout.setVerticalGroup(
            RedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(label1)
                .addGap(17, 17, 17))
        );

        Main_BG.add(RedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 1070, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_BG, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_BG, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_BG;
    private javax.swing.JPanel RedPanel;
    private javax.swing.JScrollPane ViewProductsScrollPane;
    private javax.swing.JTable ViewProductsTable;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
