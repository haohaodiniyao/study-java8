package com.demo.study.java8.jdk8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class JoiningExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","Shyam","Shiv","Mahesh");
		String result=  list.stream().collect(Collectors.joining(", "));
		System.out.println("Joining Result: "+ result);
	}
} 