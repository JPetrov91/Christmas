package com.christmas.servlet;

import com.christmas.database.DBConnector;
import com.christmas.database.UserDAO;
import com.christmas.database.UserDAOImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by User on 2016.08.18..
 */
@WebServlet(name = "Validation")
public class Validation extends HttpServlet {
    public UserDAO userDAO = new UserDAOImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String user_login, user_password;
        user_login = request.getParameter("user_login").toString();
        user_password = request.getParameter("user_password").toString();

        try {
            boolean isAuthorizationSuccesful = userDAO.validate(user_login, user_password);
            if (isAuthorizationSuccesful) {
                HttpSession httpSession = request.getSession();
                System.out.println("succesful");
                Cookie cookie = new Cookie("user", user_login);
                cookie.setMaxAge(5*60);
                response.addCookie(cookie);
                System.out.println("cookies added");
                response.sendRedirect(response.encodeRedirectURL("userHome.jsp"));
            } else {
                System.out.println("error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
