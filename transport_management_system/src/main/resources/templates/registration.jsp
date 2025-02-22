<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register - Transport Management System</title>
  <link rel="stylesheet" href="../static/css/style.css">
<body>
<header>
  <h1>Create a New Account</h1>
  <nav>
    <ul>
      <li><a href="index.html">Home</a></li>
      <li><a href="login.html">Login</a></li>
    </ul>
  </nav>
</header>

<section class="register">
  <form id="registerForm">
    <label for="name">Full Name:</label>
    <input type="text" id="name" required>

    <label for="email">Email:</label>
    <input type="email" id="email" required>

    <label for="password">Password:</label>
    <input type="password" id="password" required>

    <button type="submit">Register</button>
  </form>
</section>

<footer>
  <p>&copy; 2024 Transport Management System</p>
</footer>
<script src="../static/js/script.js" defer></script>
</body>
</html>
