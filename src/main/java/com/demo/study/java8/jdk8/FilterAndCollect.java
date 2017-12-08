package com.demo.study.java8.jdk8;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {

	public static void main(String[] args) {
		List<User2> list = User2.getUsers();
		long count = list.stream().filter(u->u.getName().endsWith("sh"))
		.collect(Collectors.counting());
		System.out.println("count:"+count);
	}

}
