package com.sadhak.corejava.jdbc;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create an instance of StudentDAO
        StudentDAO dao = new StudentDAO();

        // Insert a student
        // Student student = new Student(2, "Devangana Barua", 91.5);
        // dao.insertStudent(student);

        // Insert
        dao.insertStudent(new Student(3, "Aryan", 88.0));

        // Update
        dao.updateStudent(new Student(3, "Aryan Singh", 91.0));

        // Fetch a student by ID
        Student fetchedStudent = dao.getStudentById(3);
        if (fetchedStudent != null) {
            System.out.println("Fetched Student: " + fetchedStudent);
        } else {
            System.out.println("Student not found.");
        }

        // Delete a student by ID
        dao.deleteStudent(3);

        // Fetch and display all students
        List<Student> students = dao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
