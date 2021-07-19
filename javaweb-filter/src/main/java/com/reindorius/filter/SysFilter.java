package com.reindorius.filter;

import com.reindorius.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements javax.servlet.Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //注意：ServletRequest和HttpservletRequest不一样
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;

        if(request1.getSession().getAttribute(Constant.USER_SESSION)==null) {
            response1.sendRedirect("/error.jsp");
        }


        chain.doFilter(request1,response1);
    }
}
