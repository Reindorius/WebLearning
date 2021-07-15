package com.reindorius.servlet;

import com.reindorius.util.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前段请求的参数
        String username = req.getParameter("username");

        if("Admin".equals(username))
        {
            //登录成功，将用户信息放入Session
            req.getSession().setAttribute(Constant.USER_SESSION,req.getSession().getId());
            resp.sendRedirect("/sys/main.jsp");
        }
        else if("vip1".equals(username))
        {
            req.getSession().setAttribute("vip1",Constant.vip1);
            resp.sendRedirect("/sys/VIP1/vip1.jsp");
        }
        else if("vip2".equals(username))
        {
            req.getSession().setAttribute("vip2",Constant.vip1);
            resp.sendRedirect("/sys/VIP2/vip2.jsp");
        }
        else if("vip3".equals(username))
        {
            req.getSession().setAttribute("vip3",Constant.vip1);
            resp.sendRedirect("/sys/VIP3/vip3.jsp");
        }
        else
        {
            //登录失败，重定向至错误页面
            resp.sendRedirect("/error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
