Transport Management System

The primary objective of the Transport Management System is to automate and streamline the registration and booking processes for both airways and railways. The system aims to provide an efficient, user-friendly platform for managing essential details like passenger information, flight/train schedules, and booking records. It will offer key functionalities such as adding, updating, and deleting records to accommodate passengers' needs while minimizing manual efforts and errors. By automating these processes, the project enhances operational efficiency, improves data accuracy, and offers a seamless experience for both passengers and administrators.


transport_management_system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── tms/
│   │   │   │   │   │   ├── dao/
│   │   │   │   │   │   │   ├── PassengerDAO.java
│   │   │   │   │   │   │   ├── BookingDAO.java
│   │   │   │   │   │   ├── models/
│   │   │   │   │   │   │   ├── Passenger.java
│   │   │   │   │   │   │   ├── Booking.java
│   │   │   │   │   │   ├── utils/
│   │   │   │   │   │   │   ├── DBConnection.java
│   │   │   │   │   │   ├── MainApp.java
│   ├── resources/
│   │   ├── application.properties         # Configuration file for database connection and other properties
│   │   ├── db/                            # Folder to store your SQL files
│   │   │   ├── transport_system.sql       # SQL file for database creation and initial data
├── pom.xml                                # Maven configuration file

