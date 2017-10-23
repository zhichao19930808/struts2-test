package com.demo.service.impl;

import com.demo.dao.impl.FruitDaoImpl;
import com.demo.entity.Fruit;
import com.demo.service.FruitService;

import java.sql.SQLException;
import java.util.List;

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
}
