package com.demo.study.java8.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(15, "tom");
		map.put(10, "grace");
		map.put(30, "jack");
		System.out.println("sort by map value");
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(e -> System.out.println("key->"+e.getKey()+",value->"+e.getValue()));
		System.out.println("sort by map key");
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e -> System.out.println(e));
		
		Map<Integer,Student> map2 = new HashMap<>();
		map2.put(1, new Student(1,"tom",12));
		map2.put(2, new Student(2,"grace",15));
		map2.put(3, new Student(3,"jack",10));
		//map sorting by value i.e student's natural ording i.e by name
		map2.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
		.forEach(e -> {
			Integer key = (Integer)e.getKey();
			Student s = (Student)e.getValue();
			System.out.println("key->"+key+",value->"+s.toString());
		});
	}

}
