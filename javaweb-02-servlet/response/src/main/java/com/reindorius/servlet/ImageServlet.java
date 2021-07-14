package com.reindorius.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //如何让浏览器5S自动刷新一次
        resp.setContentType("text/html;charset=utf-8");
        //resp.setHeader("refresh", "5; url=http://localhost:8081/file/pdf");
        resp.setHeader("refresh","3");

        //在内存中创建一个图片
        BufferedImage bufferedImage = new BufferedImage(200,80,BufferedImage.TYPE_INT_RGB);
        //得到图片，好比在画图软件中画图
        Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
        //set background color
        g.setColor(Color.pink);
        g.fillRect(100,40,160,60);
        //write data to the image
        g.setColor(Color.blue);
        g.setFont(new Font(null,Font.BOLD,25));
        g.drawString(randNum(),100,40);

        //tell the browser the open the image
        resp.setContentType("image/jpg");
        //A webpage may have cache. Disable it
        resp.setDateHeader("Expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");

        //write the image to the webpage
        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());
    }

    public String randNum()
    {
        Random random = new Random();
        String num = random.nextInt(99999999) + ""; //appending an empty string makes it a String

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 7-num.length();i++)
        {
            sb.append("0");
        }
        String s = sb.toString() + num;
        /**
         * random.nextInt(99999999) may not always generate an 8-digit integer
         * Appending an appropriate number of "0"s makes s always 8-digit
         */
        return s;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
