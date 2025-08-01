package com.techlabs.ACIDsolution.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcTransactionRefactored {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
	//1. register driver
	Class.forName("com.mysql.cj.jdbc.Driver");
				
	//2. create connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "root");
	Scanner sc = new Scanner(System.in);
		
	try {
		int choice = -1;
        while (choice != 9) {
        	System.out.println("\n--- BANK ACCOUNT MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Inactive Account");
            System.out.println("6. Check Balance");
            System.out.println("7. Show specific Transaction History");
            System.out.println("8. Show All Accounts");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            String choiceInput = sc.nextLine();
            try {
            	choice = Integer.parseInt(choiceInput.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer option.");
                continue;
            }
            
            if (choice == 1) {
                createAccount(connection, sc);
            } else if (choice == 2) {
                depositMoney(connection, sc);
            } else if (choice == 3) {
                withdrawMoney(connection, sc);
            } else if (choice == 4) {
                transferMoney(connection, sc);
            } else if (choice == 5) {
                deleteAccount(connection, sc);
            } else if (choice == 6) {
                checkBalance(connection, sc);
            } else if (choice == 7) {
                showTransactionHistory(connection, sc);
            } else if (choice == 8) {
                showAllAccounts(connection);
            } else if (choice == 9) {
                System.out.println("Exiting.. Goodbye!");
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
	} 
	finally {
        if (connection != null) 
        	try { connection.close(); } catch (SQLException ignored) {}
        if (sc != null) sc.close();
    }
}


//1
private static void createAccount(Connection connection, Scanner sc) {
	Integer newId = null;
    System.out.print("Enter new Account ID (integer): ");
    while (newId == null) {
        String input = sc.nextLine();
        try {
            newId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer for Account ID: ");
        }
    }
    
    //Check if account exists
    try (PreparedStatement ps = connection.prepareStatement("SELECT 1 FROM transactions WHERE id = ?")) {
        ps.setInt(1, newId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                System.out.println("Account ID already exists. Please choose a different ID.");
                return;
            }
        }
    } catch (SQLException e) {
        System.out.println("Error checking account existence: " + e.getMessage());
        return;
    }
    
    System.out.print("Enter Account Holder Name: ");
    String newName = sc.nextLine();

    Integer openingBal = null;
    System.out.print("Enter Opening Balance (positive integer): ");
    while (openingBal == null) {
        String input = sc.nextLine();
        try {
            openingBal = Integer.parseInt(input.trim());
            if (openingBal <= 0) {
                System.out.print("Balance must be a positive number greater than 0. Enter again: ");
                openingBal = null;
            }
        } catch (NumberFormatException e) {
            System.out.print("Invalid balance! Enter a valid integer: ");
        }
    }
    
    try (PreparedStatement ps = connection.prepareStatement(
            "INSERT INTO transactions (id, name, balance_amount) VALUES (?, ?, ?)")) {
        ps.setInt(1, newId);
        ps.setString(2, newName);
        ps.setInt(3, openingBal);
        ps.executeUpdate();
        System.out.println("Account created successfully!");

        if (openingBal > 0) {
            try (PreparedStatement ps2 = connection.prepareStatement(
                    "INSERT INTO transaction_history (account_id, type, amount, details) VALUES (?, 'DEPOSIT', ?, 'Account Opening')")) {
                ps2.setInt(1, newId);
                ps2.setInt(2, openingBal);
                ps2.executeUpdate();
            }
        }
    } catch (SQLException e) {
        System.out.println("Error creating account: " + e.getMessage());
    }
}



//2
private static void depositMoney(Connection connection, Scanner sc) {
	Integer depoId = null;
    System.out.print("Enter Account ID to deposit into: ");
    while (depoId == null) {
        String input = sc.nextLine();
        try {
            depoId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer: ");
        }
    }

    try (PreparedStatement ps = connection.prepareStatement("SELECT 1 FROM transactions WHERE id = ?")) {
        ps.setInt(1, depoId);
        try (ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) {
                System.out.println("Account does not exist.");
                return;
            }
        }
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
        return;
    }
    
    Integer depoAmt = null;
    System.out.print("Enter Amount to deposit (positive integer): ");
    while (depoAmt == null) {
        String input = sc.nextLine();
        try {
            depoAmt = Integer.parseInt(input.trim());
            if (depoAmt <= 0) {
                System.out.print("Amount must be positive. Enter again: ");
                depoAmt = null;
            }
        } catch (NumberFormatException e) {
            System.out.print("Invalid amount! Enter a positive integer: ");
        }
    }
    
    try (PreparedStatement psUpdate = connection.prepareStatement(
            "UPDATE transactions SET balance_amount = balance_amount + ? WHERE id = ?")) {
        psUpdate.setInt(1, depoAmt);
        psUpdate.setInt(2, depoId);
        psUpdate.executeUpdate();

        try (PreparedStatement psHist = connection.prepareStatement(
                "INSERT INTO transaction_history (account_id, type, amount, details) VALUES (?, 'DEPOSIT', ?, '')")) {
            psHist.setInt(1, depoId);
            psHist.setInt(2, depoAmt);
            psHist.executeUpdate();
        }
        System.out.println("Deposit successful!");
    } catch (SQLException e) {
        System.out.println("Error making deposit: " + e.getMessage());
    }
}



//3
private static void withdrawMoney(Connection connection, Scanner sc) {
	Integer wId = null;
    System.out.print("Enter Account ID to withdraw from: ");
    while (wId == null) {
        String input = sc.nextLine();
        try {
            wId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer: ");
        }
    }
    
    Integer balance = null;
    try (PreparedStatement ps = connection.prepareStatement("SELECT balance_amount FROM transactions WHERE id = ?")) {
        ps.setInt(1, wId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                balance = rs.getInt(1);
            } else {
                System.out.println("Account does not exist.");
                return;
            }
        }
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
        return;
    }
    
    Integer wAmt = null;
    System.out.print("Enter Amount to withdraw (positive integer): ");
    while (wAmt == null) {
        String input = sc.nextLine();
        try {
            wAmt = Integer.parseInt(input.trim());
            if (wAmt <= 0) {
                System.out.print("Amount must be positive. Enter again: ");
                wAmt = null;
            } else if (wAmt > balance) {
                System.out.print("Insufficient balance. Enter smaller amount: ");
                wAmt = null;
            }
        } catch (NumberFormatException e) {
            System.out.print("Invalid amount! Enter a positive integer: ");
        }
    }
    
    try (PreparedStatement psUpdate = connection.prepareStatement(
            "UPDATE transactions SET balance_amount = balance_amount - ? WHERE id = ?")) {
        psUpdate.setInt(1, wAmt);
        psUpdate.setInt(2, wId);
        psUpdate.executeUpdate();

        try (PreparedStatement psHist = connection.prepareStatement(
                "INSERT INTO transaction_history (account_id, type, amount, details) VALUES (?, 'WITHDRAW', ?, '')")) {
            psHist.setInt(1, wId);
            psHist.setInt(2, wAmt);
            psHist.executeUpdate();
        }
        System.out.println("Withdrawal successful!");
    } catch (SQLException e) {
        System.out.println("Error making withdrawal: " + e.getMessage());
    }
}



//4
private static void transferMoney(Connection connection, Scanner sc) {
	Integer senderId = null, recieverId = null;
    System.out.print("Enter Sender Account ID: ");
    while (senderId == null) {
        String input = sc.nextLine();
        try {
        	senderId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer: ");
        }
    }
    System.out.print("Enter Receiver Account ID: ");
    while (recieverId == null) {
        String input = sc.nextLine();
        try {
        	recieverId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer: ");
        }
    }
    
    if (senderId.equals(recieverId)) {
        System.out.println("Cannot transfer to the same account.");
        return;
    }

    Integer senderBal = null;
    boolean senderExists = false;
    boolean recieverExists = false;

    try (PreparedStatement ps = connection.prepareStatement("SELECT balance_amount FROM transactions WHERE id = ?")) {
        ps.setInt(1, senderId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
            	senderExists = true;
                senderBal = rs.getInt("balance_amount");
            }
        }
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
        return;
    }
    
    try (PreparedStatement ps = connection.prepareStatement("SELECT 1 FROM transactions WHERE id = ?")) {
        ps.setInt(1, recieverId);
        try (ResultSet rs = ps.executeQuery()) {
        	recieverExists = rs.next();
        }
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
        return;
    }

    if (!senderExists || !recieverExists) {
        System.out.println("Sender or receiver account does not exist.");
        return;
    }

    Integer transferAmt = null;
    System.out.print("Enter Amount to transfer (positive integer): ");
    while (transferAmt == null) {
        String input = sc.nextLine();
        try {
        	transferAmt = Integer.parseInt(input.trim());
            if (transferAmt <= 0) {
                System.out.print("Amount must be positive. Enter again: ");
                transferAmt = null;
            } else if (senderBal != null && transferAmt > senderBal) {
                System.out.print("Insufficient balance. Enter smaller amount: ");
                transferAmt = null;
            }
        } catch (NumberFormatException e) {
            System.out.print("Invalid amount! Enter a positive integer: ");
        }
    }

    try {
    	connection.setAutoCommit(false);
        try (PreparedStatement ps1 = connection.prepareStatement(
                "UPDATE transactions SET balance_amount = balance_amount - ? WHERE id = ?")) {
            ps1.setInt(1, transferAmt);
            ps1.setInt(2, senderId);
            ps1.executeUpdate();
        }
        
        try (PreparedStatement ps2 = connection.prepareStatement(
                "UPDATE transactions SET balance_amount = balance_amount + ? WHERE id = ?")) {
            ps2.setInt(1, transferAmt);
            ps2.setInt(2, recieverId);
            ps2.executeUpdate();
        }
        
        try (PreparedStatement psHist = connection.prepareStatement(
                "INSERT INTO transaction_history (account_id, type, amount, details) VALUES (?, ?, ?, ?)")) {
            psHist.setInt(1, senderId);
            psHist.setString(2, "TRANSFER_OUT");
            psHist.setInt(3, transferAmt);
            psHist.setString(4, "To account: " + recieverId);
            psHist.executeUpdate();

            psHist.setInt(1, recieverId);
            psHist.setString(2, "TRANSFER_IN");
            psHist.setInt(3, transferAmt);
            psHist.setString(4, "From account: " + senderId);
            psHist.executeUpdate();
        }
        
        connection.commit();
        System.out.println("Transfer successful!");
    } catch (SQLException e) {
        try { connection.rollback(); } catch (SQLException ex) {}
        System.out.println("Transfer failed: " + e.getMessage());
    } finally {
        try { connection.setAutoCommit(true); } catch (SQLException ex) {}
    }
}




//5
private static void deleteAccount(Connection connection, Scanner sc) {
	Integer deltId = null;
    System.out.print("Enter Account ID to delete: ");
    while (deltId == null) {
        String input = sc.nextLine();
        try {
            deltId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer: ");
        }
    }
    
    boolean exists = false;
    try (PreparedStatement ps = connection.prepareStatement("SELECT 1 FROM transactions WHERE id = ?")) {
        ps.setInt(1, deltId);
        try (ResultSet rs = ps.executeQuery()) {
            exists = rs.next();
        }
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
        return;
    }
    if (!exists) {
        System.out.println("Account does not exist.");
        return;
    }
    
    try (PreparedStatement ps = connection.prepareStatement("DELETE FROM transactions WHERE id = ?")) {
        ps.setInt(1, deltId);
        ps.executeUpdate();
        System.out.println("Account deleted successfully!");
    } catch (SQLException e) {
        System.out.println("Error deleting account: " + e.getMessage());
    }
}




//6
private static void checkBalance(Connection connection, Scanner sc) {
	Integer chkId = null;
    System.out.print("Enter Account ID to check balance: ");
    while (chkId == null) {
        String input = sc.nextLine();
        try {
            chkId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer: ");
        }
    }

    Integer balance = null;
    try (PreparedStatement ps = connection.prepareStatement("SELECT balance_amount FROM transactions WHERE id = ?")) {
        ps.setInt(1, chkId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) balance = rs.getInt("balance_amount");
            else {
                System.out.println("Account does not exist.");
                return;
            }
        }
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
        return;
    }

    System.out.println("Account balance: " + balance);
}




//7
private static void showTransactionHistory(Connection connection, Scanner sc) {
	Integer accId = null;
    System.out.print("Enter Account ID to show transaction history: ");
    while (accId == null) {
        String input = sc.nextLine();
        try {
            accId = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.print("Invalid ID! Enter a valid integer: ");
        }
    }
    
    boolean exists = false;
    try (PreparedStatement ps = connection.prepareStatement("SELECT 1 FROM transactions WHERE id = ?")) {
        ps.setInt(1, accId);
        try (ResultSet rs = ps.executeQuery()) {
            exists = rs.next();
        }
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
        return;
    }
    if (!exists) {
        System.out.println("Account does not exist.");
        return;
    }

    System.out.println("Transaction History for Account ID " + accId + ":");
    System.out.println("Type\tAmount\tTimestamp\t\tDetails");
    System.out.println("---------------------------------------------------------------------");

    try (PreparedStatement ps = connection.prepareStatement(
            "SELECT type, amount, timestamp, details FROM transaction_history WHERE account_id = ? ORDER BY timestamp")) {
        ps.setInt(1, accId);
        try (ResultSet rs = ps.executeQuery()) {
            boolean foundRecords = false;
            while (rs.next()) {
                foundRecords = true;
                System.out.printf("%s\t | %d\t | %s\t | %s | \n", rs.getString("type"),
                        rs.getInt("amount"),
                        rs.getTimestamp("timestamp").toString(),
                        rs.getString("details") == null ? "" : rs.getString("details"));
            }
            if (!foundRecords) System.out.println("No transaction history found for this account.");
        }
    } catch (SQLException e) {
        System.out.println("Error retrieving transaction history: " + e.getMessage());
    }
}




//8
private static void showAllAccounts(Connection connection) {
    System.out.println("All Accounts:");
    System.out.println("ID\tName\t\tBalance");
    System.out.println("------------------------------------");

    try (Statement stmt = connection.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, name, balance_amount FROM transactions ORDER BY id")) {
        while (rs.next()) {
            System.out.printf("%d\t | %s\t  | %d \n", rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("balance_amount"));
        }
        System.out.println("------------------------------------");
    } catch (SQLException e) {
        System.out.println("Error retrieving accounts: " + e.getMessage());
    }
}


}