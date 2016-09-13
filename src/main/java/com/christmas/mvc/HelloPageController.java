package com.christmas.mvc;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 2016.09.12..
 */
public class HelloPageController implements MVCController {
    @Override
    public MVCModel execute(HttpServletRequest request) {
        System.out.println("In HelloPageController");
        return new MVCModel("Hello", "/hello.jsp");
    }
}
