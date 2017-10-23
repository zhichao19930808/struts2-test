package com.demo.dao;

import com.demo.entity.Fruit;

import java.sql.SQLException;
import java.util.List;

public interface FruitDao {
    void add(Fruit fruit) throws SQLException;

    void deleteById(int id) throws SQLException;

    void update(Fruit fruit) throws SQLException;

    Fruit findById(int id) throws SQLException;
    List<Fruit> findAll() throws SQLException;

}
