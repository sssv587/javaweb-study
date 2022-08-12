package com.futurebytedance.dao.impl;

import com.futurebytedance.dao.FruitDAO;
import com.futurebytedance.dao.base.BaseDAO;
import com.futurebytedance.pojo.Fruit;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {
    @Override
    public List<Fruit> getFruitList() {
        return super.executeQuery("select * from t_fruit");
    }
}
