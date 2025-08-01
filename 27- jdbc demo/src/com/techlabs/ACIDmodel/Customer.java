package com.techlabs.ACIDmodel;

import java.sql.*;
import java.util.Scanner;

public class Customer {
    Connection connection;
    Scanner sc;

    public Customer(Connection connection, Scanner sc) {
        this.connection = connection;
        this.sc = sc;
    }

    public void start() {
        int accountId = 0;
        System.out.print("Enter your Account ID: ");
        try {
            accountId = Integer.parseInt(sc.nextLine());
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM transactions WHERE id=?");
            ps.setInt(1, accountId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Welcome, " + rs.getString("name") + "!");
                customerMenu(accountId);
            } else {
                System.out.println("No such account.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid account ID.");
        } catch (SQLException e) {
            System.out.println("Error during login: " + e.getMessage());
        }
    }

    
    
    private void customerMenu(int accountId) {
        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Check Transaction History");
            System.out.println("6. Delete Account");
            System.out.println("7. Freeze/Unfreeze Account");
            System.out.println("8. Logout");
            System.out.println("Choose an option: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter valid number.");
                continue;
            }

            if (choice == 1) 
            	deposit(accountId);
            else if (choice == 2) 
            	withdraw(accountId);
            else if (choice == 3) 
            	transferMoney(accountId);
            else if (choice == 4) 
            	checkBalance(accountId);
            else if (choice == 5) 
            	transactionHistory(accountId);
            else if (choice == 6) 
            	deleteAccount(accountId);
            else if (choice == 7) 
            	freezeUnfreezeAccount(accountId);
            else if (choice == 8) {
                System.out.println("Logged out successfully!");
                break;
            } else System.out.println("Invalid choice!");
        }
    }

    
    //1
    private void deposit(int accId) {
        System.out.print("Enter amount to deposit: ");
        int amount = 0;
        try {
            amount = Integer.parseInt(sc.nextLine());
            if (amount <= 0) {
                System.out.println("Amount must be positive.");
                return;
            }
            PreparedStatement ps = connection.prepareStatement("SELECT balance_amount, is_frozen FROM transactions WHERE id=?");
            ps.setInt(1, accId);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Account not found.");
                return;
            }
            if (rs.getBoolean("is_frozen")) {
                System.out.println("Account is frozen; cannot deposit.");
                return;
            }
            int newBalance = rs.getInt("balance_amount") + amount;
            PreparedStatement ps2 = connection.prepareStatement("UPDATE transactions SET balance_amount=? WHERE id=?");
            ps2.setInt(1, newBalance);
            ps2.setInt(2, accId);
            ps2.executeUpdate();
            PreparedStatement hist = connection.prepareStatement("INSERT INTO transaction_history(account_id, type, amount, details) VALUES (?, 'deposit', ?, 'Deposit')");
            hist.setInt(1, accId);
            hist.setInt(2, amount);
            hist.executeUpdate();
            System.out.println("Deposit successful. New balance: " + newBalance);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount.");
        } catch (SQLException e) {
            System.out.println("Deposit error: " + e.getMessage());
        }
    }

    
    //2
    private void withdraw(int accId) {
        System.out.print("Enter amount to withdraw: ");
        int amount = 0;
        try {
            amount = Integer.parseInt(sc.nextLine());
            if (amount <= 0) {
                System.out.println("Amount must be positive.");
                return;
            }
            PreparedStatement ps = connection.prepareStatement("SELECT balance_amount, is_frozen FROM transactions WHERE id=?");
            ps.setInt(1, accId);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Account not found.");
                return;
            }
            if (rs.getBoolean("is_frozen")) {
                System.out.println("Account is frozen; cannot withdraw.");
                return;
            }
            int currentBalance = rs.getInt("balance_amount");
            if (currentBalance < amount) {
                System.out.println("Insufficient balance.");
                return;
            }
            int newBalance = currentBalance - amount;
            PreparedStatement ps2 = connection.prepareStatement("UPDATE transactions SET balance_amount=? WHERE id=?");
            ps2.setInt(1, newBalance);
            ps2.setInt(2, accId);
            ps2.executeUpdate();
            PreparedStatement hist = connection.prepareStatement("INSERT INTO transaction_history(account_id, type, amount, details) VALUES (?, 'withdraw', ?, 'Withdraw')");
            hist.setInt(1, accId);
            hist.setInt(2, amount);
            hist.executeUpdate();
            System.out.println("Withdrawal successful. New balance: " + newBalance);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount.");
        } catch (SQLException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }

    
    //3
    private void transferMoney(int accId) {
        System.out.print("Enter reciever's Account ID: ");
        int toAccId;
        try {
            toAccId = Integer.parseInt(sc.nextLine());
            if (toAccId == accId) {
                System.out.println("Cannot transfer to your own account!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid account ID!");
            return;
        }
        System.out.print("Enter amount to transfer: ");
        int amount;
        try {
            amount = Integer.parseInt(sc.nextLine());
            if (amount <= 0) {
                System.out.println("Amount must be positive.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount.");
            return;
        }
        try {
            PreparedStatement psFrom = connection.prepareStatement("SELECT balance_amount, is_frozen FROM transactions WHERE id=?");
            psFrom.setInt(1, accId);
            ResultSet rsFrom = psFrom.executeQuery();
            if (!rsFrom.next()) {
                System.out.println("Your account not found.");
                return;
            }
            if (rsFrom.getBoolean("is_frozen")) {
                System.out.println("Your account is frozen; cannot transfer.");
                return;
            }
            int fromBal = rsFrom.getInt("balance_amount");
            if (fromBal < amount) {
                System.out.println("Insufficient balance.");
                return;
            }
            PreparedStatement psTo = connection.prepareStatement("SELECT balance_amount, is_frozen FROM transactions WHERE id=?");
            psTo.setInt(1, toAccId);
            ResultSet rsTo = psTo.executeQuery();
            if (!rsTo.next()) {
                System.out.println("Target account not found.");
                return;
            }
            if (rsTo.getBoolean("is_frozen")) {
                System.out.println("Target account is frozen; cannot receive transfer.");
                return;
            }
            int toBal = rsTo.getInt("balance_amount");

            // Transaction
            connection.setAutoCommit(false);
            try {
                PreparedStatement updateFrom = connection.prepareStatement("UPDATE transactions SET balance_amount=? WHERE id=?");
                updateFrom.setInt(1, fromBal - amount);
                updateFrom.setInt(2, accId);
                updateFrom.executeUpdate();

                PreparedStatement updateTo = connection.prepareStatement("UPDATE transactions SET balance_amount=? WHERE id=?");
                updateTo.setInt(1, toBal + amount);
                updateTo.setInt(2, toAccId);
                updateTo.executeUpdate();

                PreparedStatement logFrom = connection.prepareStatement("INSERT INTO transaction_history(account_id, type, amount, details) VALUES (?, 'transfer', ?, ?)");
                logFrom.setInt(1, accId);
                logFrom.setInt(2, amount);
                logFrom.setString(3, "Transfer to Account ID " + toAccId);
                logFrom.executeUpdate();

                PreparedStatement logTo = connection.prepareStatement("INSERT INTO transaction_history(account_id, type, amount, details) VALUES (?, 'transfer', ?, ?)");
                logTo.setInt(1, toAccId);
                logTo.setInt(2, amount);
                logTo.setString(3, "Transfer from Account ID " + accId);
                logTo.executeUpdate();

                connection.commit();
                System.out.println("Transfer successful.");
            } catch (SQLException e) {
            	connection.rollback();
                System.out.println("Transfer failed: " + e.getMessage());
            } finally {
            	connection.setAutoCommit(true);
            }
        } catch (SQLException e) {
            System.out.println("Transfer error: " + e.getMessage());
        }
    }

    private void checkBalance(int accId) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT balance_amount FROM transactions WHERE id=?");
            ps.setInt(1, accId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Current balance: " + rs.getInt("balance_amount"));
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error checking balance: " + e.getMessage());
        }
    }

    private void transactionHistory(int accId) {
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT id, type, amount, timestamp, details FROM transaction_history WHERE account_id=? ORDER BY timestamp DESC");
            ps.setInt(1, accId);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-10s %-15s %-10s %-20s %-30s\n", "TransID", "Type", "Amount", "Timestamp", "Details");
            while (rs.next()) {
                System.out.printf("%-10d %-15s %-10d %-20s %-30s\n",
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getInt("amount"),
                        rs.getTimestamp("timestamp"),
                        rs.getString("details"));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching transaction history: " + e.getMessage());
        }
    }

    private void deleteAccount(int accId) {
        System.out.print("Are you sure you want to delete your account? (yes/no): ");
        String confirm = sc.nextLine().trim().toLowerCase();
        if (!confirm.equalsIgnoreCase("yes")) {
            System.out.println("Account deletion cancelled.");
            return;
        }
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM transactions WHERE id=?");
            ps.setInt(1, accId);
            
            int rows = ps.executeUpdate();
            
            if (rows > 0) 
            	System.out.println("Account deleted successfully.");
            else 
            	System.out.println("Account not found or could not be deleted.");
        } catch (SQLException e) {
            System.out.println("Error deleting account: " + e.getMessage());
        }
    }

    private void freezeUnfreezeAccount(int accId) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT is_frozen FROM transactions WHERE id=?");
            ps.setInt(1, accId);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Account not found.");
                return;
            }
            boolean frozen = rs.getBoolean("is_frozen");
            boolean newStatus = !frozen;
            PreparedStatement ps2 = connection.prepareStatement("UPDATE transactions SET is_frozen=? WHERE id=?");
            ps2.setBoolean(1, newStatus);
            ps2.setInt(2, accId);
            int rows = ps2.executeUpdate();
            if (rows > 0)
                System.out.println("Your account is now " + (newStatus ? "Frozen" : "Active") + ".");
            else
                System.out.println("Could not change freeze status.");
        } catch (SQLException e) {
            System.out.println("Error updating freeze status: " + e.getMessage());
        }
    }
}
