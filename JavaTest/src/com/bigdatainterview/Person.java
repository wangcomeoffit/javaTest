package com.bigdatainterview;

public class Person {

    private String name;
    private int id;

    public Person(){};

    public Person(String name, int age) {
        this.name = name;
        this.id = id;
    }

    public Person(String name) {
        this.name = name;

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
}
