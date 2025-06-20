def greet(name: str) -> str:
    return f"Hello, {name}!"


def add_numbers(*args: int) -> int:
    """
    *args adds a variable number of integer arguments.
    """
    return sum(args)


def display_info(**kwargs) -> None:
    """
    kwargs allows passing a variable number of keyword arguments.
    """
    print("Personal Information:")
    for key, value in kwargs.items():
        print(f"  {key.capitalize()}: {value}")
    print()


if __name__ == "__main__":
    print("Greeting:")
    print(f"  {greet('Sadhak')}\n")

    print("Adding Numbers:")
    print(f"  Sum = {add_numbers(1, 2, 3, 4)}\n")

    display_info(name="Sadhak", age=22, country="India")
