package com.demo.study.java8.jdk8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfListDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(i->i+i));
		//1*2 2*2 3*3 4*2
		System.out.println("Sum:"+stats.getAverage());
	}

}
