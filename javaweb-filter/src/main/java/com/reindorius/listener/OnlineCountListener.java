package com.reindorius.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//统计网站在线人数，即统计Session
public class OnlineCountListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        //创建Session监听，一旦创建Session就会触发这个时间
        ServletContext servletContext = se.getSession().getServletContext();
        System.out.println(se.getSession().getId());
        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");

        if(onlineCount == null) onlineCount = new Integer(1);
        else onlineCount = new Integer(onlineCount.intValue() + 1);

        servletContext.setAttribute("OnlineCount",onlineCount);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        //创建Session监听，一旦销毁Session就会触发这个事件
        ServletContext servletContext = se.getSession().getServletContext();
        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");

        if(onlineCount == null) onlineCount = new Integer(0);
        else onlineCount = new Integer(onlineCount.intValue() - 1);

        servletContext.setAttribute("OnlineCount",onlineCount);

        /**
         * 销毁Session:
         * 1. 手动 se.getSession.invalidate()
         * 2. 自动 在web.xml中配置Session销毁时间
         */
    }
}
