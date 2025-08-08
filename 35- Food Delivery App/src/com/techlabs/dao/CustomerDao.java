package com.techlabs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.techlabs.model.Customer;

public class CustomerDao {

    public Customer insertCustomer(String name, String contact) {
        String sql = "INSERT INTO food_ordering_customer (name, contact) VALUES (?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, name);
            stmt.setString(2, contact);
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return new Customer(rs.getInt(1), name, contact);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
