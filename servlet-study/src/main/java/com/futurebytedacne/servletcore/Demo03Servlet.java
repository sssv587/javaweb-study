package com.futurebytedacne.servletcore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/12 - 21:52
 * @Description 演示向HttpSession保存数据
 */
public class Demo03Servlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("uname","lina");
    }
}
