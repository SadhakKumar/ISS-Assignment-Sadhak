# There are mainly two types of type conversion in Python:
# 1. Implicit Type Conversion: Automatically performed by Python.
# 2. Explicit Type Conversion: Manually performed by the programmer using built-in functions.
def implicit_type_conversion():
    """Demonstrates Python's implicit type conversion."""
    num_int = 10
    num_float = 5.5
    num_sum = num_int + num_float  # int is implicitly converted to float

    print("Implicit Type Conversion:")
    print(f"  num_int ({num_int}) is of type: {type(num_int)}")
    print(f"  num_float ({num_float}) is of type: {type(num_float)}")
    print(f"  Result: {num_sum} is of type: {type(num_sum)}\n")


def explicit_type_conversion():
    """Demonstrates explicit type conversion using built-in functions."""
    print("Explicit Type Conversion:")

    # String to Integer
    num_str = "20"
    num_int_explicit = int(num_str)
    print(f"  Converted string '{num_str}' to integer: {num_int_explicit} (type: {type(num_int_explicit)})")

    # Binary string to integer
    binary_str = "10010"
    num_base2 = int(binary_str, 2)
    print(f"  Binary string '{binary_str}' to integer: {num_base2}")

    # String to float
    num_float = float(binary_str)
    print(f"  String '{binary_str}' to float: {num_float}")

    # Character to Unicode
    char = 'A'
    unicode_code = ord(char)
    print(f"  Unicode of '{char}' is: {unicode_code}")

    # Integer to hexadecimal
    hex_num = 255
    print(f"  Hexadecimal of {hex_num} is: {hex(hex_num)}")

    # Integer to octal
    oct_num = 64
    print(f"  Octal of {oct_num} is: {oct(oct_num)}\n")


def conversion_with_collections():
    """Demonstrates conversion between list, set, tuple, and dictionary."""
    print("Collection Conversions:")

    # List to Tuple
    my_list = [1, 2, 3, 4]
    my_tuple = tuple(my_list)
    print(f"  List to tuple: {my_list} -> {my_tuple}")

    # List with duplicates to Set
    my_list_dup = [1, 2, 2, 3, 4]
    my_set = set(my_list_dup)
    print(f"  List to set (duplicates removed): {my_list_dup} -> {my_set}")

    # Set to List
    set_to_list = list(my_set)
    print(f"  Set to list: {my_set} -> {set_to_list}")

    # Tuples to Dictionary
    tuple_list = [('name', 'Sadhak'), ('age', 22)]
    my_dict = dict(tuple_list)
    print(f"  Tuples to dictionary: {tuple_list} -> {my_dict}\n")


def other_type_conversions():
    """Demonstrates complex number creation and ASCII to character conversion."""
    print("Miscellaneous Conversions:")

    # Real + Imaginary to complex
    real_part = 5
    imaginary_part = 3
    complex_num = complex(real_part, imaginary_part)
    print(f"  Complex number: {real_part} + {imaginary_part}j -> {complex_num}")

    # ASCII to Character
    ascii_value = 65
    char_from_ascii = chr(ascii_value)
    print(f"  ASCII value {ascii_value} to character: {char_from_ascii}\n")


if __name__ == "__main__":
    implicit_type_conversion()
    explicit_type_conversion()
    conversion_with_collections()
    other_type_conversions()
