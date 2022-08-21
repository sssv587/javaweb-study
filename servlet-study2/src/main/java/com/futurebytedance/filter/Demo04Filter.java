package com.futurebytedance.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/21 - 16:58
 * @Description
 */
//@WebFilter("/demo02.do")
@WebFilter("*.do")
public class Demo04Filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("C");
        //放行
        filterChain.doFilter(request, response);
        System.out.println("C3");
    }

    @Override
    public void destroy() {
    }
}
