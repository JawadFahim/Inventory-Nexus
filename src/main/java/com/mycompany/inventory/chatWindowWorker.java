/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.inventory;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class chatWindowWorker extends javax.swing.JInternalFrame {

    /**
     * Creates new form chatWindowWorker
     */
     String sender;
    public chatWindowWorker(String sender) {
        this.sender = sender;
        initComponents();
        loadChatMessages();
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChatTextArea = new javax.swing.JTextArea();

        setTitle("Chat Window worker");

        jTextField1.setBackground(new java.awt.Color(204, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText(" ");

        jLabel1.setText("SEND");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        ChatTextArea.setEditable(false);
        ChatTextArea.setBackground(new java.awt.Color(51, 51, 51));
        ChatTextArea.setColumns(20);
        ChatTextArea.setForeground(new java.awt.Color(255, 255, 255));
        ChatTextArea.setRows(5);
        jScrollPane1.setViewportView(ChatTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
   sendMessage();
    }//GEN-LAST:event_jLabel1MouseClicked
   void sendMessage() {
        String message = jTextField1.getText().trim();
        if (!message.isEmpty()) {
            saveMessageToDatabase(sender, message);
            jTextField1.setText("");
             Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        ChatTextArea.append(sender + " (" + currentTimestamp + "): " + message + "\n");
            //ChatTextArea.append(sender+": " + message + "\n");
        }
    }

    void saveMessageToDatabase(String sender, String message) {
        try {
        Connection connection = DatabaseConnection.getConnection();
        String query = "INSERT INTO chat_messages (sender, message, timestamp) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, sender);
        preparedStatement.setString(2, message);
        preparedStatement.setTimestamp(3, new Timestamp(System.currentTimeMillis())); // Set the timestamp
        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving message to the database.");
    }
    }

    private void loadChatMessages() {
        try {
        Connection connection = DatabaseConnection.getConnection();
        String query = "SELECT sender, message, timestamp FROM chat_messages";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Clear the existing text
        ChatTextArea.setText("");

        while (resultSet.next()) {
            String sender = resultSet.getString("sender");
            String message = resultSet.getString("message");
            Timestamp timestamp = resultSet.getTimestamp("timestamp");

            ChatTextArea.append(sender + " (" + timestamp + "): " + message + "\n");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading chat messages from the database.");
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ChatTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
