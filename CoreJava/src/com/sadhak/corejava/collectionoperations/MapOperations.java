package com.sadhak.corejava.collectionoperations;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

    public void performMapOperations() {
        Map<Student, Student> studentMap = new HashMap<>();
        // Adding students to the map
        Student student1 = new Student("Alice", 1, "A");
        Student student2 = new Student("Bob", 2, "B");
        Student student3 = new Student("Charlie", 3, "C");

        // pairing students with each other
        studentMap.put(student1, student2);
        studentMap.put(student2, student3);

        // Print the original map
        System.out.println("Original Map: " + studentMap);

        // Check if a student is in the map
        Student searchStudent = new Student("Alice", 1, "A");
        boolean contains = studentMap.containsKey(searchStudent);
        System.out.println("Contains Alice? " + contains);

        // Get the Student associated with a student
        Student pairedStudent = studentMap.get(searchStudent);
        System.out.println("Student associated with Alice: " + pairedStudent);

        // Remove a student from the map
        studentMap.remove(searchStudent);
        System.out.println("After removing Alice: " + studentMap);

        // Iterate over the map entries
        System.out.println("Iterating over map entries:");
        for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Get the size of the map
        int size = studentMap.size();
        System.out.println("Size of the map: " + size);

        // Clear the map
        studentMap.clear();
        System.out.println("After clearing the map: " + studentMap);

    }
}
