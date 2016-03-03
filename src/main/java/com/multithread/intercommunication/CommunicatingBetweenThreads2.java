package com.multithread.intercommunication;

/*
 *  Java supports interthread communication with the wait( ) and notify( ) methods 
 * defined by Object.
 */
public class CommunicatingBetweenThreads2 {

	public static void main(String args[]) {
		try {
			SyncOb sObj = new SyncOb();
//			Construct a thread on sObj that waits for
//			a notification.
			new MyThread4("MyThread4", sObj);
//			Burn some CPU time.
			for(int i=0; i < 10; i++) {
				Thread.sleep(250);
				System.out.print(".");
			}
			System.out.println();
//			The main thread will now notify sObj.
			sObj.goAhead();
//			At this point, MyThread resumes execution.
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
	}
}

class MyThread4 implements Runnable {
	SyncOb syncOb;
	MyThread4(String name, SyncOb so) {
		syncOb = so;
		new Thread(this, name).start();
	}

	public void run() {
		syncOb.waitFor();
	}
}

class SyncOb {
	boolean ready = false;

	//This method waits until it receives notification
	//that the ready variable is true.
	synchronized void waitFor() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " is entering waitFor().");
		System.out.println(thrdName +
				" calling wait() to wait for" +
		" notification to proceed.\n");
		try {
			//Wait for notification.
			while(!ready) wait();
		} catch(InterruptedException exc) {
			System.out.println("Interrupted.");
		}
		System.out.println(thrdName +
				" received notification and is" +
		" resuming execution.");
	}
	
	//This method sets the ready variable to true
	//and then sends a notification.
	synchronized void goAhead() {
		String thrdName = Thread.currentThread().getName();
		System.out.println("\n" + thrdName +
				" thread calling notify() inside goAhead().\n" +
		"This will let MyThread4 resume execution.\n");

		//Set ready and notify.
		ready = true;
		notify();
	}
}



