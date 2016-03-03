package com.multithread.wait.notify;

public class MyThread implements Runnable {

	SyncOb syncOb;
//	Construct a new thread.
	MyThread(String name, SyncOb so) {
		syncOb = so;
		new Thread(this, name).start();
	}
//	Begin execution of the thread.
	public void run() {
		syncOb.waitFor();
	}


}
