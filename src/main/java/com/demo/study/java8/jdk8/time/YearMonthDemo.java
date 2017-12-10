package com.demo.study.java8.jdk8.time;
import java.time.YearMonth;
public class YearMonthDemo {
	public static void main(String[] args) {
		System.out.println("YearMonth.now():"+YearMonth.now());
		System.out.println("getMonthValue():"+YearMonth.parse("2014-09").getMonthValue());		
		System.out.println("getYear():"+YearMonth.parse("2014-09").getYear());
		System.out.println("isLeapYear():"+YearMonth.parse("2014-09").isLeapYear());		
	}
} 