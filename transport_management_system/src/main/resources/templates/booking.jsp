<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Book Ticket - Transport Management System</title>
  <link rel="stylesheet" href="../static/css/style.css">
</head>
<body>
<header>
  <h1>Book Your Ticket</h1>
  <nav>
    <ul>
      <li><a href="index.html">Home</a></li>
    </ul>
  </nav>
</header>

<section class="booking">
  <h1>Book Your Ticket</h1>
  <form id="bookingForm">
    <label for="transport">Choose Transport:</label>
    <select id="transport" required>
      <option value="airline">Flight</option>
      <option value="train">Train</option>
    </select>

    <label for="departure">Departure City:</label>
    <select id="departure" required>
      <option value="">Select a City</option>
      <option value="Delhi">Delhi</option>
      <option value="Mumbai">Mumbai</option>
      <!-- More cities can be added here -->
    </select>

    <label for="arrival">Arrival City:</label>
    <select id="arrival" required>
      <option value="">Select a City</option>
      <option value="Delhi">Delhi</option>
      <option value="Mumbai">Mumbai</option>
      <!-- More cities can be added here -->
    </select>

    <label for="seat">Seat Number:</label>
    <input type="number" id="seat" required>

    <a href="payment.html" id="proceedToPaymentLink">Proceed to Payment</a>
  </form>
</section>

<footer>
  <p>&copy; 2024 Transport Management System</p>
</footer>

<script src="../static/js/script.js" defer></script>
</body>
</html>
