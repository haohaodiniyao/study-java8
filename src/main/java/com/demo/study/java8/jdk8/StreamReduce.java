package com.demo.study.java8.jdk8;

import java.util.Arrays;

public class StreamReduce {

	public static void main(String[] args) {
		int[] array = {3,5,10,15};
		int sum = Arrays.stream(array).reduce(0, (x,y)->x+y);
		System.out.println("Sum:"+sum);
	}

}
