package com.assign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Response</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; max-width: 600px; margin: 50px auto; padding: 20px; text-align: center; }");
        out.println(".weak { color: red; font-size: 20px; }");
        out.println(".success { color: green; font-size: 20px; }");
        out.println("a { display: inline-block; margin-top: 20px; text-decoration: none; color: #4CAF50; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        
        if (password.length() < 8) {
            out.println("<p class='weak'>Hello " + username + ", your password is weak. Try a strong one.</p>");
        } else {
            out.println("<p class='success'>Welcome " + username + "</p>");
        }
        
        out.println("<a href='login.html'>← Back to Login</a>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
}