<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial;
            background: #e9ecef;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .box {
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            width: 320px;
            text-align: center;
        }
        .logout-button {
            margin-top: 20px;
            padding: 10px 20px;
            background: #dc3545;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <%
        String user = (session != null) ? (String) session.getAttribute("user") : null;
        if (user == null) {
            response.sendRedirect("index.jsp");
            return;
        }
    %>
    <div class="box">
        <h2>Welcome, <%= user %>!</h2>
        <a class="logout-button" href="logout">Logout</a>
    </div>
</body>
</html>
