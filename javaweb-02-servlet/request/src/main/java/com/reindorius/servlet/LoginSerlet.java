package com.reindorius.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginSerlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] interest = req.getParameterValues("interest");

        resp.getWriter().println(username + "|" + password);
        resp.getWriter().println(Arrays.toString(interest));

        req.getRequestDispatcher("/success.jsp").
                forward(req,resp);
    }
}
