package com.demo.study.java8.jdk8;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SecureRandomDemo {
	private static final List<Integer> list = new ArrayList<>();
	static{
		IntStream.rangeClosed('0','9').forEach(list::add);
		IntStream.rangeClosed('A','Z').forEach(list::add);
		IntStream.rangeClosed('a','z').forEach(list::add);
		IntStream.rangeClosed('!','*').forEach(list::add);
	}
	public static void main(String[] args) {
		int passwordLength = 8;
		for(int i=0;i<6;i++){
			new SecureRandom().ints(passwordLength, 0, list.size()).map(list::get).forEach(s->System.out.print((char)s));		
			System.out.println("");
		}
	}

}
