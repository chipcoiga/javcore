package com.jav.hoang.AccessToDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class ConnectDB {

    private static String DB_URL = "jdbc:mysql://localhost:3306/hoangdb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";

    public static void main(String[] args) {
        try{
            Connection conn = getConnection(DB_URL,USER_NAME,PASSWORD);
            //create statement
            Statement stmt = conn.createStatement();
            //get data from table student
            ResultSet rs = stmt.executeQuery("select * from hoangdb.infomation ");
            //show data
            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2)
                + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
            }
            //close connection
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
