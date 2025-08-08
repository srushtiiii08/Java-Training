package com.techlabs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.techlabs.model.DeliveryPartner;

public class DeliveryPartnerDao {
    private Connection conn;

    public DeliveryPartnerDao(Connection conn) {
        this.conn = conn;
    }

    public DeliveryPartner getRandomAvailablePartner() throws SQLException {
        List<DeliveryPartner> partners = new ArrayList<>();
        String query = "SELECT * FROM food_ordering_delivery_partner WHERE is_available = 1";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                partners.add(new DeliveryPartner(
                        rs.getInt("partner_id"),
                        rs.getString("name"),
                        rs.getString("contact")
                ));
            }
        }

        if (partners.isEmpty()) return null;
        return partners.get(new Random().nextInt(partners.size()));
    }
}