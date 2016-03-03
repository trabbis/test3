package com.multithread.intercommunication;

public class SuspendResumeThread {
	
	public static void main (String args [] ) {
		MyThread3 t1 = new MyThread3();
		try{
			Thread.sleep(1000);
			t1.suspendThread();
			System.out.println("Thread: Suspended");
			
			Thread.sleep(1000);
			t1.resumeThread();
			System.out.println("Thread: Resume");
		} catch ( InterruptedException e) {
		}
		
		try {
			t1.t.join();
		} catch ( InterruptedException e) {
			System.out.println (
					"Main Thread: interrupted");
		}
		
	}
}


class MyThread3 implements Runnable {
	String name;
	Thread t;
	boolean suspended;
	MyThread3() {
		t = new Thread(this, "Thread");
		suspended = false ;
		t.start();
	}
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread: " + i );  
				Thread.sleep(200);
				synchronized (this) {
					while (suspended) {
						wait();
					}
				}
			}
		} catch (InterruptedException e ) {
			System.out.println("Thread: interrupted.");
		}
		System.out.println("Thread exiting.");
	}
	
	void suspendThread() {
		suspended = true;
	}
	synchronized void resumeThread() {
		suspended = false;
		notify();
	}
}
