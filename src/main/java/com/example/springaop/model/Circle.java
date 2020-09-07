package com.example.springaop.model;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    private String name="Circle";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter name is called");
        throw (new RuntimeException());
    }

    public String setNameReturn(String name) {
        this.name = name;
        System.out.println("Cicle name is called");
        return name;
    }
}
