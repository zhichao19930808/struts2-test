package com.demo.service;

import com.demo.entity.Fruit;

import java.sql.SQLException;
import java.util.List;

public interface FruitService {
    void add(Fruit fruit);

    void deleteById(int id);

    void update(Fruit fruit);

    Fruit findById(int id);
    List<Fruit> findAll();
}
