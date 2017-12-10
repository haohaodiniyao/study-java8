package com.demo.study.java8.jdk8;
public interface City {
    void setName(String name);
    void setArea(int area);
    default String getBusinessType(){
        return "Service";
    }
}