package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbcCRUD {
public static void main(String[] args) throws Exception {
	
	//1. register driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//2. create connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "root");
	System.out.println("Connected to DB successfully!");
	
	//3. insert operation
	//create statement
//	String insertQuery = "insert into students(roll_no, name) values(? , ?)";   //if 4 col aste tar 4 "?"
//	
//	PreparedStatement ps = connection.prepareStatement(insertQuery);
//	
//	ps.setString(1, "1");        //1 - col number
//	ps.setString(2, "Sru");     //2 - col number
//	int rows = ps.executeUpdate();
//	
//	ps.setString(1, "2");
//	ps.setString(2, "Misha");
//	rows += ps.executeUpdate();    //tells how many rows are affected
//	System.out.println(rows+ "Row inserted sucessfully!");
	
		
	
	//fetch (display) records
//	String selectQuery = "select * from students";
//	Statement st = connection.createStatement();   //statement is same as preparedstatement
//	ResultSet rs = st.executeQuery(selectQuery);
//	
//	while (rs.next()) {
//		System.out.println(rs.getInt("roll_no") +" - "+ rs.getString("name"));
//	}
	
	
	//update records
//	String updateQuery = "update students set name = ? where roll_no = ?";
//	PreparedStatement ps2 = connection.prepareStatement(updateQuery);
//	ps2.setString(1, "araya");
//	ps2.setInt(2, 2);
//	
//	int updatedRows = ps2.executeUpdate();
//	System.out.println(updatedRows + " rows updated");
	
	
	//delete records
	String deleteQuery = "delete from students where name = ?";
	PreparedStatement ps3 = connection.prepareStatement(deleteQuery);
	ps3.setString(1, "araya");
	
	int deleteRows = ps3.executeUpdate();
	System.out.println(deleteRows + " rows deleted");
	

	
	connection.close();
}
}
