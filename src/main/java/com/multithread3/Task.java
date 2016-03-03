/**
 * 
 */
package com.multithread3;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Duksun Choi [2015-04-23]
 *
 */
public class Task implements Runnable {
	   private Date date;
	   private String name;

	   public Task(String name) {
	      date = new Date();
	      this.name = name;
	   }

	   public void run() {
		   System.out.printf("Thread: %s Task: %s created on %s\n", Thread.currentThread().getName(), name, date);
		   System.out.printf("Thread: %s Task: %s started on %s\n", Thread.currentThread().getName(), name, new Date());
		   try {
		      Long timeout = ((long) Math.random() * 10);
		      System.out.println(Thread.currentThread().getName()
		         + " with Task name: " + name
		         + " is asleep for " + timeout+ " msec.");
		         TimeUnit.SECONDS.sleep(timeout);
		   } catch (InterruptedException intex) {
		      intex.printStackTrace();
		   }
		   System.out.printf("Thread: %s Task: %s finished on %s\n", Thread.currentThread().getName(), name, new Date());
	   }
	}

