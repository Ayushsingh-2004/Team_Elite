<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Payment - Transport Management System</title>
  <link rel="stylesheet" href="../static/css/style.css">
</head>
<body>
<header>
  <h1>Complete Your Payment</h1>
  <nav>
    <ul>
      <li><a href="index.html">Home</a></li>
      <li><a href="booking.html">Booking</a></li>
      <li><a href="profile.html">Profile</a></li>
    </ul>
  </nav>
</header>

<section class="payment">
  <div class="container">
    <h2>Payment Details</h2>
    <form id="paymentForm">
      <label for="cardNumber">Card Number:</label>
      <input type="text" id="cardNumber" required>

      <label for="expiryDate">Expiry Date:</label>
      <input type="text" id="expiryDate" required placeholder="MM/YY">

      <label for="cvv">CVV:</label>
      <input type="text" id="cvv" required>

      <label for="nameOnCard">Name on Card:</label>
      <input type="text" id="nameOnCard" required>

      <button type="submit">Proceed to Payment</button>
    </form>
  </div>
</section>

<footer>
  <p>&copy; 2024 Transport Management System</p>
</footer>
<script src="../static/js/script.js" defer></script>
</body>
</html>
