# Transport Management System

The primary objective of the Transport Management System is to automate and streamline the registration and booking processes for both airways and railways. The system aims to provide an efficient, user-friendly platform for managing essential details like passenger information, flight/train schedules, and booking records. It will offer key functionalities such as adding, updating, and deleting records to accommodate passengers' needs while minimizing manual efforts and errors. By automating these processes, the project enhances operational efficiency, improves data accuracy, and offers a seamless experience for both passengers and administrators.


## Features

- **User Registration**: Users can create an account and log in.
- **Booking**: Users can book transport tickets (flight/train).
- **Payment**: Users can complete the payment for their bookings.
- **Profile**: Displays user information and allows for profile management.

## Technologies Used

- **Java** (JSP, Servlets)
- **JDBC** (MySQL)
- **JSTL & EL** (for dynamic content rendering)
- **Maven** (for project management)
- **HTML, CSS, JavaScript** (for the front-end)

## Directory Structure

- `src/main/java/com/elite/`: Contains Java classes for the application's backend logic.
- `src/main/resources/`: Configuration files and static assets like CSS, JavaScript, and images.
- `src/main/webapp/WEB-INF/`: Web configuration files and templates for JSP pages.

  
transport_management_system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── elite/
│   │   │   │   │   ├── dao/
│   │   │   │   │   │   ├── UserDAO.java            # Handles DB operations for user data
│   │   │   │   │   ├── models/
│   │   │   │   │   │   ├── User.java                # Represents a user entity
│   │   │   │   │   │   ├── Booking.java             # Represents a booking entity
│   │   │   │   │   │   ├── Passenger.java           # Represents a passenger entity
│   │   │   │   │   ├── utils/
│   │   │   │   │   │   ├── DBConnection.java        # Database connection utility
│   │   │   │   │   ├── servlets/
│   │   │   │   │   │   ├── RegistrationServlet.java # Handles user registration
│   │   │   │   │   │   ├── LoginServlet.java         # Handles user login
│   │   │   │   │   │   ├── ProfileServlet.java       # Displays user profile
│   │   │   │   │   │   ├── BookingServlet.java       # Manages bookings
│   │   │   │   │   │   ├── PaymentServlet.java       # Handles payment functionality
│   │   │   │   │   │   ├── HomeServlet.java          # Redirects to index page
│   │   ├── resources/
│   │   │   ├── application.properties                   # Configuration for database connection
│   │   │   ├── db/
│   │   │   │   ├── transport_system.sql                # SQL script for database setup (ensure this includes the correct schema)
│   │   │   ├── static/
│   │   │   │   ├── css/
│   │   │   │   │   ├── style.css                       # General stylesheet
│   │   │   │   ├── js/
│   │   │   │   │   ├── script.js                       # Common JavaScript
│   │   │   │   ├── images/
│   │   │   │   │   ├── user-placeholder.png            # Placeholder image for users
│   │   │   ├── templates/
│   │   │   │   ├── index.jsp                           # Home page
│   │   │   │   ├── login.jsp                           # Login page
│   │   │   │   ├── register.jsp                        # Registration page
│   │   │   │   ├── profile.jsp                         # User profile page (using session attributes)
│   │   │   │   ├── booking.jsp                         # Booking page
│   │   │   │   ├── payment.jsp                         # Payment page
├── pom.xml                                              # Maven configuration file
├── src/main/webapp/WEB-INF/
│   ├── web.xml                                          # Web deployment descriptor (add servlet mappings and filters here)
├── README.md                                            # (Optional) Project README
