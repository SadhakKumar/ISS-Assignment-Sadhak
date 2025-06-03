package com.sadhak.corejava.collectionoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {

    public void performListOperations() {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, "A"));
        students.add(new Student("Bob", 2, "B"));
        students.add(new Student("Charlie", 3, "C"));

        // Print the original list
        System.out.println("Original List: " + students);

        // Sort the list using Comparable
        Collections.sort(students);
        System.out.println("Sorted List: " + students);

        // Check if a student is in the list
        Student searchStudent = new Student("Alice", 1, "A");
        boolean contains = students.contains(searchStudent);
        System.out.println("Contains Alice? " + contains);

        // Remove a student from the list
        students.remove(searchStudent);
        System.out.println("After removing Alice: " + students);
    }

    public void sortListUsingComparator() {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, "A"));
        students.add(new Student("Bob", 2, "B"));
        students.add(new Student("Charlie", 3, "C"));

        // Sort the list using a custom comparator based on name
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorted by Name: " + students);
    }
}
