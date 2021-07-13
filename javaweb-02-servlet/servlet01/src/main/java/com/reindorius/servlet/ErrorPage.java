package com.reindorius.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>\n" +
                "    <head>\n" +
                "        <title>Error</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h2>404 NOT FOUND</h2>\n" + "<div>CAN NOT RESOLVE THE RESOURCES REQUESTED</div>" +
                "    </body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
