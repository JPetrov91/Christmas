package com.christmas.mvc;

/**
 * Created by User on 2016.09.12..
 */
public class MVCModel {

    private Object data;
    private String viewName;

    public MVCModel(Object data, String viewName) {
        this.data = data;
        this.viewName = viewName;
    }

    public Object getData() {
        return data;
    }

    public String getViewName() {
        return viewName;
    }
}
