package com.sadhak.procedures;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DBConnection.getConnection();
            CallableStatement cstmt = conn.prepareCall("{call GetHighIncomeProfessors()}");
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Name") + ", Salary: " + rs.getDouble("Salary"));
            }

            rs.close();
            cstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
