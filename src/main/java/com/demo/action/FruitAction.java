package com.demo.action;

import com.demo.dao.impl.FruitDaoImpl;
import com.demo.entity.Fruit;

import java.sql.SQLException;
import java.util.List;

public class FruitAction extends BaseAction{
    private List<Fruit> fruits;
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
    public String findAll(){
        try {
            fruits = fruitDao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.SUCCESS;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }
    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public Fruit getFruit() {
        return fruit;
    }
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
