package com.reindorius.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //告诉服务器你来的时间，并将这个时间封装成一个信件。下次访问服务器的时候带上这个信件，服务器就知道是你了

        //解决中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();

        //Cookie是服务器端从客户端获取
        Cookie[] cookies = req.getCookies();//可能有多个Cookie

        //判断cookie是否存在
        if(cookies!=null)
        {
            //不是第一次访问
            out.write("The last time you visit:");
            for(Cookie cookie : cookies)
            {
                if("lastLogin".equals(cookie.getName()))
                {
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }
            }
        }
        else
        {
            out.write("First timer");
            //这里很有可能不会展示，因为还有其他cookie
        }

        //服务器给客户端响应一个Cookie
        Cookie cookie = new Cookie("lastLogin",System.currentTimeMillis()+"");
        resp.addCookie(cookie);
    }
}
