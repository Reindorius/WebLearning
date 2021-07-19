package com.reindorius.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC02 {
    @Test
    public void Test() throws Exception{
        String url = "jdbc:mysql://localhost:3306/db01?useUnicode=true&" +
                "characterEncoding=gbk&useSSL=false ";
        String username = "root";
        String password = "Auto0000";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url,username,password);
            //disable auto commit
            connection.setAutoCommit(false);

            String sql1 = "update sal_grade set losal = losal - 100 where grade=1";
            connection.prepareStatement(sql1).executeUpdate();

            //manually create error
            //int i = 1/0;//DivisionByZero exception
            String sql2 = "update sal_grade set losal = losal + 100 where grade=1";
            connection.prepareStatement(sql2).executeUpdate();

            connection.commit();
            System.out.println("SUCCESS");
        }
        catch (Exception e)
        {
            try {
                connection.rollback();
            }
            catch (SQLException e1)
            {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        finally {
            try
            {
                connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            catch (NullPointerException ne)
            {
                ne.printStackTrace();
            }
        }
    }
}
