package com.christmas.database;

import com.christmas.businesslogic.User;

import java.util.List;

/**
 * Created by User on 2016.09.12..
 */
public interface UserDAO {

    void create(User user) throws DBException;

    User getById(Long id) throws DBException;

    void delete(Long id) throws DBException;

    void update(User user) throws DBException;

    List<User> getAll() throws DBException;

    boolean validate(String login, String password) throws DBException;

}