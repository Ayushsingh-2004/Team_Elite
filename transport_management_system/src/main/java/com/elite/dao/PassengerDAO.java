package com.elite.dao;


import com.elite.models.Passenger;
import com.elite.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerDAO {
    public boolean addPassenger(Passenger passenger) {
        String query = "INSERT INTO passengers (name, email, phone, type) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, passenger.getName());
            stmt.setString(2, passenger.getEmail());
            stmt.setString(3, passenger.getPhone());
            stmt.setString(4, passenger.getType());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    // Implement getAllPassengers(), deletePassenger() similarly
}
