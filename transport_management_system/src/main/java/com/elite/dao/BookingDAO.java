package com.elite.dao;

package com.example.tms.dao;

import com.elite.models.Booking;
import com.elite.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {
    public boolean addBooking(Booking booking) {
        String query = "INSERT INTO bookings (passenger_id, transport_type, departure_city, arrival_city, seat_number) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, booking.getPassengerId());
            stmt.setString(2, booking.getTransportType());
            stmt.setString(3, booking.getDepartureCity());
            stmt.setString(4, booking.getArrivalCity());
            stmt.setInt(5, booking.getSeatNumber());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    // Implement getAllBookings(), deleteBooking() similarly
}
