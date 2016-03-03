package com.multithread.wait.notify;

public class ThreadComDemo {

	public static void main(String args[]) {
		try {
			SyncOb sObj = new SyncOb();
//			Construct a thread on sObj that waits for
//			a notification.
			new MyThread("MyThread", sObj);
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
