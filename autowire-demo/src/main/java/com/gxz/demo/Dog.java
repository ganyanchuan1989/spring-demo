package com.gxz.demo;

import org.springframework.beans.factory.annotation.Value;

public class Dog {
    @Value("旺财2")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
