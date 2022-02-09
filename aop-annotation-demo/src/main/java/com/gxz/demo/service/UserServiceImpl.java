package com.gxz.demo.service;

import org.springframework.stereotype.Component;

public class UserServiceImpl implements UserService{
    @Override
    public int add() {
        System.out.println("新增用户");
        return 1;
    }

    @Override
    public void delete() {
        System.out.println("删除 用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void select() {
        System.out.println("查询用户");
    }
}
