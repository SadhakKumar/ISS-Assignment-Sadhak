package com.sadhak.procedures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/collegedb";
    private static final String USER = "root";
    private static final String PASSWORD = "Natu@123";

    // Function to get a database connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
