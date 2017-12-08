package com.demo.study.java8.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.study.java8.stream.Student;

public class ListToAnotherList {

	public static void main(String[] args) {
		Person p1 = new Person(1,"tom","student");
		Person p2 = new Person(2,"grace","teacher");
		Person p3 = new Person(3,"jack","student");
		List<Person> personList = Arrays.asList(p1,p2,p3);
		List<Student> stdList = personList.stream().filter(p -> p.getPersonType().equals("student"))
				.map(p -> new Student(p.getId(),p.getName()))
		.collect(Collectors.toList());
		stdList.forEach(e->System.out.println(e));
	}

}
