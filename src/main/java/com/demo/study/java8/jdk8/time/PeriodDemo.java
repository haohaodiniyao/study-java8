package com.demo.study.java8.jdk8.time;
import java.time.LocalDate;
import java.time.Period;
public class PeriodDemo {
	public static void main(String[] args) {
		LocalDate start = LocalDate.now();
		System.out.println("Period.between:"+Period.between(start, LocalDate.MAX).getDays());
		System.out.println("Period.ofDays:"+Period.ofDays(5).getDays());
	}
} 