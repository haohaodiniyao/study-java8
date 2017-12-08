package com.demo.study.java8.jdk8;

public class User {
	private int d;
	private String name;
	public User(int d, String name) {
		this.d = d;
		this.name = name;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [d=" + d + ", name=" + name + "]";
	}
	
}
