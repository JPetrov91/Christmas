package com.christmas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by User on 2016.09.06..
 */
@WebServlet(name = "Logout")
public class Logout extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie exCookie = null;
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession(false);
        String userId = null;
        if (session != null) {
            session.invalidate();
        }
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    exCookie = cookie;
                }
                if (cookie.getName().equals("JSESSIONID")) {
                    System.out.println(cookie.getValue());
                }
            }
        }

        if (exCookie != null) {
            exCookie.setMaxAge(0);
            response.addCookie(exCookie);
        }
        response.sendRedirect("index.jsp");
    }
}
