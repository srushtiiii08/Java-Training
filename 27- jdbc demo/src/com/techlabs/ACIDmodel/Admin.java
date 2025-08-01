package com.techlabs.ACIDmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Admin {
    Connection connection;
    Scanner sc;

    public Admin(Connection connection, Scanner sc) {
        this.connection = connection;
        this.sc = sc;
    }

    public void start() {
        System.out.print("Enter Admin Username: ");
        String username = sc.nextLine().trim();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM admins WHERE username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                System.out.println("Admin logged in successfully.");
                adminMenu();
            } else {
                System.out.println("Invalid Admin username!");
            }
        } catch (SQLException e) {
            System.out.println("Error during admin login: " + e.getMessage());
        }
    }

    
    private void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Edit Account Name");
            System.out.println("4. Freeze/Unfreeze Account");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Show Specific Account History");
            System.out.println("7. Logout");
            System.out.println("Choose an option: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter valid number.");
                continue;
            }

            if (choice == 1) 
            	createAccount();
            else if (choice == 2) 
            	deleteAccount();
            else if (choice == 3) 
            	editAccount();
            else if (choice == 4) 
            	freezeUnfreezeAccount();
            else if (choice == 5) 
            	showAllAccounts();
            else if (choice == 6) 
            	showAccountHistory();
            else if (choice == 7) {
                System.out.println("Admin logged out.");
                break;
                
            } else 
            	System.out.println("Invalid choice!");
        }
    }

    
    //1
    private void createAccount() {
        int accId;
        while (true) {
            System.out.print("Enter an account ID: ");
            
            try {
                accId = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer Account ID.");
                continue;
            }
            
            try {
                PreparedStatement ps = connection.prepareStatement("SELECT id FROM transactions WHERE id=?");
                ps.setInt(1, accId);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    System.out.println("Account ID already exists. Please choose another.");
                } else break;
            } catch (SQLException e) {
                System.out.println("Error checking account ID: " + e.getMessage());
                return;
            }
        }
        
        System.out.print("Enter account holder's name: ");
        String accName = sc.nextLine().trim();

        int openingBalance = 0;
        while (true) {
        	System.out.print("Enter opening balance (must be > 0): ");
            String balInput = sc.nextLine().trim();
            try {
                openingBalance = Integer.parseInt(balInput);
                
                if (openingBalance > 0) {
                    break;
                } else {
                    System.out.println("Opening balance must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid amount ");
            }
        }
        
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO transactions(id, name, balance_amount, is_frozen) VALUES (?, ?, ?, FALSE)");
            ps.setInt(1, accId);
            ps.setString(2, accName);
            ps.setInt(3, openingBalance);
            
            int rows = ps.executeUpdate();
            
            if (rows == 0) {
            	System.out.println("Account creation failed.");
            }
            else {
            	System.out.println("Account created successfully!! Account ID: " + accId);
            }
            
        } catch (SQLException e) {
            System.out.println("Error creating account: " + e.getMessage());
        }
    }

    
    //2
    private void deleteAccount() {
        System.out.print("Enter Account ID: ");
        int accId;
        
        try {
            accId = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid account ID!");
            return;
        }
        
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM transactions WHERE id=?");
            ps.setInt(1, accId);
            int rows = ps.executeUpdate();
            
            if (rows > 0) {
                System.out.println("Account deleted successfully.");
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting account: " + e.getMessage());
        }
    }

    
    //3
    private void editAccount() {
        System.out.print("Enter Account ID: ");
        int accId;
        
        try {
            accId = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid account ID.");
            return;
        }
        
        System.out.print("Enter the account holder's new name: ");
        String newName = sc.nextLine().trim();
        
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE transactions SET name=? WHERE id=?");
            ps.setString(1, newName);
            ps.setInt(2, accId);
            int rows = ps.executeUpdate();
            
            if (rows > 0) 
            	System.out.println("Account name updated successfully!!");
            else 
            	System.out.println("Account not found!");
            
        } catch (SQLException e) {
            System.out.println("Error editing account: " + e.getMessage());
        }
    }

    
    
    //4
    private void freezeUnfreezeAccount() {
        System.out.print("Enter Account ID to freeze/unfreeze: ");
        int accId;
        
        try {
            accId = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid account ID.");
            return;
        }
        
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT is_frozen FROM transactions WHERE id=?");
            ps.setInt(1, accId);
            ResultSet rs = ps.executeQuery();
            
            if (!rs.next()) {
                System.out.println("Account not found.");
                return;
            }
            
            boolean frozen = rs.getBoolean("is_frozen");
            boolean newStatus = !frozen;    //toggles the opposite
            
            PreparedStatement ps2 = connection.prepareStatement("UPDATE transactions SET is_frozen=? WHERE id=?");
            ps2.setBoolean(1, newStatus);
            ps2.setInt(2, accId);
            int rows = ps2.executeUpdate();
            
            if (rows > 0) {
            	System.out.println("Account " + (newStatus ? "frozen" : "unfrozen") + " successfully.");
            } else {
            	System.out.println("Could not update freeze status.");
            }
            
        } catch (SQLException e) {
            System.out.println("Error updating freeze status: " + e.getMessage());
        }
    }

    
    
    //5
    private void showAllAccounts() {
        
    	try {
            Statement st = connection.createStatement();       //creates a new statement instance
            ResultSet rs = st.executeQuery("SELECT * FROM transactions");
            								
            						   //for left justified we use '-', for right we dont usse anything
            System.out.printf("%-10s %-20s %-15s %-10s\n", "AccountID", "Name", "Balance", "Frozen");
            
            while (rs.next()) {
                System.out.printf("%-10d %-20s %-15d %-10s\n", rs.getInt("id"),
                        rs.getString("name"), rs.getInt("balance_amount"),
                        rs.getBoolean("is_frozen") ? "Yes" : "No");    //yes if 1 & no if 0
            }
        } catch (SQLException e) {
            System.out.println("Error fetching accounts: " + e.getMessage());
        }
    }

    
    
    //6
    private void showAccountHistory() {
        System.out.print("Enter Account ID: ");
        int accId;
        
        try {
            accId = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid account ID!");
            return;
        }
        
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT id, type, amount, timestamp, details FROM transaction_history WHERE account_id=? ORDER BY timestamp DESC");
            ps.setInt(1, accId);
            ResultSet rs = ps.executeQuery();
            				
            							//words are left justified 
            System.out.printf("%-10s %-15s %-10s %-20s %-30s\n", "TransID", "Type", "Amount", "Timestamp", "Details");
            
            while (rs.next()) {
                System.out.printf("%-10d %-15s %-10d %-20s %-30s\n", rs.getInt("id"),
                        rs.getString("type"), rs.getInt("amount"), rs.getTimestamp("timestamp"),
                        rs.getString("details"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error fetching transaction history: " + e.getMessage());
        }
    }
}
