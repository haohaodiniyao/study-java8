package com.demo.study.java8.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchElement {

	public static void main(String[] args) {
		Predicate<Integer> p = num -> num % 2 == 0;
		List<Integer> list = Arrays.asList(3,5,6);
		System.out.println("allMatch:"+list.stream().allMatch(p));
		System.out.println("anyMatch:"+list.stream().anyMatch(p));
		System.out.println("noneMatch:"+list.stream().noneMatch(p));
		/**
		 *  allMatch:false
		 *	anyMatch:true
		 *	noneMatch:false
		 */
	}

}
