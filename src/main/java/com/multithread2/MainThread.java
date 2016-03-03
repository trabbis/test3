package com.multithread2;

public class MainThread {

	public static void main(String[] args) {
		
		Runnable hello = new DisplayMessageThread("Hello");
		Thread thread1 = new Thread(hello);
		//If defined as Daemon thread, then it finishes when main thread finishes
		thread1.setDaemon(true);
		thread1.setName("hello");
		System.out.println("Starting hello thread...");
		thread1.start();

		Runnable bye = new DisplayMessageThread("Goodbye");
		Thread thread2 = new Thread(bye);
		//Less priority, so I don't see this thread execution much
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setDaemon(true);
		System.out.println("Starting goodbye thread...");
		thread2.start();

		System.out.println("Starting thread3...");
		Thread thread3 = new GuessANumberThread(27);
		thread3.start();
		try {
			//this main thread will wait until thread3 finishes.
			thread3.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		
		System.out.println("Starting thread4...");
		Thread thread4 = new GuessANumberThread(75);
		thread4.start();
		
		System.out.println("main() is ending...");
		
	}
	
	
}
