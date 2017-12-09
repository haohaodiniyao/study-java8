package com.demo.study.java8.jdk8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureTest2 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		CompletableFuture<ResponseVO> result = CompletableFuture.supplyAsync(new Supplier<ResponseVO>(){

			@Override
			public ResponseVO get() {
				ResponseVO vo = new ResponseVO(true,"success");
				System.out.println("run#"+vo.toString()+"#"+Thread.currentThread().getName());
				return vo;
			}
			
		}, executor);

		result.exceptionally(new Function<Throwable,ResponseVO>(){

			@Override
			public ResponseVO apply(Throwable t) {
				System.out.println("exceptionally#"+t.getMessage());
				ResponseVO vo = new ResponseVO(false,t.getMessage());
				return vo;
			}
			
		});
		
		result.thenAcceptAsync(new Consumer<ResponseVO>(){

			@Override
			public void accept(ResponseVO t) {
				System.out.println("accept#"+t.toString()+"#"+Thread.currentThread().getName());
			}
			
		},executor);
//		result.completeExceptionally(new Exception("error"));
		System.out.println("over");
	}

}
