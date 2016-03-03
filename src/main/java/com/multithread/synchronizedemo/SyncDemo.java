package com.multithread.synchronizedemo;

public class SyncDemo {
	
	public static void main(String args[]) {
		
		Prompter p = new Prompter(1);
		
		//Construct two threads that use p. Thus, both threads
		//will attempt to use p at the same time. However, because
		//display() is synchronized, only one at a time can use p.
		UsePrompter promptA = new UsePrompter(p, "One Two Three Four");
		UsePrompter promptB = new UsePrompter(p, "AAA BBB CCC DDD");
		
	}

}
