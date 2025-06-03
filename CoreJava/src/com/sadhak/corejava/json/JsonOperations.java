package com.sadhak.corejava.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonOperations {

    private final ObjectMapper objectMapper = new ObjectMapper();

    // Function to write a Student object to a JSON file
    public void writeTOJsonFile(Student student) {
        try {
            objectMapper.writeValue(new File("student_jackson.json"), student);
            System.out.println("JSON written to file student_jackson.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to read a JSON file and convert it to a Student object
    public void readFromJsonFile() {
        try {
            Student student = objectMapper.readValue(new File("student_jackson.json"), Student.class);
            System.out.println("Read JSON and converted to object:");
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
