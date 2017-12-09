package com.demo.study.java8.jdk8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;
/**
 * thenApply转换和作用于，将多个future组合在一起
 * @author yaokai
 *
 */
public class ThenApplyTest {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(new Supplier<String>(){

			@Override
			public String get() {
				String str = "zero";
				System.out.println(str+"#"+Thread.currentThread().getName());
				return str;
			}
			
		}, executor);
		
		CompletableFuture<Integer> cf2 = cf1.thenApplyAsync(new Function<String,Integer>(){

			@Override
			public Integer apply(String t) {
				Integer len = Integer.valueOf(t.length());
				System.out.println(len+"#"+Thread.currentThread().getName());
				return len;
			}
			
		},executor);
		
		CompletableFuture<Double> cf3 = cf2.thenApplyAsync(r->r*2.0, executor);
		try {
			System.out.println(cf3.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
