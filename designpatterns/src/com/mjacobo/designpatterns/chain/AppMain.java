package com.mjacobo.designpatterns.chain;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class AppMain {

	private static final int POOL_SIZE = 5;

	public static void main(String[] args) {
		
		// Create child worker thread pool
		// Create a synchronous queue
        /*BlockingQueue<String> queue = new SynchronousQueue<String>();
		for ( int i = 0; i < POOL_SIZE; i++ ) {
		    MyWorker worker = new MyWorker(queue);
		    worker.start();
		}*/
		
		new SyncQueueExample();

	}

}
