/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package com.mycompany.inventory;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;


import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author nova
 */
public class GeneratePDF {

    public static void main(String[] args) throws FileNotFoundException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/inventory";
        String username = "root";
        String password = "root";

        String query = "SELECT * FROM products";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("products.pdf"));
            document.open();

            while (resultSet.next()) {
                int itemId = resultSet.getInt("item_id");
                String itemName = resultSet.getString("item_name");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                String expDate = resultSet.getString("exp_date");
                String companyName = resultSet.getString("Company_Name");

                // Add data to the PDF as paragraphs
                document.add(new Paragraph("Item ID: " + itemId));
                document.add(new Paragraph("Item Name: " + itemName));
                document.add(new Paragraph("Quantity: " + quantity));
                document.add(new Paragraph("Price: " + price));
                document.add(new Paragraph("Expiration Date: " + expDate));
                document.add(new Paragraph("Company Name: " + companyName));
                document.add(new Paragraph("---------------------------------------"));
            }

            document.close();
            System.out.println("PDF generated successfully.");

        } catch (SQLException | DocumentException e) {
            e.printStackTrace();
        }
    }
}