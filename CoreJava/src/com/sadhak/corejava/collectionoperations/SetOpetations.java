package com.sadhak.corejava.collectionoperations;

import java.util.HashSet;
import java.util.Set;

public class SetOpetations {

    public void performSetOperations() {
        // Example of set operations
        // Create a set, add elements, remove elements, check for existence, etc.
        // This is a placeholder for actual set operations code
        System.out.println("Performing set operations...");

        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");

        System.out.println("Set after adding elements: " + mySet);

        mySet.remove("Banana");
        System.out.println("Set after removing 'Banana': " + mySet);

        boolean containsApple = mySet.contains("Apple");
        System.out.println("Does the set contain 'Apple'? " + containsApple);
    }
}
