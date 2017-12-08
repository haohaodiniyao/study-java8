package com.demo.study.java8.jdk8;

import java.util.Arrays;

public class StreamSkip {

	public static void main(String[] args) {
		int[] array = {3,5,10,15};
		Arrays.stream(array).skip(2).forEach(s->System.out.println(s));
	}

}
