package com.reindorius.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PdfFile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //to be complete
        String pdfPath = "F:\\JAVA_CODE\\JavawebLearning\\javaweb-02-servlet\\response\\src\\main\\resources\\algcomp.pdf";

        FileInputStream in = new FileInputStream(pdfPath);
        OutputStream out = resp.getOutputStream();

        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition","inline; filename=" + pdfPath);

        byte[] buffer = new byte[320000];
        int len = 0;

        while((len=in.read(buffer))>0)
        {
            out.write(buffer,0,len);
        }
        in.close();
        out.flush();
        out.close();
    }
}
