package com.demo.study.java8.jdk8.clock;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ClockDemo {
   public static void main(String[] args) {
//	   IClockInjector clockInjector = new SystemDefaultZoneInjector();
//	   IProcessClock processClock = clockInjector.getDemoClockInstance();
//	   processClock.process(LocalDate.MAX);
//	   
//	   clockInjector = new SystemUTCInjector();
//	   processClock = clockInjector.getDemoClockInstance();
//	   processClock.process(LocalDate.now());
	   Duration duration = Duration.of(2, ChronoUnit.SECONDS);
	   System.out.println(Duration.ofHours(1).getSeconds());
	   System.out.println(Duration.ofDays(1).getSeconds());
   }
} 