package com.elite.servlets;

import com.example.tms.dao.BookingDAO;
import com.example.tms.models.Booking;
import com.example.tms.models.Passenger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/templates/booking.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("user") != null) {
            Passenger passenger = (Passenger) session.getAttribute("user");

            String destination = request.getParameter("destination");
            Booking booking = new Booking(passenger.getId(), destination);

            BookingDAO bookingDAO = new BookingDAO();
            bookingDAO.saveBooking(booking);

            response.sendRedirect("profile");
        } else {
            response.sendRedirect("login");
        }
    }
}

