package com.mjacobo.designpatterns.chain;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class MyWorker extends Thread {
	private static final int MIN_VALUE = 10;
	private static final int MAX_VALUE = 80;

	private final BlockingQueue<String> queue;

	public MyWorker(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while ( true ) {
				String s = queue.take();
				doWork(s);
			}
		}
		catch ( InterruptedException ie ) { 
			// just terminate
		}
	}

	private void doWork(String s) {
		System.out.println("\n" + Thread.currentThread().getName() +" - Processing work: " + s);
		Random random = new Random();
		long myRandomNumber = random.nextInt(MAX_VALUE - MIN_VALUE) + MIN_VALUE;
		try {
			Thread.sleep(myRandomNumber);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}