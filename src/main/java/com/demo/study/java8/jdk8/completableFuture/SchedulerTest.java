package com.demo.study.java8.jdk8.completableFuture;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SchedulerTest {
	private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);
	private static <T> CompletableFuture<T> failAfter(Duration duration){
		final CompletableFuture<T> promise = new CompletableFuture<>();
		scheduler.schedule(()-> {
			final TimeoutException ex = new TimeoutException("Timeout after " + duration);
			return promise.completeExceptionally(ex);
		}, duration.toMillis(), TimeUnit.MILLISECONDS);
		return promise;
	}
	public static void main(String[] args) {
		CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->{
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "hello world";
		});
		
		failAfter(Duration.ofSeconds(2)).acceptEither(f1, (x)->{
			System.out.println(x);
		}).exceptionally(throwable -> {
			System.out.println(throwable.getMessage());
			return null;
		});
	}

}
