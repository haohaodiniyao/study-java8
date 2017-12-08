package com.demo.study.java8.jdk8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StreamSorted {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "BBBB");
		map.put(2, "AAAA");
		map.put(3, "CCCC");
		System.out.println("---Sort by Map Value---");
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
		.forEach(e->System.out.println("Key:"+e.getKey()+",Value:"+e.getValue()));
	}

}
