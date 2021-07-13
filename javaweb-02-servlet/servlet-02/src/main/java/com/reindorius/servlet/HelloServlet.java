package com.reindorius.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        ServletContext context = this.getServletContext();
        String username = "Reindorius";
        context.setAttribute("username",username);//将一个数据保存在ServletContext里面。名字：username; 值：usernama

        System.out.println("Hello");
        //this.getInitParameter();  initialize parameter
        //this.getServletConfig();  configuration of servlet
        //this.getServletContext()  servlet上下文
    }
}
