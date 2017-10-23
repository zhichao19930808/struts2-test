package com.demo.action;

import com.demo.entity.Fruit;
import com.demo.service.impl.FruitServiceImpl;

import java.util.List;

public class FruitAction extends BaseAction{
    private int Id;
    private List<Fruit> fruits;
    private Fruit fruit;
    private FruitServiceImpl fruitService = new FruitServiceImpl();





    public String update() {
        fruitService.update(fruit);
        return null;
    }

    public String deleteById() {
        fruitService.deleteById(Id);
        return null;
    }

    public String add() {
        fruitService.add(fruit);
        return null;
    }

    public String findById(){
        fruit = fruitService.findById(1);
        return this.SUCCESS;
    }

    public String findAll(){
        fruits = fruitService.findAll();
        return this.SUCCESS;
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
