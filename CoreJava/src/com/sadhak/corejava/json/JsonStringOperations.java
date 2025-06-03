package com.sadhak.corejava.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringOperations {
    private final ObjectMapper objectMapper = new ObjectMapper();

    // Convert Object to JSON String
    public String convertObjectToJsonString(Student object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Convert JSON String to Object
    public <T> T convertJsonStringToObject(String jsonString, Class<T> valueType) {
        try {
            return objectMapper.readValue(jsonString, valueType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
