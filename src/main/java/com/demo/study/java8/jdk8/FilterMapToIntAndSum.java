package com.demo.study.java8.jdk8;

import java.util.List;

public class FilterMapToIntAndSum {

	public static void main(String[] args) {
		List<User2> list = User2.getUsers();
		System.out.println("--- Sum of age between the user id 2 and 4 --");
		int sum = list.stream().filter(u->u.getId() >= 2 && u.getId() <=4)
				.mapToInt(u -> u.getAge()).sum();
		System.out.println("Sum:"+sum);
	}

}
