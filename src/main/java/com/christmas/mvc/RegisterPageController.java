package com.christmas.mvc;

import com.christmas.businesslogic.User;
import com.christmas.database.UserDAO;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 2016.09.12..
 */
public class RegisterPageController implements MVCController {

    public UserDAO userDAO;


    @Override
    public MVCModel execute(HttpServletRequest request) {
        try {
            System.out.println("in register controller");
            User user = new User();
            String userLogin = request.getParameter("user_login");
            String userPassword = request.getParameter("user_password");
            String userFirstName = request.getParameter("user_firstname");
            String userLastName = request.getParameter("user_lastname");
            String userEmail = request.getParameter("user_email");
            user.setLogin(userLogin);
            user.setPassword(userPassword);
            user.setFirstName(userFirstName);
            user.setLastName(userLastName);
            user.setEmail(userEmail);
            userDAO.create(user);
            System.out.println("Succesful");
        } catch (Exception e) {
            System.out.println("Exception with user creating");
        }
        return new MVCModel("model", "index.jsp");
    }
}
