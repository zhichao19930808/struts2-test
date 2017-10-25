package com.demo.service.impl;

import com.demo.dao.impl.FruitDaoImpl;
import com.demo.entity.Fruit;
import com.demo.service.FruitService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FruitServiceImpl implements FruitService {
    private FruitDaoImpl fruitDao = new FruitDaoImpl();

    @Override
    public void add(Fruit fruit) {
        try {
            fruitDao.add(fruit);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        try {
            fruitDao.deleteById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Fruit fruit) {
        try {
            fruitDao.update(fruit);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Fruit findById(int id) {
        try {
            return fruitDao.findById(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Fruit> findAll(){
        try {
            return fruitDao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<Fruit> findByCondition(Fruit fruit) {
        List<Fruit> fruits = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM db_test.db_fruit WHERE 1=1 ");
        if (fruit.getName() != null && !Objects.equals(fruit.getName(), "")) {
            sql.append("AND name LIKE '%").append(fruit.getName()).append("%' ");
        }
        if (fruit.getKind() != null && !Objects.equals(fruit.getKind(), "")) {
            sql.append("AND kind LIKE '%").append(fruit.getKind()).append("%' ");
        }
        if (fruit.getTime() != null) {
            sql.append("AND time LIKE '%").append(fruit.getTime()).append("%' ");
        }
        try {
            fruits=fruitDao.find(sql.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(sql.toString());
        return fruits;
    }
}
