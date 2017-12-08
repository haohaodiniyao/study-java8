package com.demo.study.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"tom",12));
		list.add(new Student(2,"grace",15));
		list.add(new Student(3,"jack",10));
		System.out.println("natural sorting by name");
		List<Student> slist = list.stream().sorted().collect(Collectors.toList());
		slist.forEach(e -> System.out.println(e.toString()));
		System.out.println("natural sorting by name in reverse order");
		slist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println(e.toString()));
		System.out.println("sorting using comparator by age");
		slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println(e.toString()));
	}

}
