package com.demo.study.java8.jdk8.completableFuture;

import java.util.function.Function;

import com.demo.study.java8.jdk8.Book;

public class FunctionApplyTest {

	public static void main(String[] args) {
		Book bk = new Book("core java",101);
		Function<Book,String> fn = s->s.getName()+","+s.getPrice();
		System.out.println(bk.customShow(fn));
	}

}
