package com.demo.study.java8.jdk8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;

public class ThenCombineTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->{
			return "Hello";
		}, executor);
		
		CompletableFuture<String> f2 = CompletableFuture.supplyAsync(()->{
			return "World";
		}, executor);
		//等待f1和f2执行完成后处理
		CompletableFuture<String> f3 = f1.thenCombine(f2, new BiFunction<String,String,String>(){

			@Override
			public String apply(String t, String u) {
				return t.concat(u);
			}
			
		});
		try {
			System.out.println(f3.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
