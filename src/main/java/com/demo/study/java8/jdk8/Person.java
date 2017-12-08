package com.demo.study.java8.jdk8;

public class Person {
	private int id;
	private String name;
	private String personType;
	public Person(int id, String name, String personType) {
		this.id = id;
		this.name = name;
		this.personType = personType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", personType=" + personType + "]";
	}
	
}
