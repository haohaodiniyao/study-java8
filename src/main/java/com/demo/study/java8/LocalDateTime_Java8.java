package com.demo.study.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * java8
 * LocalDate
 * LocalTime
 * LocalDateTime
 * @author yaokai
 *
 */
public class LocalDateTime_Java8 {

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.now();
		//当前日期:2017-11-08
		System.out.println("当前日期:"+localDate1);
		LocalDate localDate2 = LocalDate.of(2017, 11, 8);
		System.out.println("日期:"+localDate2);
		LocalDate localDate3 = LocalDate.parse("2017-11-08", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println("日期:"+localDate3);
		LocalTime localTime1 = LocalTime.now();
		System.out.println("当前时间:"+localTime1);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}

}
