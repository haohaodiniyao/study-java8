package com.demo.study.java8.jdk8.clock;

import java.time.Clock;
import java.time.LocalDate;

public class ProcessClock implements IProcessClock {
	private Clock clock;
	public ProcessClock(Clock clock){
		this.clock = clock;
	}
	@Override
	public void process(LocalDate localDate) {
		if(localDate.isEqual(LocalDate.now(clock))){
			System.out.println(clock.getZone());
		}else{
			System.out.println("Does not Match");
		}
	}

}
