package com.demo.study.java8.jdk8.clock;
import java.time.Clock;
public class SystemDefaultZoneInjector implements IClockInjector {
	@Override
	public IProcessClock getDemoClockInstance() {
		return new ProcessClock(Clock.systemDefaultZone()); 
	}
} 