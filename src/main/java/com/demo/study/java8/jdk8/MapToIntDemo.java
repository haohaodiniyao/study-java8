package com.demo.study.java8.jdk8;

import java.util.Arrays;
import java.util.List;

public class MapToIntDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,20);
		Employee e2 = new Employee(2,15);
		Employee e3 = new Employee(3,30);
		List<Employee> list = Arrays.asList(e1,e2,e3);
		int sum = list.stream().mapToInt(e->e.getAge()).sum();
		System.out.println("Sum:"+sum);
	}

}
