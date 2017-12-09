package com.demo.study.java8.jdk8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CompletableFutureTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
//		Future<String> result = executor.submit(()->{
//			System.out.println("---"+Thread.currentThread().getName());
//			return "hello";
//		});
//		try {
		    //阻塞
//			System.out.println(result.get());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		}
		
		CompletableFuture<String> result = CompletableFuture.supplyAsync(new Supplier<String>(){

			@Override
			public String get() {
				System.out.println("hello---"+Thread.currentThread().getName()+"---");
				return "hello";
			}
			
		}, executor);
//		try {
//			//阻塞
//			System.out.println(result.get());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//completable回调函数 (1)在同一个线程中完成
		System.out.println(result.thenAccept(new Consumer<String>(){

			@Override
			public void accept(String t) {
				System.out.println("result:"+t+"---"+Thread.currentThread().getName());
			}
			
		}));
		//在不同线程中回调 thenAcceptAsync使用ForkJoinPool.commonPool
		System.out.println(result.thenAcceptAsync(new Consumer<String>(){

			@Override
			public void accept(String t) {
				System.out.println("result:"+t+"---"+Thread.currentThread().getName());				
			}
			
		}, executor));
	}

}
