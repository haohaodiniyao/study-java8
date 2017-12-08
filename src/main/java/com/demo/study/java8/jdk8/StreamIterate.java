package com.demo.study.java8.jdk8;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.iterate(1,n -> n*2).limit(5);
		stream.forEach(s->System.out.println(s));
	}

}
