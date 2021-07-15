package com.reindorius.servlet;

import com.reindorius.util.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

public class LogourServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //思考：注销就销毁目前Session，但是实际开发中不建议如此，可以考虑移出”USER_SESSION“
        //Object userSession = req.getSession().getAttribute(Constant.USER_SESSION);
        String[] sessions = req.getSession().getValueNames();

        for(String ss : sessions)
        {
            if(req.getSession().getAttribute(ss) != null)
            {
                req.getSession().removeAttribute(ss);
                resp.sendRedirect("/login.jsp");
            }
        }
    }
}
