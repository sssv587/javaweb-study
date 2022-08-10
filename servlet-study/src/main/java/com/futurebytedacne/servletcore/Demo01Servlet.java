package com.futurebytedacne.servletcore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/10 - 23:07
 * @Description 演示Servlet的生命周期
 */
public class Demo01Servlet extends HttpServlet {
    public Demo01Servlet() {
        System.out.println("正在实例化...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("正在初始化...");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("正在服务...");
    }

    @Override
    public void destroy() {
        System.out.println("正在销毁...");
    }
}
