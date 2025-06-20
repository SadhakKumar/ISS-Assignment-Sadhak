def safe_division_from_input() -> None:
    """
    Takes user input, attempts to divide 10 by the input value,
    and handles ValueError and ZeroDivisionError.
    """
    print("Division with try-except-else-finally:")

    try:
        num = int(input("Enter a number: "))
        result = 10 / num
    except ValueError:
        print("Invalid input! Please enter a numeric value.")
    except ZeroDivisionError:
        print("Cannot divide by zero!")
    else:
        print(f"Result: {result}")
    finally:  
        print("Execution completed.\n")


def divide(a: float, b: float) -> float:
    """
    Divides two numbers with validation.
    """
    if b == 0:
        raise ValueError("Denominator cannot be zero.")
    return a / b


def demonstrate_raise_example():
    """
    Demonstrates raising and catching a custom ValueError.
    """
    print("Manual Raise Example:")
    try:
        result = divide(5, 0)
        print(f"Result: {result}")
    except ValueError as e:
        print(f"Error: {e}")
    print()


if __name__ == "__main__":
    safe_division_from_input()
    divide(10, 2)  
    demonstrate_raise_example()
