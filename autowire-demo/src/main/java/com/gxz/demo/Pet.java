package com.gxz.demo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Pet {
    @Autowired
    private Dog dog;


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "dog=" + dog +
                '}';
    }
}
