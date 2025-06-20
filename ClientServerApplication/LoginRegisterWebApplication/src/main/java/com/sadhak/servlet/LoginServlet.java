package main.java.com.sadhak.servlet;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private Connection databaseConnection;

    public void init() {
        databaseConnection = DBConnection.getConnection();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve email and password from the request
        String userEmail = request.getParameter("email");
        String userPassword = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            if (databaseConnection == null) {
                out.println("<h3>Database connection not available</h3>");
                return;
            }

            String sqlQuery = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement pst = databaseConnection.prepareStatement(sqlQuery);
            pst.setString(1, userEmail);
            pst.setString(2, userPassword);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Valid login
                HttpSession session = request.getSession();
                session.setAttribute("user", userEmail);
                response.sendRedirect("welcome.jsp");
            } else {
                // Invalid credentials
                request.setAttribute("error", "Invalid email or password.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

            rs.close();
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
