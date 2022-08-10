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
 * @date 2022/8/11 - 0:46
 * @Description Session会话跟踪技术
 */
public class Demo02Servlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取Session，如果获取不到，则创建一个新的
        HttpSession session = request.getSession();
        System.out.println("Session ID = " + session.getId());
    }
}
