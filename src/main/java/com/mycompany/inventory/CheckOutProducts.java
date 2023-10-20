/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nova
 */
public class CheckOutProducts extends javax.swing.JInternalFrame {

    /**
     * Creates new form CheckOutProducts
     */
    public CheckOutProducts() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        model = (DefaultTableModel) CheckOutProductsTable.getModel();
        updateTable(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckOutProductsScrollPane = new javax.swing.JScrollPane();
        CheckOutProductsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        PILabel = new javax.swing.JLabel();
        CheckOutButton = new javax.swing.JButton();
        PITF = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        QTYTORemoveTF = new javax.swing.JTextField();
        QtyToremoveLabel = new javax.swing.JLabel();
        WNTF = new javax.swing.JTextField();
        WorkerNamelabel = new javax.swing.JLabel();
        DateTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        CheckOutProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Worker Name", "Amount Removed", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CheckOutProductsScrollPane.setViewportView(CheckOutProductsTable);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        DateLabel.setFont(new java.awt.Font("Sama Devanagari", 0, 13)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel.setText("Date (yyyy-mm-dd):");

        PILabel.setFont(new java.awt.Font("Sama Devanagari", 0, 13)); // NOI18N
        PILabel.setForeground(new java.awt.Color(255, 255, 255));
        PILabel.setText("Product ID :");

        CheckOutButton.setText("Check Out");
        CheckOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckOutButtonMouseClicked(evt);
            }
        });
        CheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutButtonActionPerformed(evt);
            }
        });

        PITF.setText("Enter ID here");

        ClearButton.setText("Clear");
        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        QTYTORemoveTF.setText("Enter qty here\n");
        QTYTORemoveTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTYTORemoveTFActionPerformed(evt);
            }
        });

        QtyToremoveLabel.setFont(new java.awt.Font("Sama Devanagari", 0, 13)); // NOI18N
        QtyToremoveLabel.setForeground(new java.awt.Color(255, 255, 255));
        QtyToremoveLabel.setText("Quantity to Remove :");

        WNTF.setText("Enter your name here");
        WNTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WNTFActionPerformed(evt);
            }
        });

        WorkerNamelabel.setFont(new java.awt.Font("Sama Devanagari", 0, 13)); // NOI18N
        WorkerNamelabel.setForeground(new java.awt.Color(255, 255, 255));
        WorkerNamelabel.setText("Worker Name :");

        DateTF.setText("Enter date of checkout");
        DateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTFActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(QtyToremoveLabel)
                                .addComponent(PILabel)
                                .addComponent(WorkerNamelabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(WNTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PITF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QTYTORemoveTF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(CheckOutButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClearButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PILabel)
                    .addComponent(PITF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QtyToremoveLabel)
                    .addComponent(QTYTORemoveTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WorkerNamelabel)
                    .addComponent(WNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel)
                    .addComponent(DateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckOutButton)
                    .addComponent(ClearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CheckOutProductsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CheckOutProductsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOutButtonMouseClicked
       int productId, quantityToRemove;
        String date;
              String workerName;

        try {
            productId = Integer.parseInt(PITF.getText());
            quantityToRemove = Integer.parseInt(QTYTORemoveTF.getText());
            workerName = WNTF.getText();
            date = DateTF.getText();

            updateDatabase(productId, quantityToRemove, workerName, date);

            PITF.setText("");
            QTYTORemoveTF.setText("");
             WNTF.setText("");
            DateTF.setText("");

            updateTable(model);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numbers.");
        }
    }//GEN-LAST:event_CheckOutButtonMouseClicked
private void updateTable(DefaultTableModel model) {
    model.setRowCount(0); // Clear the table
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "ilovenova");
        PreparedStatement st = connection.prepareStatement(
                "SELECT Products.item_id, Products.item_name, Products.quantity, CheckOuts.worker_name, CheckOuts.amount_removed, CheckOuts.checkout_date " +
                        "FROM Products " +
                        "LEFT JOIN CheckOuts ON Products.item_id = CheckOuts.item_id"
        );
        var rs = st.executeQuery();
        while (rs.next()) {
          model.addRow(new Object[]{
                        rs.getInt("item_id"),
                        rs.getString("item_name"),
                        rs.getInt("quantity"),
                        rs.getString("worker_name"),
                        rs.getInt("amount_removed"),
                        rs.getString("checkout_date")
                });
            }
        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Handle database error (e.g., show error message)
    }
}



private void updateDatabase(int productId, int quantityToRemove, String workerName,String date) {
    String jdbcURL = "jdbc:mysql://localhost:3306/inventory";
    String username = "root";
    String password = "ilovenova";
    Connection connection = null;

    try {
        connection = DriverManager.getConnection(jdbcURL, username, password);
        connection.setAutoCommit(false);

        String checkOutsSql = "INSERT INTO CheckOuts (item_id, worker_name, amount_removed, checkout_date) VALUES (?, ?, ?, ?)";
        try (PreparedStatement checkOutsStatement = connection.prepareStatement(checkOutsSql)) {
            checkOutsStatement.setInt(1, productId);
            checkOutsStatement.setString(2, workerName);
            checkOutsStatement.setInt(3, quantityToRemove);
            checkOutsStatement.setString(4, date);
            checkOutsStatement.executeUpdate();
        }

        String productsSql = "UPDATE Products SET quantity = quantity - ? WHERE item_id = ?";
        try (PreparedStatement productsStatement = connection.prepareStatement(productsSql)) {
            productsStatement.setInt(1, quantityToRemove);
            productsStatement.setInt(2, productId);
            productsStatement.executeUpdate();
        }

        connection.commit();
        connection.setAutoCommit(true);

        JOptionPane.showMessageDialog(this, "Check-out successful!");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        try {
            if (connection != null) {
                connection.rollback();
                connection.setAutoCommit(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } finally {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        int[] selectedRows = CheckOutProductsTable.getSelectedRows();

        for (int i = selectedRows.length - 1; i >= 0; i--) {
            model.removeRow(selectedRows[i]);
        }
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void QTYTORemoveTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QTYTORemoveTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QTYTORemoveTFActionPerformed

    private void WNTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WNTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WNTFActionPerformed

    private void DateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTFActionPerformed

    }//GEN-LAST:event_DateTFActionPerformed

    private void CheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckOutButtonActionPerformed
private DefaultTableModel model;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckOutButton;
    private javax.swing.JScrollPane CheckOutProductsScrollPane;
    private javax.swing.JTable CheckOutProductsTable;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField DateTF;
    private javax.swing.JLabel PILabel;
    private javax.swing.JTextField PITF;
    private javax.swing.JTextField QTYTORemoveTF;
    private javax.swing.JLabel QtyToremoveLabel;
    private javax.swing.JTextField WNTF;
    private javax.swing.JLabel WorkerNamelabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}