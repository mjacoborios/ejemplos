package com.banorte.pff.dummydata;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class CounterSingleton {
	private AtomicLong atomicLong;
	private static CounterSingleton obj = null;
	
	private CounterSingleton(long initialValue){
		this.atomicLong = new AtomicLong(initialValue); 
	}

	public static CounterSingleton getInstance(long initialValue){
		if(obj == null){
			obj = new CounterSingleton(initialValue);
		}
		return obj;
	}

	public long getCounter() {
		return atomicLong.getAndIncrement();
	}   
}
