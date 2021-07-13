package com.reindorius.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo01 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        System.out.print("This is ServletDemo01");
        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/gp");//转发的请求路径
        requestDispatcher.forward(req,resp);//调用forward方法进行转发
    }
}
