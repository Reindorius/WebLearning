package com.reindorius.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1. 获取下载文件的路径
            String realpath = "F:\\JAVA_CODE\\JavawebLearning\\javaweb-02-servlet\\response\\src\\main\\resources\\alexander_prime.png";
            System.out.print("Path: " + realpath);
//        2. 下载的文件名？
            String fileName = realpath.substring(realpath.lastIndexOf(File.separator)+1);
//        3. 设置想办法让浏览器能支持下载的东西
        fileName = URLEncoder.encode(fileName,"UTF-8");//in case the file name is non-English
        resp.setHeader("Content-Disposition","attachment;filename="+fileName);
//        4. 获取下载文件的输入流
        FileInputStream in = new FileInputStream(realpath);
//        5. 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[3200000];
//        6. 获取OutputStream对象
        ServletOutputStream servletOutputStream = resp.getOutputStream();
//        7. 讲FileOutputStream流写入buffer缓冲区
        while((len=in.read(buffer))>0)
        {
            servletOutputStream.write(buffer,0,len);
        }
        in.close();
        servletOutputStream.close();
//        8. 使用OutputStream将缓冲区中的数据输入到客户端

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
