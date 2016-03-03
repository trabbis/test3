package com.multithread.synchronizedemo;

public class UsePrompter implements Runnable {

	Prompter prompter;
	String message;
	
	public UsePrompter(Prompter p, String msg) {
		prompter = p;
		message = msg;
		
		new Thread(this).start();
	}
	
	public void run() {
		prompter.display(message);
	}

	

}
