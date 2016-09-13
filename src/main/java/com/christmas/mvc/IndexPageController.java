package com.christmas.mvc;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 2016.09.12..
 */
public class IndexPageController implements MVCController {
    @Override
    public MVCModel execute(HttpServletRequest request) {
        return new MVCModel(null, "/index1.jsp");
    }
}
