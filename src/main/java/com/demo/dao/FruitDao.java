package com.demo.dao;

import com.demo.entity.Fruit;

import java.sql.SQLException;

public interface FruitDao {
    void add(Fruit fruit) throws SQLException;

    void delete(int id) throws SQLException;

    void update(Fruit fruit) throws SQLException;

    Fruit findById(int id) throws SQLException;

}
