package com.elite;

import com.elite.dao.PassengerDAO;
import com.elite.dao.BookingDAO;
import com.elite.models.Passenger;
import com.elite.models.Booking;

public class MainApp {

    public static void main(String[] args) {
        // Initialize the DAO classes
        PassengerDAO passengerDAO = new PassengerDAO();
        BookingDAO bookingDAO = new BookingDAO();

        // Add a new passenger
        Passenger passenger = new Passenger("John Doe", "john@example.com", "1234567890");
        passengerDAO.addPassenger(passenger);

        // Create a booking for the passenger
        Booking booking = new Booking(passenger.getId(), "Flight", 1);  // Example transport_id = 1
        bookingDAO.createBooking(booking);
    }
}

