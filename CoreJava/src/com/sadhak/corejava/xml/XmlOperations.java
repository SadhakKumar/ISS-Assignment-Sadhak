package com.sadhak.corejava.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class XmlOperations {

    private static final String FILE_NAME = "student_jaxb.xml";

    // Convert Student object to XML and write to file
    public void writeToXml(Student student) {
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // pretty-print
            marshaller.marshal(student, new File(FILE_NAME));
            System.out.println("Written to " + FILE_NAME);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    // Read XML from file and convert to Student object
    public void readFromXml() {
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Student student = (Student) unmarshaller.unmarshal(new File(FILE_NAME));
            System.out.println("Read from XML:");
            System.out.println(student);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
