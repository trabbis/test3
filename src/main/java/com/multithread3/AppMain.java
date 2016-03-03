/**
 * 
 */
package com.multithread3;

/**
 * @author Duksun Choi [2015-04-23]
 *
 */


	public class AppMain {

	   public static void main(String[] args) {
	      TaskServer server = new TaskServer();
	      for (int i = 0; i < 50; i++) {
	         Task task = new Task("Task " + i);
	         server.execute(task);
	      }
	      server.close();
	   }
	}
	
