package com.demo.study.java8.jdk8.time;
import java.time.Year;
public class YearDemo {
	public static void main(String[] args) {
		System.out.println("Year.now():"+Year.now());		
		System.out.println("Year.MAX_VALUE:"+Year.MAX_VALUE);
		System.out.println("Year.isLeap(2014):"+Year.isLeap(2014));
		System.out.println("Year.isLeap(2016):"+Year.isLeap(2016));
	}
} 