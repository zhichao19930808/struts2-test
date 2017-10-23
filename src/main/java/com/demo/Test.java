package com.demo;

import com.demo.dao.impl.FruitDaoImpl;
import com.demo.entity.Fruit;

import java.sql.Date;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        FruitDaoImpl fruitDao = new FruitDaoImpl();

        Fruit fruit = new Fruit("苹果","苹果",new Date(System.currentTimeMillis()));
        Fruit fruit2 = new Fruit(1,"国光苹果","苹果",new Date(System.currentTimeMillis()));
        try {
            //增加
//            fruitDao.add(fruit);
            //删除
//            fruitDao.delete(2);
           //修改
//            fruitDao.update(fruit2);
            //查询
            Fruit fruit3 =fruitDao.findById(1);
            System.out.println(fruit3.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
