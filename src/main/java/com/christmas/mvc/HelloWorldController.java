package com.christmas.mvc;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 2016.09.12..
 */
public class HelloWorldController implements MVCController {

    public MVCModel execute(HttpServletRequest request) {
        return new MVCModel("Hello from MVC", "/helloWorld.jsp");
    }

}
