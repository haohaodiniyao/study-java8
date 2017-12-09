package com.demo.study.java8.jdk8.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureOneExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().map(data -> CompletableFuture.supplyAsync(()->getNum(data))).map(compFuture->compFuture.thenApply(n->n*n)).map(t->t.join())
		.forEach(s->System.out.println(s));
	}
	private static int getNum(int a){
		System.out.println(Thread.currentThread().getName());
		return a*a;
	}
}
