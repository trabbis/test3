package com.multithread.wait.notify;

public class SyncOb {

	boolean ready = false;
	
	
	//1. The wait( ) and notify( ) methods are part of all objects because they are implemented by
	//the Object class. These methods can only be called from within a synchronized method.

	//2. Although wait( ) normally waits until notify( ) or
	//notifyAll( ) is called, there is a possibility that in very rare cases the waiting thread could be
	//awakened due to a spurious wakeup. 
	//Because of this remote possibility, Sun recommends that calls to wait( ) should take place
	//within a loop that checks the condition on which the thread is waiting. (here, used ready variable)
	
	// This method waits until it receives notification
	//that the ready variable is true.
	synchronized void waitFor() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " is entering waitFor().");
		System.out.println(thrdName +
				" calling wait() to wait for" +
		" notification to proceed.\n");
		try {
//			Wait for notification.
			while(!ready) wait();
		} catch(InterruptedException exc) {
			System.out.println("Interrupted.");
		}
		System.out.println(thrdName +
				" received notification and is" +
		" resuming execution.");
	}
	
	
//	This method sets the ready variable to true
//	and then sends a notification.
	synchronized void goAhead() {
		String thrdName = Thread.currentThread().getName();
		System.out.println("\n" + thrdName +
				" thread calling notify() inside goAhead().\n" +
		"This will let MyThread resume execution.\n");

//		Set ready and notify.
		ready = true;
		notify();
	}
	
	
}

