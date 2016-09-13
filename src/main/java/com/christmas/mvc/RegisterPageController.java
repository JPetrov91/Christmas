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
            User user = new User();
            String userLogin = request.getParameter("login");
            String userPassword = request.getParameter("password");
            String userFirstName = request.getParameter("firstname");
            String userLastName = request.getParameter("lastname");
            String userEmail = request.getParameter("email");
            user.setLogin(userLogin);
            user.setPassword(userPassword);
            user.setFirstName(userFirstName);
            user.setLastName(userLastName);
            user.setEmail(userEmail);
            userDAO.create(user);
            System.out.println("Succesful");
            return new MVCModel("data", "index.jsp");
        } catch (Exception e) {
            System.out.println("Exception with user creating");
        }
        return new MVCModel("data", "index.jsp");
    }
}
