package com.demo.entity;

import java.sql.Date;

public class Fruit {
    private int id;
    private String name;
    private String kind;
    private Date time;

    public Fruit() {
    }

    public Fruit(String name, String kind, Date time) {
        this.name = name;
        this.kind = kind;
        this.time = time;
    }

    public Fruit(int id, String name, String kind, Date time) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
