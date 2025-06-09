function validateLoginForm() {
  const email = document.forms[0]["email"].value.trim();
  const password = document.forms[0]["password"].value.trim();

  if (!email || !password) {
    alert("Both email and password are required!");
    return false;
  }
  return true;
}

function validateRegisterForm() {
  const name = document.forms[0]["name"].value.trim();
  const email = document.forms[0]["email"].value.trim();
  const password = document.forms[0]["password"].value.trim();

  if (!name || !email || !password) {
    alert("All fields are required!");
    return false;
  }

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailRegex.test(email)) {
    alert("Enter a valid email address!");
    return false;
  }

  if (password.length < 6) {
    alert("Password must be at least 6 characters!");
    return false;
  }

  return true;
}
