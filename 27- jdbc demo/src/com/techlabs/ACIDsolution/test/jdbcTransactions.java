package com.techlabs.ACIDsolution.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTransactions {
public static void main(String[] args) throws Exception {
	
	//1. register driver
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	//2. create connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "root");
	System.out.println("Connected to DB successfully!");
	
	//3. insert operation
	//create statement
	String insertQuery = "insert into transactions(id, name, balance_amount) values (?, ?, ?)";
	PreparedStatement ps = connection.prepareStatement(insertQuery);
	
//	ps.setString(1, "1");         //1 - col number
//	ps.setString(2, "Srushti");    //2 - col number
//	ps.setString(3, "7000");		//3 - col number
//	int rows = ps.executeUpdate();     //tells how many rows are affected

//	ps.setString(1, "2");
//	ps.setString(2, "Krisha");
//	ps.setString(3, "3000");
//	int rows = ps.executeUpdate();    //tells how many rows are affected
//	
//	ps.setString(1, "3");
//	ps.setString(2, "Araya");
//	ps.setString(3, "2000");
//	rows += ps.executeUpdate();
//	System.out.println(rows+ "Row inserted sucessfully!");
	
	
//	ps.setString(1, "4");
//	ps.setString(2, "ruchira");
//	ps.setString(3, "22000");
//	int rows = ps.executeUpdate();
//	System.out.println(rows+ "Row inserted sucessfully!");
//	
//	
//	ps.setString(1, "5");
//	ps.setString(2, "Kavya");
//	ps.setString(3, "740");
//	rows += ps.executeUpdate();
//	System.out.println(rows+ "Row inserted sucessfully!");
//	
//	ps.setString(1, "6");
//	ps.setString(2, "Shrinitya");
//	ps.setString(3, "9000");
//	rows += ps.executeUpdate();
//	System.out.println(rows+ "Row inserted sucessfully!");
//	
//	
//	ps.setString(1, "7");
//	ps.setString(2, "Aditi");
//	ps.setString(3, "10000");
//	rows += ps.executeUpdate();
//	System.out.println(rows+ "Row inserted sucessfully!");
//	
//	
//	ps.setString(1, "8");
//	ps.setString(2, "vaishnavi");
//	ps.setString(3, "9000");
//	rows += ps.executeUpdate();
//	System.out.println(rows+ "Row inserted sucessfully!");
//	
//	
//	ps.setString(1, "9");
//	ps.setString(2, "Varada");
//	ps.setString(3, "9600");
//	rows += ps.executeUpdate();
//	System.out.println(rows+ "Row inserted sucessfully!");
	
		
	// Update records (Change Name)
//    String updateQuery = "Update transactions SET name = ? WHERE id = ?";
//    PreparedStatement ps2 = connection.prepareStatement(updateQuery);
//    ps2.setString(1, "Ruchira");
//    ps2.setInt(2, 2);
//    
//    int updatedRows = ps2.executeUpdate();
//	System.out.println(updatedRows + " rows updated");

	
	//Delete records
//	String deleteQuery = "delete from transactions where id = ?";
//	PreparedStatement ps3 = connection.prepareStatement(deleteQuery);
//	ps3.setInt(1, 3);
//	
//	int deleteRows = ps3.executeUpdate();
//	System.out.println(deleteRows + " rows deleted");
	
	
	// transfer koney from srushti to ruchira
//    int senderId = 1, receiverId = 2;      //srushti id = 1, ruchira id = 2
//    int transferAmount = 2000;
//
//    try {
//        connection.setAutoCommit(false);   // Begin Transaction
//
//        // Get sender balance
//        String senderBalQuery = "select balance_amount from transactions WHERE id = ?";
//        PreparedStatement psBal = connection.prepareStatement(senderBalQuery);
//        psBal.setInt(1, senderId);
//        ResultSet rsSender = psBal.executeQuery();
//
//        int senderBal = 0;
//        if (rsSender.next()) {
//            senderBal = rsSender.getInt("balance_amount");
//        } else {
//            throw new SQLException("Sender does not exist.");
//        }
//
//        if (senderBal < transferAmount) {
//            throw new SQLException("Insufficient balance to transfer.");
//        }
//
//        // Deduct amount from sender
//        String withdrawQuery = "update transactions set balance_amount = balance_amount - ? WHERE id = ?";
//        PreparedStatement psWithdraw = connection.prepareStatement(withdrawQuery);
//        psWithdraw.setInt(1, transferAmount);
//        psWithdraw.setInt(2, senderId);
//        psWithdraw.executeUpdate();
//
//        // Add amount to receiver acc
//        String depositQuery = "update transactions set balance_amount = balance_amount + ? WHERE id = ?";
//        PreparedStatement psDeposit = connection.prepareStatement(depositQuery);
//        psDeposit.setInt(1, transferAmount);
//        psDeposit.setInt(2, receiverId);
//        int rows1 = psDeposit.executeUpdate();
//        if (rows1 == 0) throw new SQLException("Receiver does not exist.");
//
//        connection.commit();
//        System.out.println("Transfer Success!");
//
//    } catch (Exception e) {
//        connection.rollback();
//        System.out.println("Transfer Failed: " + e.getMessage());
//    } finally {
//        connection.setAutoCommit(true);
//    }
//    
    
  //fetch (display) records
	String selectQuery = "select * from transactions";
	Statement st = connection.createStatement();   
	ResultSet rs = st.executeQuery(selectQuery);
	
	System.out.println("\nID\t| Name\t\t| Balance");
	System.out.println("___________________________________");
	while (rs.next()) {
		System.out.println(rs.getInt("id") +"\t| "+ rs.getString("name") +"\t| "+ rs.getInt("balance_amount"));
	}
	System.out.println("___________________________________");
	
}
}
