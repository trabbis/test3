package com.multithread.synchronizedemo;

public class Prompter {

	int delay;
	
	Prompter(int d) {
		if (d <= 0) d = 1;
		delay = d;
	}

	synchronized void display(String msg) {
		
		for(int i=0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
			
			if(Character.isWhitespace(msg.charAt(i))) {
				
				try {
					Thread.sleep(delay * 1000);
				} catch(InterruptedException e) {
					return;
				}
			}
		}
		System.out.println();
	}
	
}
