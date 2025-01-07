package com.elite.servlets;

import com.example.tms.dao.PassengerDAO;
import com.example.tms.models.Passenger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/templates/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        PassengerDAO passengerDAO = new PassengerDAO();
        Passenger passenger = passengerDAO.getPassengerByEmailAndPassword(email, password);

        if (passenger != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", passenger);
            response.sendRedirect("profile");
        } else {
            request.setAttribute("error", "Invalid email or password.");
            request.getRequestDispatcher("/templates/login.jsp").forward(request, response);
        }
    }
}
