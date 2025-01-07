<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Transport Management System</title>
    <link rel="stylesheet" href="../static/css/style.css">
</head>
<body>
<header>
    <h1>Login to Your Account</h1>
    <nav>
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="registration.html">Register</a></li>
        </ul>
    </nav>
</header>

<section class="login">
    <form id="loginForm">
        <label for="email">Email:</label>
        <input type="email" id="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" required>

        <button type="submit">Login</button>
    </form>
</section>

<footer>
    <p>&copy; 2024 Transport Management System</p>
</footer>
<script src="../static/js/script.js" defer></script>
</body>
</html>
