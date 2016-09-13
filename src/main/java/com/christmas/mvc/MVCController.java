package com.christmas.mvc;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 2016.09.12..
 */
public interface MVCController {

    MVCModel execute(HttpServletRequest request);
}
