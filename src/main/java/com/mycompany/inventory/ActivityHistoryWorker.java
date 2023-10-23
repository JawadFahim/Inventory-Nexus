/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.inventory;





import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.UnitValue;

import javax.swing.JFileChooser;
import java.io.File;
 import com.itextpdf.kernel.pdf.PdfWriter;
        import com.itextpdf.layout.Document;
        import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.element.Table;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;


import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author nova
 */
public class ActivityHistoryWorker extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActivityHistory
     */
 
           private DefaultTableModel model;
    private boolean checkinSelected = false;
    private boolean checkoutSelected = false;
    private String workername;

       
       public ActivityHistoryWorker(String workername) throws FileNotFoundException {
       this.workername = workername;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);

        // Initialize the model object
        model = new DefaultTableModel();
        // Set the table model
        Table.setModel(model);

       
       
    
    }
       
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CHECKcombo = new javax.swing.JComboBox<>();
        RedPanle = new javax.swing.JPanel();
        BLackPanel = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        CheckinTick = new javax.swing.JRadioButton();
        CheckOUTtick = new javax.swing.JRadioButton();
        print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        CHECKcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Check IN", "CheckOUT" }));
        CHECKcombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CHECKcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHECKcomboMouseClicked(evt);
            }
        });

        RedPanle.setBackground(new java.awt.Color(204, 0, 0));
        RedPanle.setForeground(new java.awt.Color(204, 0, 0));

        BLackPanel.setBackground(new java.awt.Color(51, 51, 51));

        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Please select any history you want to view");

        CheckinTick.setForeground(new java.awt.Color(255, 255, 255));
        CheckinTick.setText("Check IN ");
        CheckinTick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckinTick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckinTickMouseClicked(evt);
            }
        });
        CheckinTick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckinTickActionPerformed(evt);
            }
        });

        CheckOUTtick.setForeground(new java.awt.Color(255, 255, 255));
        CheckOUTtick.setText("Check OUT");
        CheckOUTtick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckOUTtick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckOUTtickMouseClicked(evt);
            }
        });
        CheckOUTtick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOUTtickActionPerformed(evt);
            }
        });

        print.setText("Print record");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BLackPanelLayout = new javax.swing.GroupLayout(BLackPanel);
        BLackPanel.setLayout(BLackPanelLayout);
        BLackPanelLayout.setHorizontalGroup(
            BLackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLackPanelLayout.createSequentialGroup()
                .addGroup(BLackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BLackPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(BLackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckOUTtick)
                            .addComponent(CheckinTick)
                            .addComponent(Label)))
                    .addGroup(BLackPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(print)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        BLackPanelLayout.setVerticalGroup(
            BLackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLackPanelLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(Label)
                .addGap(41, 41, 41)
                .addComponent(CheckinTick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckOUTtick)
                .addGap(59, 59, 59)
                .addComponent(print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "jn", "null", "null", "null", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout RedPanleLayout = new javax.swing.GroupLayout(RedPanle);
        RedPanle.setLayout(RedPanleLayout);
        RedPanleLayout.setHorizontalGroup(
            RedPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedPanleLayout.createSequentialGroup()
                .addComponent(BLackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
        );
        RedPanleLayout.setVerticalGroup(
            RedPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BLackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RedPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RedPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHECKcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHECKcomboMouseClicked
      
    }//GEN-LAST:event_CHECKcomboMouseClicked

  
  
  
    private void CheckinTickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckinTickActionPerformed
        if (CheckinTick.isSelected()) {
        CheckOUTtick.setSelected(false);
        checkinSelected = true;
        checkoutSelected = false;
        loadCheckInData();
    }
    }//GEN-LAST:event_CheckinTickActionPerformed

    private void CheckOUTtickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOUTtickActionPerformed
     if (CheckOUTtick.isSelected()) {
        CheckinTick.setSelected(false);
        checkoutSelected = true;
        checkinSelected = false;
        loadCheckOutData();
    }
    }//GEN-LAST:event_CheckOUTtickActionPerformed
  private void loadCheckInData() {
        clearTable(); // Clear existing data in the table
  model.setColumnIdentifiers(new Object[]{"Check IN ID", "Item ID", "Worker Name", "Amount Added", "Check IN Date"});

    
        String jdbcURL = "jdbc:mysql://localhost:3306/inventory";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String query = "SELECT * FROM checkins where worker_name = '"+workername+"'";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    // Retrieve data from the result set
                     int checkinId = resultSet.getInt("checkin_id");
                    int itemId = resultSet.getInt("item_id");
                    String workerName = resultSet.getString("worker_name");
                    int amountAdded = resultSet.getInt("amount_added");
                    String checkInDate = resultSet.getString("checkin_date");
                    // Add data to the table model
                    model.addRow(new Object[]{checkinId, itemId, workerName, amountAdded, checkInDate});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions (log them, show error message, etc.)
        }
    }
  
  
  
private void loadCheckOutData() {
    clearTable(); // Clear existing data in the table
model.setColumnIdentifiers(new Object[]{"Check OUT ID", "Item ID", "Worker Name", "Amount Removed", "Check OUT Date"});
    String jdbcURL = "jdbc:mysql://localhost:3306/inventory";
    String username = "root";
    String password = "root";

    try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
        String query = "SELECT * FROM checkouts where worker_name = '"+workername+"'";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int checkoutId = resultSet.getInt("checkout_id");
                int itemId = resultSet.getInt("item_id");
                String workerName = resultSet.getString("worker_name");
                int amountRemoved = resultSet.getInt("amount_removed");
                String checkoutDate = resultSet.getString("checkout_date");

                // Add data to the table model
                model.addRow(new Object[]{checkoutId, itemId, workerName, amountRemoved, checkoutDate});
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle exceptions (log them, show error message, etc.)
    }
}


    private void clearTable() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
    private void CheckOUTtickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckOUTtickMouseClicked
       
    }//GEN-LAST:event_CheckOUTtickMouseClicked

    private void CheckinTickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckinTickMouseClicked
      
    }//GEN-LAST:event_CheckinTickMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");
            int userSelection = fileChooser.showSaveDialog(this);
    
            if (userSelection != JFileChooser.APPROVE_OPTION) {
                return;
            }
    
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
    
            // Create a PdfWriter
            PdfWriter writer = new PdfWriter(filePath);
    
            // Initialize PDF document
            PdfDocument pdf = new PdfDocument(writer);
    
            // Initialize document
            Document document = new Document(pdf);
    
                Paragraph invoice = new Paragraph("Invoice");
                   
                document.add(invoice);
            
            
            Table table = new Table(model.getColumnCount());
            
            // Adding column names to the table
            for (int i = 0; i < model.getColumnCount(); i++) {
                table.addCell(new Cell().add(new Paragraph(model.getColumnName(i))));
            }
    
            // Adding data to the table
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object obj = model.getValueAt(i, j);
                    String data = (obj == null) ? "" : obj.toString();
                    table.addCell(new Cell().add(new Paragraph(data)));
                }
            }
    
            // Adding the table to the document
            document.add(table);
             LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
            document.add(new Paragraph("Invoice generated on: " + formatDateTime));
    
            // Close the document
            document.close();
            JOptionPane.showMessageDialog(this, "PDF has been created successfully.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }      catch (IOException ex) {
                   Logger.getLogger(ActivityHistoryWorker.class.getName()).log(Level.SEVERE, null, ex);
               }
         
    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BLackPanel;
    private javax.swing.JComboBox<String> CHECKcombo;
    private javax.swing.JRadioButton CheckOUTtick;
    private javax.swing.JRadioButton CheckinTick;
    private javax.swing.JLabel Label;
    private javax.swing.JPanel RedPanle;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
