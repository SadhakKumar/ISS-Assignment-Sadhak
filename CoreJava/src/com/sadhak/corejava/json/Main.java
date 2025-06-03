package com.sadhak.corejava.json;

public class Main {
    public static void main(String[] args) {

        // Create a Student object
        Student student = new Student(1, "Sadhak Kumar", 85.5);

        // Create an instance of JsonOperations
        JsonOperations jsonOperations = new JsonOperations();

        // Write the Student object to a JSON file
        jsonOperations.writeTOJsonFile(student);

        // Read the JSON file and convert it back to a Student object
        jsonOperations.readFromJsonFile();

        // String operations on JSON

        JsonStringOperations jsonStringOperations = new JsonStringOperations();

        // Convert Student object to JSON String
        String jsonString = jsonStringOperations.convertObjectToJsonString(student);
        System.out.println("JSON String: " + jsonString);

        // Convert JSON String back to Student object
        Student studentFromJson = jsonStringOperations.convertJsonStringToObject(jsonString, Student.class);
        System.out.println("Converted back to Student object: " + studentFromJson);

    }
}
