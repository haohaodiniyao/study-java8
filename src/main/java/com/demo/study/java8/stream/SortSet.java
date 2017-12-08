package com.demo.study.java8.stream;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SortSet {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1,"tom",12));
		set.add(new Student(2,"grace",15));
		set.add(new Student(3,"jack",10));
		System.out.println("natural sorting by name");
		set.stream().sorted().forEach(e -> System.out.println(e.toString()));
		System.out.println("natural sorting by name in reverse order");
		set.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e.toString()));
		System.out.println("sorting using comparator by age");
		set.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(e -> System.out.println(e.toString()));
	}

}
