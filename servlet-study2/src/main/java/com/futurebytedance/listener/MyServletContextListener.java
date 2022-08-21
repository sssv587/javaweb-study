package com.futurebytedance.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/21 - 23:45
 * @Description
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servlet上下文对象初始化动作被我监听到了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servlet上下文销毁动作被我监听到了");
    }
}
