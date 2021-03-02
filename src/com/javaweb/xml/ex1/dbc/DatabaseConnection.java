package com.javaweb.xml.ex1.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author coderliaolong@outlook.com
 * @date 2021/3/2 22:35
 */
public class DatabaseConnection {
    private static final String DBDRIVER = "mysql.com.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/mldn";
    private static final String DBUSER = "root";
    private static final String PASSWORD = "lllovezy";
    private Connection conn = null;

    public DatabaseConnection(){
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            this.conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.conn;
    }

    public void close(){
        if (this.conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
