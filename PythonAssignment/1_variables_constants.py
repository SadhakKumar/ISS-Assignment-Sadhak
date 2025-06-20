# Constants (following uppercase naming convention)
PI = 3.14159
GRAVITY = 9.81

# Variables 
name = "Sadhak"
age = 21
height_in_feet = 6.2


def display_user_info():
    """Prints user details along with constants."""
    print(
        f"My name is {name}, I am {age} years old, and my height is {height_in_feet} ft.\n"
        f"The value of PI is approximately {PI}, and gravity on Earth is {GRAVITY} m/s²."
    )


if __name__ == "__main__":
    display_user_info()
