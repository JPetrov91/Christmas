package com.christmas.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by User on 2016.08.18..
 */
public class DBConnector {
        final static String URL = "jdbc:mysql://localhost:3306/testdatabase";
        final static String USERNAME = "root";
        final static String PASSWORD = "root";
        public static Connection connectDb() {
            Connection conn = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                if (!conn.isClosed()) {
                    System.out.println("Соединение с БД установлено");
                } else {
                    System.out.println("Нет соединение с БД");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return conn;
        }
    }
