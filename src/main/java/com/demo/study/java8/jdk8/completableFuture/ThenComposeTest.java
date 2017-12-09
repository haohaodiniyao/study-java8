package com.demo.study.java8.jdk8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * thenApply
 * thenCompose
 * 区别
 * @author yaokai
 *
 */
public class ThenComposeTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->{
			return "zero";
		}, executor);
		
		CompletableFuture<CompletableFuture<String>> f4 = f1.thenApply(ThenComposeTest::calculate);
		//区别
		System.out.println(f4.get().get());
		
		CompletableFuture<String> f5 = f1.thenCompose(ThenComposeTest::calculate);
		System.out.println(f5.get());
	}
	
	public static CompletableFuture<String> calculate(String input){
		ExecutorService executor = Executors.newFixedThreadPool(5);
		CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
			System.out.println(input);
			return input+"--"+input.length();
		},executor);
		return future;
	}

}
