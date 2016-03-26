package com.multithread0;

public class StartRunDemo {
	
	public static void main(String[] str) {
		
		Thread test1 = new Thread(new Task("start thread testing..."));
		Thread test2 = new Thread(new Task("run thread testing..."));
		
		test1.start(); //this is creating new thread
		test2.run(); //in the current thread. like calling just another method
		
		
		
	}

	private static class Task implements Runnable {

		private String caller = "";
		public Task(String caller) {
			this.caller = caller;
		}
		
		public void run() {
			System.out.println(caller + "," + Thread.currentThread().getName());
			
		}
		
	}
}
