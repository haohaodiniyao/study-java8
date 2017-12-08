package com.demo.study.java8.jdk8;

import java.util.List;

public class FilterAndReduce {

	public static void main(String[] args) {
		List<User2> list = User2.getUsers();
		list.stream().filter(u->u.getName().endsWith("sh"))
		.mapToInt(u -> u.getAge()).reduce((a,b) -> a+b)
		.ifPresent(s -> System.out.println(s));
	}

}
