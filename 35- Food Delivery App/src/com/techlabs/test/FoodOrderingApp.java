package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.techlabs.dao.AdminDao;
import com.techlabs.dao.CustomerDao;
import com.techlabs.dao.DeliveryPartnerDao;
import com.techlabs.dao.MenuDao;
import com.techlabs.dao.OrderDao;
import com.techlabs.input_service.AdminInputService;
import com.techlabs.input_service.CustomerInputService;
import com.techlabs.input_service.InputValidator;

public class FoodOrderingApp {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery", "root", "root")) {
            AdminDao adminDao = new AdminDao(conn);
            MenuDao menuDao = new MenuDao(conn);
            OrderDao orderDao = new OrderDao(conn);
            DeliveryPartnerDao deliveryDao = new DeliveryPartnerDao(conn);
            CustomerDao customerDao = new CustomerDao();

            AdminInputService adminService = new AdminInputService(adminDao);
            CustomerInputService customerService = new CustomerInputService(menuDao, orderDao, deliveryDao, customerDao);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== Food Ordering System ===");
                System.out.println("1. Admin Login");
                System.out.println("2. Customer Order");
                System.out.println("3. Exit");

                int choice = InputValidator.getValidInt("Choose option: ", 1, 3);
                switch (choice) {
                    case 1 : adminService.showAdminMenu(sc); break;
                    case 2 : customerService.showCustomerMenu(); break;
                    case 3 : 
                        System.out.println("Thank you for using the Food Ordering System!");
                        return;
                    
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Database error: " + e.getMessage());
        }
    }
}
