package com.futurebytedacne.servletcore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/12 - 22:24
 * @Description 演示服务器内部转发以及客户端重定向
 */
public class Demo05Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo05.....");
        //服务器内部转发
//        request.getRequestDispatcher("demo06").forward(request, response);
        //客户端重定向
        response.sendRedirect("demo06");
    }
}
