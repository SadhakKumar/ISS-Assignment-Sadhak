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

    private Connection conn;

    public void init() {
        conn = DBConnection.getConnection();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            if (conn == null) {
                out.println("<h3>Database connection not available</h3>");
                return;
            }

            // Check if user already exists
            String checkSql = "SELECT * FROM users WHERE email = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, email);
            ResultSet checkRs = checkStmt.executeQuery();

            if (checkRs.next()) {
                request.setAttribute("error", "User already exists. Please login.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                return;
            }

            // Register user
            String insertSql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(insertSql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, password);

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
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
