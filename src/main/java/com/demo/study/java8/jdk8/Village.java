package com.demo.study.java8.jdk8;
public interface Village {
    void setNumOfPeople(int num);
    void setName(String name);
    static int getVillageId(){
        return 1;
    }
    default String getBusinessType(){
        return "Business type is Farming  and village id:"+getVillageId();
    }
}