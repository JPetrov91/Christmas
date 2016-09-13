package com.christmas.servlet;

import com.christmas.businesslogic.User;
import com.christmas.database.DBConnector;
import com.christmas.database.DBException;
import com.christmas.database.UserDAO;
import com.christmas.database.UserDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by User on 2016.08.24..
 */
@WebServlet(name = "Register")
public class Register extends HttpServlet {
    public UserDAO userDAO = new UserDAOImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String user_login, user_password, user_firstname, user_lastname, user_email;
        User user = new User();
        user_login = request.getParameter("user_login").toString();
        user_password = request.getParameter("user_password").toString();
        user_firstname = request.getParameter("user_firstname".toString());
        user_lastname = request.getParameter("user_lastname".toString());
        user_email = request.getParameter("user_email").toString();
        user.setLogin(user_login);
        user.setPassword(user_password);
        user.setFirstName(user_firstname);
        user.setLastName(user_lastname);
        user.setEmail(user_email);
        try {
            userDAO.create(user);
        } catch (DBException e) {
            e.printStackTrace();
        }

        //Connection connection = DBConnector.connectDb();

//        try {
//            String sql = "insert into Users(user_login, user_password, user_firstname, user_lastname, user_email) values('"+user_login+"', '"+user_password+"', '"+user_firstname+"', '"+user_lastname+"', '"+user_email+"')";
//            PreparedStatement pst = connection.prepareStatement(sql);
//            pst.execute();
//            out.println("Регистрация завершена");
//
//        } catch (Exception e) {
//            out.println(e);
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                out.println(e);
//            }
//        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
