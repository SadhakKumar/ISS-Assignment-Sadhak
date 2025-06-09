package main.java.com.sadhak;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.*;

@WebServlet("/hello") // Annotation mapping
public class HelloServlet extends HttpServlet {

    // Serial version UID for serialization
    // This is used to ensure that a loaded class corresponds to a serialized object
    private static final long serialVersionUID = 1L;

    public void init() throws ServletException {
        // Initialization code, if needed
        System.out.println("HelloServlet initialized");
    }

    // Handles GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Write response
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from Servlet!</h1>");
    }

    public void destroy() {
        // Cleanup code
        System.out.println("HelloServlet destroyed");
    }
}
