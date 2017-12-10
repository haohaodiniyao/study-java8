package com.demo.study.java8.jdk8.time;
import java.time.OffsetDateTime;
public class OffsetDateTimeDemo {
	public static void main(String[] args) {
		OffsetDateTime offsetDT = OffsetDateTime.now();
		System.out.println(offsetDT.getDayOfMonth());
		System.out.println(offsetDT.getDayOfYear());
		System.out.println(offsetDT.getDayOfWeek());
		System.out.println(offsetDT.toLocalDate());
	}
} 