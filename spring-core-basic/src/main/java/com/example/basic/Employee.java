package com.example.basic;

public class Employee {

    private int id;
    private String name;

    public Employee() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(id);
        System.out.println(name);
    }
}
