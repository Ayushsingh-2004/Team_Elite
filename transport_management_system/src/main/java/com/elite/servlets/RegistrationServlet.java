package com.elite.servlets;

import com.example.tms.dao.PassengerDAO;
import com.example.tms.models.Passenger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/templates/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Passenger passenger = new Passenger(name, email, password);
        PassengerDAO passengerDAO = new PassengerDAO();

        if (passengerDAO.savePassenger(passenger)) {
            response.sendRedirect("login");
        } else {
            request.setAttribute("error", "Registration failed. Try again.");
            request.getRequestDispatcher("/templates/register.jsp").forward(request, response);
        }
    }
}
