package com.reindorius.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncoding implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //在filter内设置请求和返回的character encoding
        //chain意味着可以有多个过滤器
        /**
         * 1. 过滤中的所有代码，在过滤特定请求的时候都会被执行
         *  2. 必须要让过滤器继续 chain.doFilter(request,response)
         */
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        System.out.print("CharacterEncoding执行前。。。\n");
        chain.doFilter(request,response);//让我们的请求继续，否则程序会停止，request和response不会向下转接
        System.out.print("CharacterEncoding执行hou。。。\n");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //Initialize character encoding[2021-07-15 02:01:44,687] Artifact javaweb-filter:war exploded: Artifact is deployed successfully
        //Filter is initialized on deployment of web server
        //可以在初始化的时候加入监听日志
        System.out.print("Initialize character encoding");
    }

    @Override
    public void destroy() {
        System.gc();
        System.out.print("Filter destroyed");
    }
}
