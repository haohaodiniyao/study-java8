package com.demo.study.java8.jdk8.time;
import java.time.MonthDay;
public class MonthDayDemo {
	public static void main(String[] args) {
		MonthDay mday = MonthDay.now();
		System.out.println(mday.getDayOfMonth());
		System.out.println(mday.getMonth());
		System.out.println(mday.atYear(2014));
	}
} 