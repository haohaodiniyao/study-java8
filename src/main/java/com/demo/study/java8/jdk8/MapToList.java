package com.demo.study.java8.jdk8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(111, "Lalkrishna");
		map.put(154, "Atal");		
		map.put(30, "Narendra");
		map.put(200, "Amit");
		List<User> list = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).map(e-> new User(e.getKey(),e.getValue())).collect(Collectors.toList());
		list.forEach(l -> System.out.println(l));
	}

}
