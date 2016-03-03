package com.multithread.intercommunication;

public class SynchronizedMainThread {

	public static void main (String args[]) {
	     Parentheses p3 = new Parentheses();
	     MyThread name1 = new MyThread(p3, "Bob");
	     MyThread name2 = new MyThread(p3, "Mary");
	     try {
	        name1.t.join();
	        name2.t.join();
	     } catch (InterruptedException e ) {
	          System.out.println( "Interrupted");
	     }
	  }
	
}

class MyThread implements Runnable {
	String s1;
	Parentheses p1;
	Thread t;
	public MyThread (Parentheses p2, String s2) {
		p1= p2;
		s1= s2;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		p1.display(s1);
	}
}

class Parentheses {
	//using synchronzied method
	//try with synchronized keyword or without it
	synchronized void display(String s) { 
		System.out.print ("(" + s);
		try {
			Thread.sleep (1000);
		} catch (InterruptedException e) {
			System.out.println ("Interrupted");
		}
		System.out.println(s + ")");
	}
}


