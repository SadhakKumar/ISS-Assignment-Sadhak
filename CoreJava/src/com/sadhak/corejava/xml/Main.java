package com.sadhak.corejava.xml;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Sadhak Kumar", 94.7);

        XmlOperations ops = new XmlOperations();

        // Write to XML
        ops.writeToXml(student);

        // Read back from XML
        ops.readFromXml();
    }
}
