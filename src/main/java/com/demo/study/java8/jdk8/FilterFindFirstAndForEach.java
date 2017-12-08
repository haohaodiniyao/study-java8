package com.demo.study.java8.jdk8;

import java.util.List;

public class FilterFindFirstAndForEach {

	public static void main(String[] args) {
		List<User2> list =User2.getUsers();
		System.out.println("---Using findFirst()---");
		User2 user2 = list.stream().filter(u -> u.getName().endsWith("sh123")).findFirst().orElse(null);
		System.out.println(user2);
	}

}
