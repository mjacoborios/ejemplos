package com.mjacobo.designpatterns.chain;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SyncQueueExample {
 
	private static final int POOL_SIZE = 1;
	private static final int MAX_Q_SIZE = 10;
	
    public SyncQueueExample() {
        try {
            int workItem = 0;
            // Create a synchronous queue
            //BlockingQueue<String> queue = new SynchronousQueue<String>();
            BlockingQueue<String> queue = new ArrayBlockingQueue<String>(MAX_Q_SIZE);
            
            // Create the child worker thread
            //MyWorker worker = new MyWorker(queue);
            //worker.start();
            
            for ( int i = 0; i < POOL_SIZE; i++ ) {
    		    MyWorker worker = new MyWorker(queue);
    		    worker.start();
    		}
            
 
            // Start sending to the queue
            for ( int j=0; j<1000; j++ ) {
                System.out.println("\nPlacing work on queue");
                String work = "Work Item:" + (++workItem);
                queue.put(work);
            }
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}