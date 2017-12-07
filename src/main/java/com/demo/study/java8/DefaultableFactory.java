package com.demo.study.java8;

import java.util.function.Supplier;

public interface DefaultableFactory {
	static Defaultable create(Supplier<Defaultable> supplier){
		return supplier.get();
	}
}
