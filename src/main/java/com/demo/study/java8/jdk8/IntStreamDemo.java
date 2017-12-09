package com.demo.study.java8.jdk8;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		System.out.println("IntStream.rangeClosed");
		IntStream.rangeClosed(1,3).map(n->n*n).forEach(s->System.out.println(s));
		System.out.println("IntStream.range");
		IntStream.range(1, 3).map(n->n*n).forEach(s->System.out.println(s));
		System.out.println("sum:"+IntStream.range(1, 3).sum());
		IntStream.of(13,4,15,2,8).sorted().forEach(s->System.out.println(s));
		
		//
		System.out.println("max:"+DoubleStream.of(1.1,1.2,1.3).max().getAsDouble());
		DoublePredicate range = d -> d > 1.1 && d < 1.3;
		DoubleStream.of(1.1,1.2,1.3).filter(range).forEach(d->System.out.println(d));
		
		
	}

}
