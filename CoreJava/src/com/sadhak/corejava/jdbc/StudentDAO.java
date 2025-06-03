package com.sadhak.corejava.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // Function to insert a student
    public void insertStudent(Student student) {
        String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setDouble(3, student.getMarks());
            stmt.executeUpdate();

            System.out.println("Student inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Function to fetch all students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection conn = DBConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("marks"));
                students.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    // Function to fetch a student by ID
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("marks"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Function to update a student
    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getName());
            stmt.setDouble(2, student.getMarks());
            stmt.setInt(3, student.getId());

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Function to delete a student
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
