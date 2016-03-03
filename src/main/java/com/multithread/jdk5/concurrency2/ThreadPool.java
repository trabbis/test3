package com.multithread.jdk5.concurrency2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args)
    {
        /*
         * create a thread pool with four threads
         */

        ExecutorService execSvc = Executors.newFixedThreadPool( 4 );

        /*
         * place six tasks in the work queue for the thread pool
         */

        for( int i = 0; i < 6; i++ )
            execSvc.execute( new CountDown() );

        /*
         * prevent other tasks from being added to the queue
         */
        execSvc.shutdown();
    }
	
}
