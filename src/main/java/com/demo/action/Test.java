package com.demo.action;

import com.demo.entity.User;

public class Test extends BaseAction{
    //获取网页传来的参数
    //通过private获取，需要写get方法
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //通过public获取，不需要写get方法
    public String address;
    public String password;

    //通过实体类获取，需要写实体类的get，set方法
    private User user;
    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }

    //验证是否获取
    //******************************************************************************
    public String saveName() {
        System.out.println(name);
        return SUCCESS;
    }

    public String saveAddress() {
        System.out.println(address);
        System.out.println(password);
        return SUCCESS;
    }

    public String saveUser() {
        System.out.println(11111111);
        System.out.println(user);
//        System.out.println(user.getName());
//        System.out.println(user.getAddress());
//        System.out.println(user.getPassword());
        return SUCCESS;
    }
}
