package com.futurebytedance.servlet;

import com.futurebytedance.dao.FruitDAO;
import com.futurebytedance.dao.impl.FruitDAOImpl;
import com.futurebytedance.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/8/12 - 22:56
 * @Description
 */
//Servlet从3.0版本开始支持注解方式的注册
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FruitDAO fruitDAO = new FruitDAOImpl();
        List<Fruit> fruitList = fruitDAO.getFruitList();
        //保存到session作用域
        HttpSession session = request.getSession();
        session.setAttribute("fruitList", fruitList);
        //此处的视图名称是index
        //那么thymeleaf会将这个 逻辑视图名称 对应到 物理视图 名称上去
        //逻辑视图名称：index
        //物理视图名称：view-prefix + 逻辑视图名称 + view-suffix
        //所以真实的视图名称是： /index.html
        super.processTemplate("index", request, response);
    }
}
