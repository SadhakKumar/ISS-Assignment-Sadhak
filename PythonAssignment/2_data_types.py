# Integer values
num1: int = 10
num2: int = -5

# String values
name: str = "Sadhak"
greeting: str = f"Hello, {name}!"

# Boolean value
is_active: bool = True

# List (ordered, mutable)
fruits: list = ["apple", "banana", "cherry"]

# Tuple (ordered, immutable)
coordinates: tuple = (10, 20)

# Set (unordered, unique values)
unique_numbers: set = {1, 2, 3, 2, 1}  # Duplicates are automatically removed

# Dictionary (key-value pairs)
student: dict = {
    "name": "Sadhak",
    "age": 22,
    "grades": [90, 85, 92]
}


def display_data_types():
    """Prints values of different basic Python data types."""
    print("Integers:")
    print(f"  num1 = {num1}, num2 = {num2}\n")

    print("Strings:")
    print(f"  greeting = {greeting}\n")

    print("Boolean:")
    print(f"  is_active = {is_active}\n")

    print("List:")
    print(f"  fruits = {fruits}\n")

    print("Tuple:")
    print(f"  coordinates = {coordinates}\n")

    print("Set:")
    print(f"  unique_numbers = {unique_numbers}\n")

    print("Dictionary:")
    print(f"  student = {student}\n")


if __name__ == "__main__":
    display_data_types()
