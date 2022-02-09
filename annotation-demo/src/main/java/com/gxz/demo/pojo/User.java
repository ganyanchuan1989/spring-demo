package com.gxz.demo.pojo;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="user2") // value 等同于<bean/> 中的id
@Scope(value="singleton")
public class User {
    @Value("hello")
    private String name;
    @Property
    private List<String> likes;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
