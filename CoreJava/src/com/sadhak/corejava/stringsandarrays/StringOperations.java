package com.sadhak.corejava.stringsandarrays;

public class StringOperations {

    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Method to convert a string to uppercase
    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    // Method to convert a string to lowercase
    public static String convertToLowerCase(String input) {
        return input.toLowerCase();
    }

    // Methiod to concatenate two strings
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Method to check if a string contains another substring
    public static boolean containsSubstring(String str, String substring) {
        return str.contains(substring);
    }
}
