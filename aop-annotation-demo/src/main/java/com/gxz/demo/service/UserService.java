package com.gxz.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public int add();
    public void delete();
    public void update();
    public void select();
}
