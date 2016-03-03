package com.multithread.suspend.resume.stopping;

public class ThreadControlDemo {

	public static void main(String args[]) {
		MyThread mt = new MyThread("MyThread");
		try {
//			Let mt start executing.
			Thread.sleep(3000);

//			Suspend mt.
			System.out.println("\nSuspending MyThread.");
			mt.mySuspend();
			Thread.sleep(3000);
//			Now, resume mt.
			System.out.println("\nResuming MyThread.");
			mt.myResume();
			Thread.sleep(3000);
//			Suspend and resume a second time.
			System.out.println("\nSuspending MyThread again.");
			mt.mySuspend();
			Thread.sleep(3000);
			System.out.println("\nResuming MyThread again.");
			mt.myResume();
			Thread.sleep(3000);
//			Now Stop the thread.
			System.out.println("\nStopping thread.");
			mt.myStop();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
	}
	
	
}