package com.gxz.demo.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class User {
    private String name;
    private String pwd;
    private int sex;
    private int age;
    private Date birth;
    private BigDecimal salary;
}
