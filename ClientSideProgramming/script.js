document
  .getElementById("registrationForm")
  .addEventListener("submit", function (e) {
    // Prevent the default form submission
    e.preventDefault();

    const errorMsg = document.getElementById("errorMsg");
    errorMsg.textContent = "";

    // Get form values
    const fullname = document.getElementById("fullname").value.trim();
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value;
    const agree = document.getElementById("agree").checked;

    // Validate form fields
    if (fullname === "" || email === "" || password === "") {
      errorMsg.textContent = "Please fill out all required fields.";
      return;
    }

    // Check if email is valid
    // Simple regex for email validation
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
      errorMsg.textContent = "Invalid email format.";
      return;
    }

    // Check password length
    // Minimum length of 6 characters
    if (password.length < 6) {
      errorMsg.textContent = "Password must be at least 6 characters.";
      return;
    }

    // Check if terms and conditions are agreed to
    if (!agree) {
      errorMsg.textContent = "You must agree to the terms and conditions.";
      return;
    }

    // If all validations pass, submit the form
    alert("Form submitted successfully!");
    this.reset();
  });
