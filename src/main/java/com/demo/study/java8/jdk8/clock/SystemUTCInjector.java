package com.demo.study.java8.jdk8.clock;
import java.time.Clock;
public class SystemUTCInjector implements IClockInjector {
	@Override
	public IProcessClock getDemoClockInstance() {
		return new ProcessClock(Clock.systemUTC());
	}
} 