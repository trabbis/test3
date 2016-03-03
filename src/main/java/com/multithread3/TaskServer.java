/**
 * 
 */
package com.multithread3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Duksun Choi [2015-04-23]
 *
 */

public class TaskServer {
	   private ThreadPoolExecutor threadPoolExecutor;

	   public TaskServer() {
	      threadPoolExecutor = (ThreadPoolExecutor) Executors
	          .newCachedThreadPool();
	   }
	   public void execute(Task task){
	      threadPoolExecutor.execute(task);
	      System.out.println("Pool size of the Server: "
	      +threadPoolExecutor.getPoolSize());
	      System.out.println("Active Task count: "
	      +threadPoolExecutor.getActiveCount());
	      System.out.println("Task Completed count: "
	      +threadPoolExecutor.getCompletedTaskCount());
	   }

	   public void close(){
	      threadPoolExecutor.shutdown();
	   }
	}

