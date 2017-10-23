package com.demo.action;

import com.demo.dao.impl.FruitDaoImpl;
import com.demo.entity.Fruit;

import java.sql.SQLException;

public class FruitAction extends BaseAction{
    private Fruit fruit;
    private FruitDaoImpl fruitDao = new FruitDaoImpl();
    public String findById(){
        try {
            fruit = fruitDao.findById(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.SUCCESS;
    }

    public Fruit getFruit() {
        return fruit;
    }
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
