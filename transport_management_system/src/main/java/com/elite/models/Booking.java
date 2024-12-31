package com.elite.models;



import java.sql.Timestamp;

public class Booking {
    private int id;
    private int passengerId;
    private String transportType;
    private String departureCity;
    private String arrivalCity;
    private int seatNumber;
    private Timestamp bookingDate;

    public Booking(int id, int passengerId, String transportType, String departureCity,
                   String arrivalCity, int seatNumber, Timestamp bookingDate) {
        this.id = id;
        this.passengerId = passengerId;
        this.transportType = transportType;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.seatNumber = seatNumber;
        this.bookingDate = bookingDate;
    }
    // Getters and Setters
}
