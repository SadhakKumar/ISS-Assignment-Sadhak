
def demonstrate_if_else(score: int) -> None:
    """Evaluates a score using if-elif-else."""
    print("If-Else Statement:")
    if score >= 90:
        print("  Result: Excellent!")
    elif score >= 60:
        print("  Result: Good Job")
    else:
        print("  Result: Try Harder")
    print()


def demonstrate_for_loop():
    """Iterates over a list using a for loop."""
    fruits = ["apple", "banana", "cherry"]
    print("For Loop:")
    for fruit in fruits:
        print(f"  Fruit: {fruit}")
    print()


def demonstrate_while_loop():
    """Demonstrates a basic while loop."""
    print("While Loop:")
    count = 0
    while count < 3:
        print(f"  Counting: {count}")
        count += 1
    print()


def demonstrate_break_continue():
    """Demonstrates the use of break and continue in a for loop."""
    print("Break and Continue:")
    for i in range(5):
        if i == 3:
            print("  Break encountered at i =", i)
            break
        if i == 1:
            print("  Continue encountered at i =", i)
            continue
        print(f"  Value: {i}")
    print()


def demonstrate_pass():
    """Demonstrates the pass statement."""
    print("Pass Statement:")
    for _ in range(3):
        pass  # Placeholder where logic may be added later
    print("  Pass used as a placeholder (nothing printed inside loop)\n")


def demonstrate_loop_else():
    """Demonstrates the loop-else construct."""
    print("Loop-Else:")
    for i in range(3):
        print(f"  Iteration: {i}")
    else:
        print("  Loop completed without break\n")


if __name__ == "__main__":
    demonstrate_if_else(score=85)
    demonstrate_for_loop()
    demonstrate_while_loop()
    demonstrate_break_continue()
    demonstrate_pass()
    demonstrate_loop_else()
