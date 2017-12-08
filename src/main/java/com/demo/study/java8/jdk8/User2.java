package com.demo.study.java8.jdk8;

import java.util.ArrayList;
import java.util.List;

public class User2 {
	private int id;
	private String name;
	private int age;
	public User2(int id, String name, int age) {
		this.id = id; 
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static List<User2> getUsers() {
		List<User2> list = new ArrayList<>();
		list.add(new User2(1, "Dinesh", 20));
		list.add(new User2(2, "Kamal", 15));
		list.add(new User2(3, "Vijay", 25));
		list.add(new User2(4, "Ramesh", 30));
		list.add(new User2(5, "Mahesh", 18));
		return list;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
