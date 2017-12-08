package com.demo.study.java8.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapDemo {

	public static void main(String[] args) {
		List<Person2> list = new ArrayList<Person2>();
		list.add(new Person2(100, "Mohan"));
		list.add(new Person2(200, "Sohan"));
		list.add(new Person2(300, "Mahesh"));
		Map<Integer,String> map = list.stream().collect(Collectors.toMap(Person2::getId, Person2::getName));
		map.forEach((x,y) -> System.out.println("Key:"+x+",Value:"+y));
		
	}

}
