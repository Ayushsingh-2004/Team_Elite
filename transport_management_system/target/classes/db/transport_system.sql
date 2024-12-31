-- Create the database
CREATE DATABASE transport_system;

-- Use the created database
USE transport_system;

-- Create the passengers table
CREATE TABLE passengers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15)
);

-- Create the transports table
CREATE TABLE transports (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50),
    schedule DATETIME
);
