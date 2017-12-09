package com.demo.study.java8.jdk8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
public class ListToMapWithSupplier {
	public static void main(String[] args) {
		//List to Map with Key Mapper, Value Mapper, Merge Function and Map Supplier 
		List<Person2> list = new ArrayList<>();
		list.add(new Person2(100, "Mohan"));
		list.add(new Person2(100, "Sohan"));
		list.add(new Person2(300, "Mahesh"));
		LinkedHashMap<Integer, String> map = list.stream()
				.collect(Collectors.toMap(Person2::getId, Person2::getName, 
						(x, y) -> x+", "+ y, LinkedHashMap::new));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}
} 