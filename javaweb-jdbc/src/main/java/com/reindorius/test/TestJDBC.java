package com.reindorius.test;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //configuration
        String url = "jdbc:mysql://localhost:3306/db01?useUnicode=true&" +
                "characterEncoding=gbk&useSSL=false ";
        String username = "root";
        String password = "Auto0000";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();
        String sql = "select * from emp";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next())
        {
            System.out.println(resultSet.getObject("hiredate").toString());
        }
        //先创建的最后关闭
        resultSet.close();
        statement.close();
        connection.close();
    }
}
