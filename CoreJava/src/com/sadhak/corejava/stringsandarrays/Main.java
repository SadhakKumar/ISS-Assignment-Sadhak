package com.sadhak.corejava.stringsandarrays;

public class Main {
    public static void main(String[] args) {

        // Array Operations
        int[] numbers = { 5, 3, 8, 1, 2 };
        System.out.println("Maximum in array: " + ArrayOperations.findMax(numbers));
        System.out.println("Minimum in array: " + ArrayOperations.findMin(numbers));
        System.out.println("Sum of all elements in the array: " + ArrayOperations.sumArray(numbers));
        System.out.println("Average of all the elements in the array: " + ArrayOperations.averageArray(numbers));
        ArrayOperations.sortArray(numbers);
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(
                "Searching for 3's index in the array: " + ArrayOperations.searchElement(numbers, 3));
        System.out.println("--------------------");

        // String Operations
        String text = "madam";
        System.out.println("Reversed string: " + StringOperations.reverseString(text));
        System.out.println("Is the string Palindrome: " + StringOperations.isPalindrome(text));
        System.out.println("Vowel Count: " + StringOperations.countVowels(text));
        System.out.println("Convert to Uppercase: " + StringOperations.convertToUpperCase(text));
        System.out.println("Convert to Lowercase: " + StringOperations.convertToLowerCase(text));
        String str1 = "Hello, ";
        String str2 = "World!";
        System.out.println("Concatenated strings: " + StringOperations.concatenate(str1, str2));
        System.out.println("Contains 'World': " + StringOperations.containsSubstring(str1 + str2, "World"));
        System.out.println("Contains 'Java': " + StringOperations.containsSubstring(str1 + str2, "Java"));

    }
}
