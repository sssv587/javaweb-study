package com.futurebytedance.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/15 - 0:18
 * @Description
 */
@WebServlet(urlPatterns = "/demo01",
        initParams = {
                @WebInitParam(name = "hello", value = "world"),
                @WebInitParam(name = "uname", value = "jim")
        })
public class Demo01Servlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        ServletConfig config = getServletConfig();
        String parameter = config.getInitParameter("hello");
        System.out.println("hello " + parameter);

        ServletContext servletContext = getServletContext();
        String configLocation = servletContext.getInitParameter("contextConfigLocation");
        System.out.println(configLocation);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().getServletContext();
    }
}
//Servlet生命周期：实例化、初始化、服务、销毁