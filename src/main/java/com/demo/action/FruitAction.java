package com.demo.action;

import com.demo.entity.Fruit;
import com.demo.service.impl.FruitServiceImpl;

import java.util.List;

public class FruitAction extends BaseAction{
    private int Id;
    private List<Fruit> fruits;
    private Fruit fruit;
    private FruitServiceImpl fruitService = new FruitServiceImpl();
    private String name;
    private String password;


    public String update() {
        fruitService.update(fruit);
        return this.SUCCESS;
    }

    public String deleteById() {
        fruitService.deleteById(Id);
        return this.SUCCESS;
    }

    public String add() {
        fruitService.add(fruit);
        return this.SUCCESS;
    }

    public String findById(){
        fruit = fruitService.findById(Id);
        return this.SUCCESS;
    }

    public String findAll(){
        fruits = fruitService.findAll();
        return this.SUCCESS;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
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
