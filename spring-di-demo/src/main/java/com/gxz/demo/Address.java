package com.gxz.demo;

public class Address {
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String desc;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "desc='" + desc + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
