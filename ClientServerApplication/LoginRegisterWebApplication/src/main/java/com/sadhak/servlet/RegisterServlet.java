package main.java.com.sadhak.servlet;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private Connection databaseConnection;

    public void init() {
        databaseConnection = DBConnection.getConnection();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve user details from the request
        String userName = request.getParameter("name");
        String userEmail = request.getParameter("email");
        String userPassword = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            if (databaseConnection == null) {
                out.println("<h3>Database connection not available</h3>");
                return;
            }

            // Check if user already exists
            String checkSql = "SELECT * FROM users WHERE email = ?";
            PreparedStatement checkStmt = databaseConnection.prepareStatement(checkSql);
            checkStmt.setString(1, userEmail);
            ResultSet checkRs = checkStmt.executeQuery();

            if (checkRs.next()) {
                request.setAttribute("error", "User already exists. Please login.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                return;
            }

            // Register user
            String insertSql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement pst = databaseConnection.prepareStatement(insertSql);
            pst.setString(1, userName);
            pst.setString(2, userEmail);
            pst.setString(3, userPassword);

            int rowsInserted = pst.executeUpdate();

            if (rowsInserted > 0) {
                response.sendRedirect("index.jsp");
            } else {
                out.println("<h3>Failed to register user</h3>");
            }

            checkRs.close();
            checkStmt.close();
            pst.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Something went wrong!</h3>");
        }
    }

    @Override
    public void destroy() {
        try {
            if (databaseConnection != null)
                databaseConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
