package com.demo.study.java8.jdk8;
public class Location implements Village, City {
    public int noOfPeople;
    public String name;
     public int area;
    @Override
    public void setNumOfPeople(int n){
        this.noOfPeople = n;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void setArea(int area){
        this.area = area; 
    }
    @Override
    public String getBusinessType(){
        return "People do business like Farming and Service.";
    }
    public int getLocationId(){
        return Village.getVillageId();
    }
}