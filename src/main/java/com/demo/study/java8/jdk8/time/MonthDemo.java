package com.demo.study.java8.jdk8.time;
import java.time.Month;
public class MonthDemo {
	public static void main(String[] args) {
		System.out.println(Month.MARCH);
		System.out.println(Month.MARCH.getValue());
		System.out.println(Month.of(3));
		System.out.println(Month.valueOf("MARCH"));
	}
} 