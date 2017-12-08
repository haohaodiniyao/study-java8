package com.demo.study.java8.jdk8;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo1 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		Arrays.stream(array).reduce((x,y)->x+y).ifPresent(s->System.out.println(s));
		Arrays.stream(array).reduce(Integer::sum).ifPresent(s->System.out.println(s));
		Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(s->System.out.println(s));
		
		System.out.println("------");
		int startValue = 10;
		int sum1 = Arrays.stream(array).reduce(startValue,(x,y)->x+y);
		int sum2 = Arrays.stream(array).reduce(startValue,Integer::sum);
		int sum3 = Arrays.stream(array).reduce(startValue,StatisticsUtility::addIntData);
		System.out.println("sum1:"+sum1+",sum2:"+sum2+",sum3:"+sum3);
		
		System.out.println("------");
		//Here result will be 2*1 + 2*2 + 2*3 + 2*4 that is 18
		List<Integer> list = Arrays.asList(2,3,4);
		int res = list.parallelStream().reduce(2, (s1,s2)-> s1*s2,(p,q)->p+q);
		System.out.println("res:"+res);
		List<String> list1 = Arrays.asList("tom","grace","jack");
		String result = list1.parallelStream().reduce("#", (s1,s2)-> s1+s2,(p,q)->p+q);
		System.out.println("result:"+result);
	}

}
