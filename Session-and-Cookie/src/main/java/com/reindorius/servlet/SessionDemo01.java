package com.reindorius.servlet;

import com.reindorius.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到乱码信息
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到session
        HttpSession session = req.getSession();

        //在session中存储东西
        session.setAttribute("name",new Person("Reindorius",25));

        //obtain id
        String id = session.getId();

        //check if the session is newly created
        if(session.isNew())
        {
            resp.getWriter().write("Session is successfully created.\nID: " + id);
        }
        else resp.getWriter().write("Session " + id + " already exists");
    }
}
