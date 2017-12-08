package com.demo.study.java8.jdk8;

import java.util.Arrays;

public class StreamFlatMap {

	public static void main(String[] args) {
		Integer[][] data = {{1,2},{3,4},{5,6}};
		Arrays.stream(data).flatMap(row -> Arrays.stream(row)).filter(num -> num%2 == 1).forEach(s -> System.out.println(s));
	}

}
