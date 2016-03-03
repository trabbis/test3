package com.multithread.suspend.resume.stopping;

//Suspend, resume, and stop a thread.
//This class provides its own means of suspending,
//resuming, and stopping a thread.
class MyThread implements Runnable {
	Thread thrd;
	private volatile boolean suspended;
	private volatile boolean stopped;
	MyThread(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	
	
//	Run the thread.
	public void run() {


		System.out.println(thrd.getName() + " starting.");
		try {
			for(int i = 1; i < 1000; i++) {
//				Display periods.
				System.out.print(".");
				Thread.sleep(250);

//				Use synchronized block to suspend or stop.
				synchronized(this) {
//					If suspended is true, then wait until
//					notified. Then, recheck suspended.
//					The suspended variable is set to true
//					by a call to mySuspend(). It is set to
//					false by a call to myResume().
					while(suspended) wait();
//					If thread is stopped, exit the loop and
//					let the thread end. The stopped variable is
//					set to true by a call to myStop().
					if(stopped) break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println("\n" + thrd.getName() + " exiting.");
	}
//	Stop the thread.
	synchronized void myStop() {
		stopped = true;
//		The following lets a suspended thread be stopped.
		suspended = false;
		notify();
	}
//	Suspend the thread.
	synchronized void mySuspend() {
		suspended = true;
	}
//	Resume the thread.
	synchronized void myResume() {
		suspended = false;
		notify();
	}
}


