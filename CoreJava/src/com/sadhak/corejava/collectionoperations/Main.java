package com.sadhak.corejava.collectionoperations;

public class Main {
    public static void main(String[] args) {

        // List operations
        ListOperations listOperations = new ListOperations();
        listOperations.performListOperations();
        System.out.println("List operations completed.");
        listOperations.sortListUsingComparator();
        System.out.println("List sorted using comparator.");

        // Set operations
        SetOpetations setOperations = new SetOpetations();
        setOperations.performSetOperations();
        System.out.println("Set operations completed.");

        // Map operations
        MapOperations mapOperations = new MapOperations();
        mapOperations.performMapOperations();
        System.out.println("Map operations completed.");

    }
}
