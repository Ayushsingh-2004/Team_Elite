<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transport Management System</title>
    <link rel="stylesheet" href="../static/css/style.css">
</head>
<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Navigation Bar -->
<nav>
    <div class="container">
        <ul class="navbar">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="booking.jsp">Booking</a></li>
            <li><a href="profile.jsp">Profile</a></li>
            <c:choose>
                <c:when test="${not empty sessionScope.user}">
                    <li><a href="logout" class="logout-button">Logout</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="login.jsp" class="login-button">Login</a></li>
                    <li><a href="register.jsp" class="register-button">Register</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>

<!-- Header Section -->
<header>
    <div class="container">
        <h1 class="fade-in">Welcome to EliteGo</h1>
        <p class="slide-up">Your one-stop solution for booking flights and train tickets effortlessly.</p>
        <a href="booking.jsp" class="cta-button fade-in">Start Booking</a>
    </div>
</header>

<!-- About Section -->
<section id="about" class="fade-in">
    <div class="container">
        <h2>About Our System</h2>
        <p>Our Transport Management System is designed to streamline the process of booking tickets for both airways and railways. With an intuitive interface and efficient management, booking your next travel is just a few clicks away!</p>
        <div class="features">
            <div class="feature">
                <h3>Flight Booking</h3>
                <p>Book flights from various cities with ease, choose your seat, and confirm your booking instantly.</p>
            </div>
            <div class="feature">
                <h3>Train Booking</h3>
                <p>Find the best train routes, schedules, and seat availability in real-time.</p>
            </div>
            <div class="feature">
                <h3>Payment Integration</h3>
                <p>Secure and smooth payment methods to complete your booking hassle-free.</p>
            </div>
        </div>
    </div>
</section>

<!-- Footer Section -->
<footer>
    <p>&copy; 2024 Transport Management System. All rights reserved.</p>
</footer>
</body>
</html>
