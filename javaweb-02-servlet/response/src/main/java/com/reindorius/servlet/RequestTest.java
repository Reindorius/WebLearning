package com.reindorius.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //process request
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.getWriter().print("<html><body><h2>" + username + "|" + password + "</h2></body></html>");
    }
}
