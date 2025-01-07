document.addEventListener("DOMContentLoaded", () => {
    // Registration Page Logic
    const registerForm = document.getElementById("registerForm");
    if (registerForm) {
      registerForm.addEventListener("submit", (event) => {
        event.preventDefault();
  
        const name = document.getElementById("name").value.trim();
        const email = document.getElementById("email").value.trim();
        const password = document.getElementById("password").value.trim();
  
        if (!name || !email || !password) {
          alert("Please fill out all fields.");
          return;
        }
  
        if (!validateEmail(email)) {
          alert("Please enter a valid email address.");
          return;
        }
  
        if (password.length < 6) {
          alert("Password must be at least 6 characters long.");
          return;
        }
  
        alert("Registration successful!");
        window.location.href = "login.html";
      });
    }
  
    // Login Page Logic
    const loginForm = document.getElementById("loginForm");
    if (loginForm) {
      loginForm.addEventListener("submit", (event) => {
        event.preventDefault();
  
        const email = document.getElementById("email").value.trim();
        const password = document.getElementById("password").value.trim();
  
        if (!email || !password) {
          alert("Please fill out both fields.");
          return;
        }
  
        alert("Login successful!");
        window.location.href = "profile.html";
      });
    }
  
    // Booking Page Logic
    const proceedToPaymentLink = document.getElementById("proceedToPaymentLink");
    if (proceedToPaymentLink) {
      proceedToPaymentLink.addEventListener("click", (event) => {
        event.preventDefault();
  
        const transport = document.getElementById("transport").value;
        const departure = document.getElementById("departure").value;
        const arrival = document.getElementById("arrival").value;
        const seat = document.getElementById("seat").value;
  
        if (!transport || !departure || !arrival || !seat) {
          alert("Please fill out all fields.");
          return;
        }
  
        alert("Proceeding to payment...");
        window.location.href = "payment.html";
      });
    }
  
    // Payment Page Logic
    const paymentForm = document.getElementById("paymentForm");
    if (paymentForm) {
      paymentForm.addEventListener("submit", (event) => {
        event.preventDefault();
  
        const cardNumber = document.getElementById("cardNumber").value.trim();
        const expiryDate = document.getElementById("expiryDate").value.trim();
        const cvv = document.getElementById("cvv").value.trim();
        const nameOnCard = document.getElementById("nameOnCard").value.trim();
  
        if (!cardNumber || !expiryDate || !cvv || !nameOnCard) {
          alert("Please fill out all fields.");
          return;
        }
  
        alert("Payment successful!");
        window.location.href = "profile.html";
      });
    }
  
    // Profile Page Logic
    const editButton = document.querySelector(".edit-button");
    if (editButton) {
      editButton.addEventListener("click", () => {
        alert("Profile editing feature coming soon!");
      });
    }
  
    // Utility: Email Validation
    function validateEmail(email) {
      const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      return emailRegex.test(email);
    }
  });
  